 # 🚲 Bike Rental CRUD Application

## 📌 Project Description

The Bike Rental CRUD Application is a full-stack web application developed using React.js for the frontend, Spring Boot for the backend, and MySQL as the database.

This application allows users to manage bike information through CRUD operations (Create, Read, Update, and Delete) using RESTful APIs.

## 🛠️ Technologies Used

- **Frontend:** React.js
- **Backend:** Java, Spring Boot
- **Database:** MySQL
- **ORM:** Spring Data JPA, Hibernate
- **API Architecture:** RESTful APIs
- **Build Tool:** Maven
- **API Testing:** Postman
- **Version Control:** Git and GitHub

## ✨ Features

- ➕ Add new bike details
- 📋 View all bikes
- 🔍 View bike details by ID
- ✏️ Update existing bike information
- 🗑️ Delete bike records
- 🗄️ Store and manage bike data using MySQL
- 🔗 Connect the React frontend with Spring Boot REST APIs
- ✅ Validate bike details and handle API errors

## ⚙️ CRUD Operations

| Operation | HTTP Method | Endpoint | Description |
|---|---|---|---|
| Create | POST | `/api/bikes` | Add a new bike |
| Read All | GET | `/api/bikes` | Retrieve all bikes |
| Read by ID | GET | `/api/bikes/{id}` | Retrieve a bike by ID |
| Update | PUT | `/api/bikes/{id}` | Update bike details |
| Delete | DELETE | `/api/bikes/{id}` | Delete a bike |

## 📂 Project Structure

```text
bike-rental-app/
├── frontend/
│   ├── src/
│   │   ├── components/
│   │   ├── App.jsx
│   │   └── main.jsx
│   ├── package.json
│   └── index.html
│
├── backend/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/bikerental/
│   │   │   │   ├── controller/
│   │   │   │   ├── entity/
│   │   │   │   ├── repository/
│   │   │   │   ├── service/
│   │   │   │   └── BikeRentalApplication.java
│   │   │   └── resources/
│   │   │       └── application.properties
│   │   └── test/
│   └── pom.xml
│
└── README.md
```

## 🗄️ Database Setup

### 1. Create the MySQL Database

Run the following SQL query in MySQL:

```sql
CREATE DATABASE bike_rental;
```

### 2. Configure Database Connection

Update `backend/src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/bike_rental_db
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

server.port=8080
```


## 🚀 Installation and Setup

### Prerequisites

- Java JDK 25 
- Node.js and npm
- MySQL Server
- Maven
- Git

### 1. Clone the Repository

```bash
git clone <your-github-repository-url>
cd bike-rental-app
```

### 2. Run the Spring Boot Backend

Navigate to the backend directory:

```bash
cd backend
```

Run the application using Maven:

```bash
mvn spring-boot:run
```

The backend API will be available at:

`http://localhost:8080`

### 3. Run the React Frontend

Open another terminal:

```bash
cd frontend
npm install
npm run dev
```

The React application will usually be available at:

`http://localhost:5173`

## 🧪 API Testing

Use Postman to test the Spring Boot REST APIs.

**Example: Create a Bike**

**POST** `/api/bikes`

Request body:

```json
{
  "name": "Honda Activa",
  "brand": "Honda",
  "model": "6G",
  "pricePerDay": 500,
  "availability": true
}
```

**Example Response**

```json
{
  "id": 1,
  "name": "Honda Activa",
  "brand": "Honda",
  "model": "6G",
  "pricePerDay": 500,
  "availability": true
}
```

The JSON fields and API response depend on your actual entity and controller implementation.

## 🎯 Project Objective

The objective of this project is to develop a full-stack application that demonstrates CRUD operations, REST API development, database integration, and frontend-backend communication using React.js, Spring Boot, and MySQL.

## 🔮 Future Enhancements

- Search bikes by name or brand
- Filter bikes by availability
- Pagination and sorting
- Improved responsive user interface

## 👨‍💻 Author

**Your Name**

GitHub: [Your GitHub Profile](https://github.com/your-username)

---

⭐ If you find this project useful, consider giving the repository a star!
