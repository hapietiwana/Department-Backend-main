# Department-Backend

This is a Spring Boot project named "Department-Backend" that provides a RESTful API for managing departments. It includes controllers, a service layer, and a repository layer, all built on top of Spring Data JPA.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Configuration](#configuration)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Exception Handling](#exception-handling)
- [Contributing](#contributing)
- [License](#license)

## Prerequisites

Before running this project, make sure you have the following prerequisites:

- Java Development Kit (JDK) 8 or higher
- Apache Maven
- MySQL or H2 database (based on your configuration preference)

## Installation

To install and run this project, follow these steps:

1. Clone the repository to your local machine or download the source code.
2. Open a terminal or command prompt and navigate to the project directory.
3. Build the project using the following command:

   ```shell
   mvn clean install
   ```

   This command will compile the source code, run the tests, and package the application.

## Configuration

This project supports two database configurations: H2 and MySQL. By default, it is configured to use the H2 in-memory database for easy setup and testing. However, you can configure it to use a MySQL database as per your requirement.

To configure the database, modify the `application.properties` file located in the `src/main/resources` directory. Update the following properties:

For H2:

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
```

For MySQL:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
```

Make sure to replace `your_database_name`, `your_username`, and `your_password` with your actual database information.

## Usage

To run the project, use the following command:

```shell
mvn spring-boot:run
```

This command will start the Spring Boot application, and you can access the API endpoints using a tool like Postman or by sending HTTP requests from your application.

## API Endpoints

This project provides the following API endpoints for managing departments:

- `GET /departments`: Retrieves a list of all departments.
- `GET /departments/{id}`: Retrieves a specific department by its ID.
- `POST /departments`: Creates a new department.
- `PUT /departments/{id}`: Updates an existing department.
- `DELETE /departments/{id}`: Deletes a department by its ID.

For more details on request and response formats, please refer to the API documentation or explore the controller classes.

## Exception Handling

This project handles the `DepartmentNotFoundException` exception, which is thrown when a department is not found by its ID. In such cases, the API will respond with an appropriate error message and the corresponding HTTP status code.

## Contributing

Contributions to this project are welcome. If you find any issues or have suggestions for improvements, please open an issue or submit a pull request on the project's repository.

