# Project Name

## Description
This project is a Spring-based RESTful API application for managing user data. It's built using Spring Boot, Spring Data JPA, and utilizes an H2 in-memory database for data persistence. The project includes entities, repositories, services, controllers, exception handling mechanisms, and configurations.

## Setup Instructions
To set up the project, follow these steps:

1. **Base Project Creation**:
    - Use [Spring Initializr](https://start.spring.io/) to create the base project with the specified options.

2. **Project Import**:
    - Unzip the downloaded project into your workspace.
    - Import the project into your preferred Java IDE.

3. **Entity Creation**:
    - Create a `User` class with specified attributes, constructors, getters, setters, and annotations.

4. **Controller Setup**:
    - Create a `UserResource` class with specified annotations.

5. **Database Configuration**:
    - Add dependencies for Spring Data JPA and H2 database in `build.gradle`.
    - Configure `application.yml` and `application-test.yml` files under `src/main/resources`.

6. **Repository Configuration**:
    - Create a `UserRepository` interface extending `JpaRepository`.

7. **Test Configuration**:
    - Implement `TestConfig` class to populate data in the database during test runs.

8. **Service Setup**:
    - Create a `UserService` interface annotated with `@Service`.

9. **Exception Handling Setup**:
    - Create `ResourceNotFoundException`, `StandardError`, and `ResourceExceptionHandler` classes.

10. **Route Implementation**:
    - Inject `UserService` into `UserResource` and implement specified routes.

## Testing
- Utilize Postman to test the application's APIs.

## Result
The project includes Java files for entities, repositories, services, controllers, and exception handling mechanisms, along with configuration files necessary for running and testing the application.

## Credits
This project was created by [Paulo Cunha](https://github.com/paulofranklins2).