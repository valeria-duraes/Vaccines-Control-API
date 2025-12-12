
# 🩺 VaccineAPI – Sistema de Gerenciamento de Vacinação
**(PT-BR + EN)**

---

## 🇧🇷 Sobre o Projeto

O **VaccineAPI** é um sistema backend desenvolvido em **Java + Spring Boot** para gerenciar pacientes, vacinas e registros de vacinação.  
Também inclui rotinas automáticas (*Schedulers*) para cálculo da próxima dose e envio de lembretes por e-mail.

O banco de dados utilizado é **PostgreSQL**, e algumas regras mais avançadas (datas, intervalos, validações) futuramente serão movidas para funções SQL.

---

## 🇺🇸 About the Project

**VaccineAPI** is a backend system built with **Java + Spring Boot** to manage patients, vaccines, and vaccination records.  
It includes automatic schedulers that calculate the next dose date and send e-mail reminders.

The database used is **PostgreSQL**, and some logic will later be moved to SQL functions for performance and maintainability.

---

## 📁 Project Structure

src/main/java
└── com.group_vaccineapi.artifact_vaccineapi
├── exception
├── modules
│ ├── patient
│ │ ├── controllers
│ │ ├── dtos
│ │ ├── entities
│ │ ├── repositories
│ │ └── services
│ ├── vaccinerecord
│ └── vaccines
└── scheduler
├── EmailService
└── NotificationScheduler

## 🧩 Features

### ✔ Pacientes / Patients
- CRUD completo
- Informações básicas

### ✔ Vacinas / Vaccines
- Cadastro de vacinas
- Intervalos entre doses
- Regras personalizadas

### ✔ Registros / Vaccination Records
- Registro de aplicação
- Cálculo automático da próxima dose
- Histórico completo do paciente

### ✔ Schedulers Automáticos
- Cálculo diário de próxima dose
- Envio de lembretes por e-mail
- Rotinas administrativas

---

## 📡 API Endpoints

### 👤 Patients
- `GET /patients`
- `GET /patients/{id}`
- `POST /patients`
- `PUT /patients/{id}`
- `DELETE /patients/{id}`

### 💉 Vaccines
- `GET /vaccines`
- `POST /vaccines`
- `PUT /vaccines/{id}`
- `DELETE /vaccines/{id}`

### 📘 Vaccine Records
- `GET /vaccinerecord`
- `POST /vaccinerecord`

### ⏰ Schedulers
- Next dose calculator
- Email reminders
- Daily validations

---

## ✉ Email Configuration

Configure in `application.properties` or `application.yml`:
- SMTP host
- Port
- Credentials
- Default sender

---

## 🛠 Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Spring Schedulers
- JavaMail Sender

---

## 📦 How to Run

### Requirements
- Java 17
- Maven
- PostgreSQL

### Steps
1. Clone the repository
2. Configure the database in `application.yml`
3. Run:
   ```bash
   mvn clean install
Start the application:

bash
Copiar código
mvn spring-boot:run

🧹 Next Steps
Move logic to PostgreSQL functions
Create reporting endpoints
Create frontend (React or Angular)
Add unit tests