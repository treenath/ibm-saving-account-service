# Saving Account Service

This is a backend microservice for simulating simple core banking transactions, focusing on the money transfer feature.

## 🛠 Tech Stack

- Java 17
- Spring Boot
- H2 (in-memory DB)
- Maven
- Docker & Docker Compose

## ▶️ How to Run

### Option 1: Using Docker

```bash
docker compose up --build
```

### Option 2: Run Locally with Maven

```bash
./mvnw spring-boot:run
```

## 📮 API: Money Transfer

`POST /api/transfer`

**Request Body**:

```json
{
  "fromAccount": "1234567",
  "toAccount": "7654321",
  "amount": 500.0
}
```

**Response**:

- `200 OK` → `"Transfer successful"`
- `400 Bad Request` → `"Transfer failed"`