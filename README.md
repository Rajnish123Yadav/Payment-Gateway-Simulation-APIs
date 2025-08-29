# Payment-Gateway-Simulation-APIs
A Spring Boot REST API that simulates dealer subscription payment processing with PostgreSQL as the database. The system supports UPI, Card, and NetBanking payments, stores payment records with transaction status, and auto-updates the status after 5 seconds to mimic a real payment gateway callback.


-----------------------------------------------------------------------------------------------------------------------------------------------------------------
# 💳 Payment Gateway Simulation API

A Spring Boot REST API that simulates **dealer subscription payment processing** with PostgreSQL.  
This project demonstrates how a payment gateway works using **UPI, Card, and NetBanking** methods with auto-status updates.

---

## 🚀 Features
- Initiate dealer payment with **amount & method**
- Store payment records with status = `PENDING`
- Auto-update status to `SUCCESS` after 5 seconds (simulated callback)
- PostgreSQL persistence for transactions
- RESTful API design with JSON
- (Bonus) Secure endpoints with **JWT authentication**

---

## 🛠️ Tech Stack
- **Java 17+ / 23+**
- **Spring Boot 3.x**
- **Spring Data JPA (Hibernate)**
- **PostgreSQL**
- **Maven**
- **JWT (optional for securing APIs)**

------------------------------------------------------------------------------------------------------------------------------------------------------------------
