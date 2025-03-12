# Wells Fargo Financial Advisory Data Model

## Project Overview
This Spring Boot application implements a comprehensive data model for a financial advisory system. The model represents relationships between financial advisors, clients, portfolios, and securities.

## Completed Tasks
- ✅ Implemented complete data model with JPA entities and relationships
- ✅ Created repository interfaces for database operations
- ✅ Configured H2 in-memory database for development/testing
- ✅ Established proper entity relationships (one-to-many, one-to-one)
- ✅ Set up Spring Boot application structure

## Data Model Implementation
The following entities have been implemented:

1. **FinancialAdvisor**
   - Core attributes: name, email, phone_number
   - Relationship: One-to-Many with Clients

2. **Client**
   - Core attributes: name, email, phone_number
   - Relationships:
     - Many-to-One with FinancialAdvisor
     - One-to-One with Portfolio

3. **Portfolio**
   - Relationship:
     - One-to-One with Client
     - One-to-Many with Securities

4. **Security**
   - Core attributes: name, category, purchase_date, purchase_price, quantity
   - Relationship: Many-to-One with Portfolio

## Technologies Used
- Spring Boot 3.0.4
- Spring Data JPA
- H2 Database (in-memory)
- Java 23
- Maven

## How to Run the Application
1. Clone the repository
2. Open in IntelliJ IDEA
3. Run the `Entrypoint` class
4. Access H2 database console at http://localhost:8081/h2-console
   - JDBC URL: `jdbc:h2:mem:testdb`
   - Username: `sa`
   - Password: (leave empty)

## Configuration
The application is configured to:
- Run on port 8081
- Use an in-memory H2 database
- Create and drop database tables automatically on startup/shutdown
- Show SQL statements in logs for debugging purposes
