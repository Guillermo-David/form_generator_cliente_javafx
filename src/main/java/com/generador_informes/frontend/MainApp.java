package com.generador_informes.frontend;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    private static final String FORMVIEW_PATH = "/formulario/FormView.fxml";

	@Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(FORMVIEW_PATH));
        Scene scene = new Scene(loader.load(), 400, 400);
        stage.setScene(scene);
        stage.setTitle(Names.FORMULARIO_TITULO.get());
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
