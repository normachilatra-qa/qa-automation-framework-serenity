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
* **Reporte:** Serenity Living Documentation

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
```

---

## 📋 Requisitos Previos

* **JDK:** Java Development Kit 17 o superior.
* **IDE:** IntelliJ IDEA / Eclipse.
* **Build Tool:** Gradle 8.x instalado o usando Gradle Wrapper (`gradlew`).
* **Navegador:** Google Chrome / Firefox actualizado.

---

## ⚙️ Configuración y Ejecución

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/TU-USUARIO/qa-automation-framework-serenity.git
   cd qa-automation-framework-serenity
   ```

2. **Ejecutar pruebas en entorno local:**
   ```bash
   ./gradlew clean test aggregate
   ```

3. **Ejecutar por etiquetas (Tags):**
   ```bash
   ./gradlew test -Dcucumber.filter.tags="@SmokeTest"
   ```

---

## 📊 Reportes y Evidencias

Serenity BDD genera automáticamente reportes interactivos completos tras cada ejecución.

Para abrir el reporte en tu navegador local ejecuta:
```bash
open target/site/serenity/index.html
```
