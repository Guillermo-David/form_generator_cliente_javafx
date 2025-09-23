<p align="center">
  <img src="https://github.com/user-attachments/assets/f86d4e14-c8cc-4659-b1f5-0c551941902b" alt="Logo" width="150"/>
</p>

# Frontend - Generador de Informes

**Autor:** Guillermo David García  
**Licencia:** MIT License

---

## Descripción

Este proyecto es una aplicación de escritorio desarrollada en **JavaFX** con [**Spring Boot** como backend](https://github.com/Guillermo-David/generador_informes_backend). Permite a los usuarios rellenar un formulario y recibir un informe generado en **PDF** (JasperReports o iText) o **Excel** (Apache POI), según la opción seleccionada.  

El proyecto es un ejemplo de integración de un frontend JavaFX con un backend REST, mostrando:  
- Validaciones de formulario.  
- Envío de datos a un API REST.  
- Generación de informes dinámicos en diferentes formatos.  
- Envío de correo con los informes adjuntos.  
- Uso de librerías como JasperReports, iText y Apache POI.  
- ... y otras características interesantes descritas en el [readme del backend](https://github.com/Guillermo-David/generador_informes_backend/blob/master/README.md).

---

## Tecnologías

- Java 21
- JavaFX 21
- Spring Boot 3
- Spring Batch
- JasperReports / iText / Apache POI
- Docker
- RabbitMQ y Postgres en contenedores Docker
- Spring Mail (JavaMailSender)
- Maven para gestión de dependencias
- H2 para pruebas unitarias

---

## Funcionalidades

1. Formulario con campos obligatorios y validaciones.  
2. Elección del tipo de informe a generar: Jasper, iText o Excel.  
3. Generación dinámica de PDF o Excel con los datos del formulario.  
4. Envío automático por email con los informes adjuntos.  
5. Logotipo integrado en el formulario y en los informes.

---

## Instalación y ejecución
Las instrucciones de instalaciópn y ejecución se encuentran en el README.md del [repositorio del backend](https://github.com/Guillermo-David/generador_informes_backend/blob/master/README.md).

## Licencia
Este proyecto está licenciado bajo la MIT License. Puedes usar, copiar, modificar y distribuir este software, siempre conservando la atribución al autor.
