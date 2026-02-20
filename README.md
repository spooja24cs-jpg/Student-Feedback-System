# Student Feedback System

## Project Type
Advanced Java (Servlet + MySQL)

## Features
- Submit Feedback
- View All Feedback
- Uses JDBC
- Uses MySQL Database

## Technologies Used
- Java Servlet
- JDBC
- MySQL
- Apache Tomcat
- GitHub

## Database Query

CREATE DATABASE feedbackdb;

CREATE TABLE feedback (
    id INT PRIMARY KEY AUTO_INCREMENT,
    student_name VARCHAR(100),
    message TEXT
);

## How to Run
1. Import project in NetBeans
2. Configure Tomcat Server
3. Setup MySQL Database
4. Run Project
