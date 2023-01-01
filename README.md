# Import CSV File with Spring Boot
This repository contains a Spring Boot application that allows users to import data from a CSV (Comma Separated Values) file into a MySQL database. The application provides a form for selecting the CSV file and a table for displaying the imported data.

## Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites
Java 8 or higher
Maven
MySQL
An IDE (such as IntelliJ IDEA)
### Installing
Clone the repository to your local machine:
Copy code
git clone https://github.com/abdullahbakis/spring-boot-import-csv-file.git
Import the project into your IDE as a Maven project.

Create a MySQL database and a user with permissions to access it. Update the application.properties file with the credentials for the database.

Run the project as a Spring Boot application.

Open a web browser and navigate to http://localhost:8080 to access the application.

Use the form to select a CSV file and click the "Import" button to import the data from the file into the database. The imported data will be displayed in the table.

# Built With
Spring Boot - The web framework used
Maven - Dependency Management
Spring Boot DevTools - Used for automatic reloading of the application during development
Spring Web - Used for handling HTTP requests and responses
Spring Data JPA - Used for implementing the data access layer with JPA
MySQL Connector - Used for connecting to a MySQL database
Thymeleaf - Used for rendering HTML templates on the server side
OpenCSV - Used for parsing CSV files

# Authors
Abdullah Bakış - abdullahbakis
# License
This project is licensed under the MIT License - see the LICENSE file for details.
