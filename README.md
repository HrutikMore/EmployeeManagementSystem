# EmployeeManagementSystem
Employee Management System REST API using Spring Boot, Spring Data JPA and MySQL



Employee Management System

Features
- Create employee
- Get employee by ID
- Get all employees
- Update employee
- Delete employee
- Search employees
- Pagination and sorting
- Department filtering

Technologies
- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Swagger/OpenAPI

API Endpoints
POST   /api/employees
GET    /api/employees
GET    /api/employees/{id}
PUT    /api/employees/{id}
DELETE /api/employees/{id}
GET    /api/employees/search
GET    /api/employees/department/{department}

Database
MySQL database: employee_db

Running the Application
1. Create the MySQL database
2. Configure database credentials
3. Run the Spring Boot application
4. Access the API on port 8080
