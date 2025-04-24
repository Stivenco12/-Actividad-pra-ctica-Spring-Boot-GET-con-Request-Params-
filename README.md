
# 🧪 Actividad Práctica - Spring Boot: GET con Request Params

Este proyecto es una aplicación básica desarrollada con **Spring Boot** que demuestra cómo utilizar **parámetros de solicitud (`@RequestParam`)** para manejar datos de entrada en controladores REST. Incluye ejemplos relacionados con clientes y productos.

---

## 📁 Estructura del Proyecto

```
Actividad-practica-Spring-Boot-GET-con-Request-Params/
├── mvnw, mvnw.cmd              # Wrappers para ejecutar Maven sin instalación
├── pom.xml                     # Configuración de dependencias y plugins
├── HELP.md                     # Archivo de ayuda proporcionado por Spring Initializr
├── src/
│   ├── main/
│   │   ├── java/com/example/demo/
│   │   │   ├── DemoApplication.java           # Clase principal con método `main`
│   │   │   ├── Controllers/
│   │   │   │   ├── CustomerController.java    # Controlador REST para clientes
│   │   │   │   └── ProductController.java     # Controlador REST para productos
│   │   │   ├── model/
│   │   │   │   ├── Customer.java              # Modelo de datos para cliente
│   │   │   │   └── product.java               # Modelo de datos para producto
│   │   │   └── repository/
│   │   │       ├── CustomerRepository.java    # Simulación de repositorio
│   │   │       └── ProductRepository.java     # Simulación de repositorio
│   │   ├── resources/
│   │   │   ├── application.properties         # Configuración de Spring Boot
│   │   │   ├── static/css/styles.css          # Estilos estáticos
│   │   │   └── templates/index.html           # Página principal Thymeleaf
│   └── test/
│       └── java/com/example/demo/
│           └── DemoApplicationTests.java      # Pruebas unitarias
```

---

## 🚀 ¿Qué hace este proyecto?

- Define endpoints REST en los controladores `CustomerController` y `ProductController`.
- Utiliza `@RequestParam` para recibir parámetros de búsqueda o creación.
- Simula almacenamiento en memoria mediante repositorios personalizados.
- Incluye una interfaz HTML básica para probar los endpoints.

---

## 🛠️ Requisitos

- Java 17+
- Maven 3.8+
- IDE como IntelliJ IDEA, Eclipse o VS Code con soporte para Spring Boot

---

## ▶️ Cómo ejecutar el proyecto

1. Clona el repositorio:

```bash
git clone <url-del-repositorio>
cd Actividad-practica-Spring-Boot-GET-con-Request-Params
```

2. Compila y ejecuta con Maven:

```bash
./mvnw spring-boot:run
```

3. Accede en tu navegador a:

```
http://localhost:8080
```

---

## 🧪 Endpoints de ejemplo

- **GET** `/customer?name=Juan`  
  Devuelve información del cliente llamado "Juan".

- **GET** `/product?category=ropa`  
  Devuelve productos en la categoría "ropa".

---

## ✨ Créditos

Este proyecto fue creado como una actividad práctica para aprender sobre **Request Parameters en Spring Boot**.
