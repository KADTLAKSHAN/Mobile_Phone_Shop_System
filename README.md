# Mobile Phone Shop Inventory Management System

This is a basic Java project designed for managing inventory in a mobile phone shop. It provides essential functionalities for beginners to get a grasp of Java programming, database management, and graphical user interfaces (GUIs) using `JFrames`.

## Features
- **Order Management**: Place and track orders with ease.
- **Category Management**: Organize products into categories for better inventory control.
- **Product Management**: Add, update, and remove products from the inventory.
- **PDF Generation**: Create and download PDF invoices using the iText library for post-sale documentation.

## Technologies Used
- **Java**: Core programming language used for developing the application.
- **iText**: Library used for generating PDF files.
- **MySQL**: Database management system for storing and managing data.
- **phpMyAdmin**: Web-based tool for managing MySQL databases.
- **JFrames**: For creating the graphical user interface.

## Setup and Running

### Setup the Database
1. **Create a Database**:
   - Open phpMyAdmin and create a new database (e.g., `phone_shop`).

2. **Import the Schema**:
   - Import the provided SQL schema file into this database. The SQL file is located in the `db` directory of the repository.

3. **Configure Database Connection**:
   - Update the database connection settings in the Java application. These settings can typically be found in a configuration file or within the code where the database connection is established.

### Build and Run
1. **Import the Project**:
   - Import the project into your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).

2. **Include Dependencies**:
   - Ensure that the `itext.jar` file is included in your project's build path.

3. **Compile and Run**:
   - Compile and run the Java application. The GUI is built using `JFrames`, which you should see when the application starts.

## Purpose

This project is an excellent starting point for beginners looking to understand Java application development, database integration, and PDF generation. It also provides practical experience with creating user interfaces using `JFrames`. The project demonstrates fundamental concepts that can be built upon for more advanced projects.

Feel free to explore and enhance the system to better fit specific needs or to add new features!
