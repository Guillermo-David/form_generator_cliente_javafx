<p align="center">
  <img src="https://github.com/user-attachments/assets/127d946f-4042-4ff5-b7ee-1ca181117e8d" alt="Logo" width="150"/>
</p>

# Formulario de Informe JavaFX 

**Autor:** Guillermo David García 

**Licencia:** MIT License 

--- 

## Descripción 
Este proyecto es una aplicación de escritorio desarrollada en **JavaFX** con [**Spring Boot** como backend](https://github.com/Guillermo-David/form_generator_backend/edit/master/README.md). Permite a los usuarios rellenar un formulario y 
recibir un informe generado en **PDF** (JasperReports o iText) o **Excel**, según la opción seleccionada. El proyecto es un ejemplo de integración de un 
frontend JavaFX con un backend REST, mostrando: 
- Validaciones de formulario.
- Envío de datos a un API REST.
- Generación de informes dinámicos en diferentes formatos.
- Envío de correo con los informes adjuntos.
- Uso de librerías como JasperReports, iText y Apache POI.
- ... y otras características interesantes descritas en el [readme del backend](https://github.com/Guillermo-David/form_generator_backend/edit/master/README.md)
--- 

## Tecnologías 
- Java 17+
- JavaFX 21
- Spring Boot 3
- JasperReports
- iText
- Apache POI (Excel)
- Maven para gestión de dependencias

--- 

## Funcionalidades 
1. Formulario con campos obligatorios y validaciones.
2. Elección del tipo de informe a generar: Jasper, iText o Excel.
3. Generación dinámica de PDF o Excel con los datos del formulario.
4. Envío automático por email con los informes adjuntos.
5. Logotipo integrado en el formulario y en los informes.

--- 

## Instalación y ejecución 
1. Clona el repositorio:
```bash
   git clone https://github.com/Guillermo-David/formulario_cliente_javafx.git
```
2. Construye el proyecto con Maven:
```bash
mvn clean install
```
3. Ejecuta la aplicación:
```bash
mvn javafx:run
```

Nota: Asegúrate de tener configurado tu servidor SMTP en el backend para el envío de correos.

---

## Licencia

Este proyecto está licenciado bajo la MIT License. Puedes usar, copiar, modificar y distribuir este software, siempre conservando la atribución al autor.
