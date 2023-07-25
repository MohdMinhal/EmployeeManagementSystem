# EmployeeManagementSystem
Project Name -- Employee Management
============

Description
-----------
This is a brief description of the project.

Prerequisites
-------------
- Java 11 or later
- Maven
- VS code
- MySQL database
- Postman
- Extentions from VS code - Extension Pack for Java
			  - Spring Boot Extension Pack 

Setup
-----
1. Clone the repository from GitHub: 


2. Navigate to the project directory:
src\main\java\com\example\EmployeeManagementApplication.java


3. Build the project.


3. Create a MySQL database and update the database configuration in `application.properties` file located in `src/main/resources`. Modify the following properties:
spring.datasource.url=jdbc:mysql://your-mysql-host:your-mysql-port/your-database-name
spring.datasource.username=your-database-username 
spring.datasource.password=your-database-password
 ***I have removed the password from the project***

5. Run the application.



API Documentation
-----------------
The following are the API endpoints available in this project:

Base URL: /emp
Endpoints:

1 GET /home
Description: Get the welcome message for the Employee Management API.

Response: Welcome to Employee Management
...........................................................................................

2 POST /addEmp
Description: Add a new employee to the database.

Request Body: {
  "name": "John Doe",
  "designation": "Software Engineer",
  "salary": 50000.0
}


Response: Status: 201 Created
{
  "id": 1,
  "name": "John Doe",
  "designation": "Software Engineer",
  "salary": 50000.0
}


...........................................................................................

3 DELETE /removeEmp/{ID}
Description: Remove an existing employee from the database by ID.

Path Variable: ID: The ID of the employee to be removed.
Response: 
Status: 202 Accepted
"Remove Successfully"


...........................................................................................

4 GET /findEmp/{ID}
Description: Find an employee by their ID.

Path Variable: ID: The ID of the employee to be found.
Response : 
Status: 202 Accepted
{
  "id": 1,
  "name": "John Doe",
  "designation": "Software Engineer",
  "salary": 50000.0
}


...........................................................................................

5 GET /all
Description: Get a list of all employees.

Response: 
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


...........................................................................................


6 PUT /update/{ID}
Description: Update an existing employee's information.

Path Variable: ID: The ID of the employee to be updated.
Request Body: {
  "name": "Updated Employee",
  "designation": "Updated Designation",
  "salary": 70000.0
}

Response : 
Status: 201 Created
{
  "id": 1,
  "name": "Updated Employee",
  "designation": "Updated Designation",
  "salary": 70000.0
}
___________________________________________________________________________________________________________________________
