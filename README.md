# Employee REST API

This project is a RESTful API for managing employee data using Java and Spring Boot.

## 🚀 Features

- Create, Read, Update, Delete (CRUD) operations for employees
- RESTful API endpoints
- Uses Spring Boot and Maven
- Structured in a multi-layered architecture (Controller, Service, Repository)

## 🛠️ Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL (or H2 for testing)
- Maven
- Postman (for API testing)

## 📁 Project Structure
Employee REST API/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/example/employeerestapi/
│ │ └── resources/
│ │ └── application.properties
├── pom.xml
└── README.md

## 📡 API Endpoints

| Method | Endpoint         | Description            |
|--------|------------------|------------------------|
| GET    | /employees       | Get all employees      |
| GET    | /employees/{id}  | Get employee by ID     |
| POST   | /employees       | Add a new employee     |
| PUT    | /employees/{id}  | Update employee        |
| DELETE | /employees/{id}  | Delete employee        |

## ✅ How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/YOUR_USERNAME/REPO_NAME.git
2. Navigate to the folder and build the project:
   cd "Employee REST API"
   mvn clean install
3. Run the application
   mvn spring-boot:run
4. The API will be available at:
   http://localhost:8080/

# Testing with Postman
- Open Postman Web.
- Create a new request.
- Set the method to GET, POST, PUT, or DELETE.
- Use the appropriate endpoint (e.g., http://localhost:8080/employees).
   
