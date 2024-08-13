# Java JDBC with PostgreSQL

## Table of Contents

- [Introduction](#introduction)
- [Prerequisites](#prerequisites)
- [Setup](#setup)
- [CRUD Operations](#crud-operations)
- [Contributing](#contributing)
- [License](#license)

## Introduction

This project demonstrates how to use Java with JDBC to connect to a PostgreSQL database. It includes basic CRUD (Create, Read, Update, Delete) operations on a sample database.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) installed (version 8 or higher)
- PostgreSQL installed and running
- JDBC Driver for PostgreSQL (`postgresql-<version>.jar`)
- A code editor or IDE such as IntelliJ IDEA, Eclipse, or VS Code

## Setup

1. **Clone the repository**:
   ```bash
   git clone https://github.com/Ahmed-Ibrahim99/JavaJDBC.git
   cd your-repository

2. **Add PostgreSQL JDBC Driver**:

    - Download the PostgreSQL JDBC driver from PostgreSQL's official website.
    - Place the postgresql-<version>.jar file in the lib directory.
3. **Configure the database connection**:
    -Edit the DatabaseConfig.java file located in src/config/DatabaseConfig to include your PostgreSQL database credentials (URL, username, password).

## CRUD Operations

The project includes basic CRUD operations implemented in the YourDaoClass.java file. The operations cover:

    Create: Inserting new records into the database.
    Read: Fetching data from the database.
    Update: Modifying existing records.
    Delete: Removing records from the database.

## Contributing

If you'd like to contribute, please fork the repository and use a feature branch. Pull requests are warmly welcome.

## License

This project is licensed under the MIT License. See the LICENSE file for details.
