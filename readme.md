# FirstRestAPI

A RESTful API project built with Java and Spring Boot for learning backend development fundamentals and CRUD operations.

---

## Project Overview

This repository contains two Spring Boot tasks created during backend development practice.

The project demonstrates:

- REST API development
- CRUD operations
- Spring Boot architecture
- DTO and Mapper usage
- API documentation with Swagger
- In-memory database integration using H2

---

## Technologies Used

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/SpringBoot-3-green)
![Maven](https://img.shields.io/badge/Maven-Build-blue)
![H2 Database](https://img.shields.io/badge/Database-H2-lightgrey)
![Swagger](https://img.shields.io/badge/API-Swagger-brightgreen)

- Java
- Spring Boot
- Maven
- H2 Database
- Swagger / OpenAPI
- REST API

---

## Project Structure

```bash
src
 ┣ main
 ┃ ┣ java
 ┃ ┃ ┗ com.example.firstrestapi
 ┃ ┃    ┣ controller
 ┃ ┃    ┣ service
 ┃ ┃    ┣ repository
 ┃ ┃    ┣ mapper
 ┃ ┃    ┣ dto
 ┃ ┃    ┗ entity
 ┃ ┗ resources
 ┗ test
```

---

## Features

- Create Product
- Get All Products
- Get Product By ID
- Update Product
- Delete Product
- Swagger API Documentation
- DTO Mapping
- H2 In-Memory Database

---

## REST API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| POST | `/api/v1/products` | Create product |
| GET | `/api/v1/products` | Get all products |
| GET | `/api/v1/products/{id}` | Get product by ID |
| PUT | `/api/v1/products/{id}` | Update product |
| DELETE | `/api/v1/products/{id}` | Delete product |

---

## Example JSON Request

```json
{
  "name": "Gaming Mouse",
  "price": 120.0,
  "quantity": 5
}
```

---

## Swagger Documentation

After running the application, open:

```bash
http://localhost:8080/swagger-ui/index.html
```

Swagger provides interactive API testing directly from the browser.

---

## How to Run the Project

### 1. Clone Repository

```bash
git clone https://github.com/krlamine/FirstRestAPI.git
```

---

### 2. Open Project

Open the project using:

- IntelliJ IDEA
- VS Code
- Eclipse

---

### 3. Run Application

Run:

```bash
FirstRestApiApplication
```

---

### 4. Open Swagger UI

```bash
http://localhost:8080/swagger-ui/index.html
```

---

## What I Learned

This project helped me improve my skills in:

- Backend development
- Spring Boot fundamentals
- RESTful API architecture
- CRUD operations
- DTO and entity mapping
- API testing
- Clean project organization

---

## Future Improvements

- Add MySQL or PostgreSQL
- Add authentication with Spring Security
- Add Docker support
- Add unit and integration testing
- Deploy API online
- Add exception handling
- Add pagination and filtering

---

## Author

Mohamed Lamine Krina

Cybersecurity & Computer Engineering Student at Vistula University

GitHub: https://github.com/krlamine

---

## License

This project is created for educational purposes.
