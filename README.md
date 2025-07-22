# ☕ Cafemgm – Cafe Management System

A lightweight Spring Boot application to manage cafe menu items, built using **Spring Boot**, **Java 17**, and **RESTful APIs**. This serves as a foundational backend service for managing items in a cafe's inventory or menu list.

---

## 📌 Tech Stack

- Java 17
- Spring Boot 3.5.3
- Spring Web
- Maven

---

## 📁 Project Structure

src/
├── main/
│ ├── java/com/cafe/
│ │ ├── CafemgmApplication.java # Main Spring Boot Application
│ │ ├── controller/
│ │ │ └── CafeController.java # REST Controller Layer
│ │ └── model/
│ │ └── CafeItem.java # Entity/Model Class
│ └── resources/
│ ├── application.properties # Spring Configuration
│ ├── static/ # Static assets (if any)
│ └── templates/ # Thymeleaf templates (if used)
└── test/




---

## 🚀 How to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/Cafemgm.git
   cd Cafemgm

2. **Update application.properties (if required)**

3. **Run the application**
   mvn spring-boot:run

4. **Test the APIs**

  Access the REST endpoints via:

  http://localhost:8080/
  http://localhost:8080/contact


5. **📄 License**
This project is open source and available under the MIT License.
