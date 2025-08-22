# Expense Tracker Backend

A Spring Boot–based backend for an **Expense Tracker Application**.  
It provides RESTful APIs to manage expenses and groups, with features like adding expenses, grouping them, and retrieving expense data.

---

## ✨ Features

- Add, update, and delete expenses
- Group expenses for better organization
- RESTful API endpoints for all operations
- Configurable via `application.yml`
- Unit tests included

---

## 📂 Project Structure

```
src/
 ├── main/
 │   ├── java/...      # Source code
 │   └── resources/    # application.yml and static configs
 └── test/             # Unit tests
```

---

## 🚀 Getting Started

### ✅ Prerequisites

- Java 8+
- Maven

### ▶️ Run Locally

Clone the repository:

```bash
git clone https://github.com/your-username/expense-tracker-backend.git
cd expense-tracker-backend
```

Build and run with Maven:

```bash
mvn spring-boot:run
```

Or build the JAR and run:

```bash
mvn clean package
java -jar target/expense-tracker-backend-0.0.1-SNAPSHOT.jar
```

---

## 📌 API Endpoints

### Expenses

- `GET /expenses` → Get all expenses
- `POST /expenses` → Add new expense
- `PUT /expenses/{id}` → Update expense
- `DELETE /expenses/{id}` → Delete expense

### Groups

- `GET /groups` → Get all groups
- `POST /groups` → Create new group
- `PUT /groups/{id}` → Update group
- `DELETE /groups/{id}` → Delete group

---

## ⚙️ Configuration

Update `application.yml` to customize database and server settings.

---

## 🧪 Testing

Run unit tests with:

```bash
mvn test
```

---

## 📜 License

This project is licensed under the **MIT License** – see the [LICENSE](LICENSE) file for details.

---
