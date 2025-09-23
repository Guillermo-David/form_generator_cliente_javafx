package com.generador_informes.frontend;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.generador_informes.frontend.dto.FormDataDto;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FormController {
	
	private final RestTemplate restTemplate;
	private final String apiUrl = "http://localhost:8080/form";

	public FormController() {
	    restTemplate = new RestTemplate();
	    restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
	}
	
    @FXML private TextField nombreField;
    @FXML private TextField emailField;
    @FXML private ComboBox<String> tipoInformeBox;
    @FXML private TextArea comentarioArea;

    @FXML
    public void handleEnviar() {
        String nombre = nombreField.getText();
        String email = emailField.getText();
        String tipoInforme = tipoInformeBox.getValue();
        String comentario = comentarioArea.getText();

        if (nombre == null || nombre.isBlank()) {
            showAlert(Names.ERROR.get(), Names.MENSAJE_NOMBRE_OBLIGATORIO.get());
            return;
        }
        if (email == null || email.isBlank()) {
            showAlert(Names.ERROR.get(), Names.MENSAJE_EMAIL_OBLIGATORIO.get());
            return;
        }
        if (tipoInforme == null || tipoInforme.isBlank()) {
            showAlert(Names.ERROR.get(), Names.MENSAJE_TIPO_INFORME_OBLIGATORIO.get());
            return;
        }

        FormDataDto formData = new FormDataDto(nombre, email, tipoInforme, comentario);

        try {
            restTemplate.postForObject(apiUrl, formData, String.class);
            showAlert(Names.EXITO.get(), Names.MENSAJE_FORMULARIO_ENVIADO.get());
        } catch (Exception e) {
            e.printStackTrace();
            showAlert(Names.ERROR.get(), Names.ALERTA_ENVIO_ERROR.get() + e.getMessage());
        }
    }

    @FXML
    public void initialize() {
        tipoInformeBox.setItems(FXCollections.observableArrayList(Names.JASPER.get(), Names.ITEXT.get(), Names.EXCEL.get()));
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
