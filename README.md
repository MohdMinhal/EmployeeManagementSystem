# Employee Management System

## Description
A comprehensive project for managing employee information, including adding, removing, updating, and retrieving employee details via a RESTful API.

## Prerequisites
- Java 11 or later
- Maven
- VS Code
- MySQL database
- Postman
- VS Code Extensions:
  - Extension Pack for Java
  - Spring Boot Extension Pack

## Setup
1. Clone the repository from GitHub:
   ```bash
   git clone https://github.com/your-repo/EmployeeManagementSystem.git
   ```

2. Navigate to the project directory:
   ```bash
   cd EmployeeManagementSystem
   ```

3. Build the project:
   ```bash
   mvn clean install
   ```

4. Create a MySQL database and update the database configuration in the `application.properties` file located in `src/main/resources`:
   ```properties
   spring.datasource.url=jdbc:mysql://your-mysql-host:your-mysql-port/your-database-name
   spring.datasource.username=your-database-username
   spring.datasource.password=your-database-password  # Note: Password is removed from the project
   ```

5. Run the application:
   ```bash
   mvn spring-boot:run
   ```

## API Documentation
The following are the API endpoints available in this project:

### Base URL: `/emp`

#### 1. GET `/home`
**Description:** Get the welcome message for the Employee Management API.  
**Response:** 
```text
Welcome to Employee Management
```

#### 2. POST `/addEmp`
**Description:** Add a new employee to the database.  
**Request Body:**
```json
{
  "name": "John Doe",
  "designation": "Software Engineer",
  "salary": 50000.0
}
```
**Response:** 
```json
Status: 201 Created
{
  "id": 1,
  "name": "John Doe",
  "designation": "Software Engineer",
  "salary": 50000.0
}
```

#### 3. DELETE `/removeEmp/{ID}`
**Description:** Remove an existing employee from the database by ID.  
**Path Variable:** `ID` - The ID of the employee to be removed.  
**Response:** 
```json
Status: 202 Accepted
"Remove Successfully"
```

#### 4. GET `/findEmp/{ID}`
**Description:** Find an employee by their ID.  
**Path Variable:** `ID` - The ID of the employee to be found.  
**Response:** 
```json
Status: 202 Accepted
{
  "id": 1,
  "name": "John Doe",
  "designation": "Software Engineer",
  "salary": 50000.0
}
```

#### 5. GET `/all`
**Description:** Get a list of all employees.  
**Response:** 
```json
Status: 202 Accepted
[
  {
    "id": 1,
    "name": "John Doe",
    "designation": "Software Engineer",
    "salary": 50000.0
  },
  {
    "id": 2,
    "name": "Jane Smith",
    "designation": "Senior Developer",
    "salary": 60000.0
  },
  ...
]
```

#### 6. PUT `/update/{ID}`
**Description:** Update an existing employee's information.  
**Path Variable:** `ID` - The ID of the employee to be updated.  
**Request Body:**
```json
{
  "name": "Updated Employee",
  "designation": "Updated Designation",
  "salary": 70000.0
}
```
**Response:** 
```json
Status: 201 Created
{
  "id": 1,
  "name": "Updated Employee",
  "designation": "Updated Designation",
  "salary": 70000.0
}
```
