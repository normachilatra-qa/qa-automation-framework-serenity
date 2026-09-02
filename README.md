# 🧪 Test Automation Framework - E2E Web Testing

![Java](https://img.shields.io/badge/Java-17-orange)
![Serenity BDD](https://img.shields.io/badge/SerenityBDD-4.x-green)
![Cucumber](https://img.shields.io/badge/Cucumber-BDD-brightgreen)
![Gradle](https://img.shields.io/badge/Gradle-8.x-blue)

Framework de automatización de pruebas de extremo a extremo (E2E) diseñado bajo el patrón **Screenplay** utilizando **Java**, **Serenity BDD** y **Cucumber**. Este proyecto demuestra buenas prácticas de arquitectura de software para automatización de pruebas, mantenibilidad, escalabilidad y generación de reportes enriquecidos para partes interesadas.

---

## 🚀 Tecnologías y Herramientas

* **Lenguaje:** Java 17
* **Framework de Automatización:** Serenity BDD + Selenium WebDriver
* **BDD Framework:** Cucumber (Gherkin syntax)
* **Patrón de Diseño:** Screenplay Pattern
* **Gestor de Dependencias y Construcción:** Gradle
* **Reporte:** Serenity Living Documentation / Allure Reports

---

## 🏗️ Arquitectura del Proyecto

El proyecto sigue una estructura limpia modular basada en **Screenplay Pattern**, garantizando desacoplamiento entre los elementos de la interfaz de usuario, las acciones e interacciones:

```text
src
├── main
│   └── java
│       └── com
│           └── qa
│               └── automation
│                   ├── interactions   # Acciones personalizadas de bajo nivel
│                   ├── models         # Modelos de datos y DTOs
│                   ├── questions      # Validaciones y aserciones de negocio
│                   ├── tasks          # Flujos de alto nivel del usuario
│                   ├── userinterfaces # Mapeo de elementos Web (Target)
│                   └── utils          # Clases auxiliares y controladores
└── test
    ├── java
    │   └── com
    │       └── qa
    │           └── automation
    │               ├── runners        # Ejecutadores de Cucumber
    │               └── stepdefinitions# Definiciones de pasos de prueba
    └── resources
        └── features                   # Archivos .feature escritos en Gherkin