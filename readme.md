FirstRestAPI

This repository contains two tasks for learning backend development with Spring Boot.


Task 1 – Basic Setup

Initial setup of a Spring Boot project, including:
- Project structure configuration
- Dependency management with Maven
- Running the application
- Basic REST controller

 Task 2 – Product REST API

Implementation of a complete CRUD REST API for managing products.

 Technologies
- Java
- Spring Boot
- Maven
- H2 Database (in-memory)
- Swagger (OpenAPI)


Features

 Create Product
POST /api/v1/products

Get All Products
GET /api/v1/products

 Get Product by ID
GET /api/v1/products/{id}

 Update Product
PUT /api/v1/products/{id}

 Delete Product
DELETE /api/v1/products/{id}


API Testing

Swagger UI available at:

http://localhost:8080/swagger-ui/index.html

How to Run

1. Open project in IntelliJ
2. Run `FirstRestApiApplication`
3. Open browser:
   http://localhost:8080/swagger-ui/index.html

Project Structure

- Controller → handles HTTP requests
- Service → business logic
- Repository → data storage (in-memory)
- Mapper → converts between DTOs and entities



 Author
Student project for backend development course.