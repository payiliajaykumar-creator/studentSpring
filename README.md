# Student Management System

## 📌 Project Overview

The **Student Management System** is a Java-based web application developed using Spring Boot. The project is designed to manage student information and perform database operations using Spring Data JPA and MySQL.

The application follows a layered architecture to maintain clean code, improve maintainability, and separate different responsibilities.

## 🛠️ Technologies Used

- Java 17
- Spring Boot 4.2.0
- Spring WebMVC
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Lombok
- Eclipse IDE

## 🏗️ Project Architecture

This project is developed using five main layers:

### 1. Model Layer
- Defines the Student entity.
- Represents student information.
- Maps Java objects to database tables using JPA annotations.

### 2. Repository Layer
- Handles database communication.
- Uses Spring Data JPA for database operations.

### 3. Service Layer
- Defines business logic methods.
- Acts as a connection between the Controller and Repository layers.

### 4. Service Implementation Layer
- Implements the methods declared in the Service interface.
- Contains the business logic for student operations.

### 5. Controller Layer
- Handles incoming HTTP requests.
- Connects API requests with the Service layer.
- Returns appropriate responses.

## 📂 Project Structure

```text
demo.Student
│
├── src/main/java
│   └── com/example/demo/student
│       │
│       ├── model
│       │   └── Student.java
│       │
│       ├── repository
│       │   └── StudentRepository.java
│       │
│       ├── service
│       │   ├── Service.java
│       │   └── serviceimp.java
│       │
│       ├── controller
│       │   └── StudentController.java
│       │
│       └── DemoStudentApplication.java
│
├── src/main/resources
│   └── application.properties
│
├── src/test
│
├── pom.xml
└── README.md
```

## ⚙️ Configuration

The application uses MySQL as its database.

Configure your database connection in `application.properties`:

```properties
spring.application.name=demo.Student

server.port=9999

spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

**Note:** Replace `YOUR_USERNAME` and `YOUR_PASSWORD` with your MySQL credentials. Create the `studentdb` database in MySQL before running the application, if you use this database name.

## ▶️ How to Run the Project

1. Clone the repository:

```bash
git clone https://github.com/payiliajaykumar-creator/studentSpring.git
```

2. Open the project in Eclipse IDE.

3. Configure your MySQL database credentials in `application.properties`.

4. Update the Maven project.

5. Run the main Spring Boot application class:

```text
DemoStudentApplication.java
```

6. The application will start on:

```text
http://localhost:9999
```

## 📚 Concepts Practised

- Spring Boot project setup
- Layered architecture
- Entity creation using JPA
- Spring Data JPA
- Repository interfaces
- Service interfaces
- Service implementation
- REST controller structure
- MySQL database connectivity
- Maven dependency management

## 👨‍💻 Developer

**Ajay Kumar Payili**

B.Tech – Computer Science and Engineering  
Specialization: Artificial Intelligence and Machine Learning

GitHub: [payiliajaykumar-creator](https://github.com/payiliajaykumar-creator)

---

⭐ Thank you for visiting my repository!
