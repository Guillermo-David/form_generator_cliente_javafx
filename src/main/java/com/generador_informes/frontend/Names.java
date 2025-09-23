package com.generador_informes.frontend;

public enum Names {

	FORMULARIO_TITULO("Formulario de Informe"),

	ERROR("Error"),
	EXITO("Éxito"),
	JASPER("Jasper"),
	ITEXT("iText"),
	EXCEL("Excel"),
	
	ALERTA_ENVIO_ERROR("No se pudo enviar el formulario: "), 
	
	MENSAJE_FORMULARIO_ENVIADO("Formulario enviado correctamente.\nEn breve recibirás un correo electrónico con el informe generado."), 
	MENSAJE_NOMBRE_OBLIGATORIO("El campo Nombre es obligatorio."), 
	MENSAJE_EMAIL_OBLIGATORIO("El campo Email es obligatorio."), 
	MENSAJE_TIPO_INFORME_OBLIGATORIO("Debes seleccionar un Tipo de Informe.");
	
    private final String texto;

    Names(String texto) {
        this.texto = texto;
    }

    public String get() {
        return texto;
    }
}