# 📘 IncomeExpense module

## 1. Overview

The IncomeExpense module is responsible for managing all basic financial transactions in the system — both income (INCOME) and expenses (EXPENSE).

It forms the basis for financial reporting, planning, and goals.

--- 

## 2. Responsibilities

- Record cash inflows and outflows.

- Maintain transactions in the database (PostgreSQL).

- Expose REST endpoints for creation and querying.

- Serve as a data source for other modules (planning, reports, goals).

---

## 3. Package Structure

```code
incomeexpense/
 ├── package-info.java              # Declares the module (@ApplicationModule)
 ├── domain/
 │    ├── IncomeExpense.java        # JPA Entity
 │    └── Type.java                 # Enum (INCOME, EXPENSE)
 ├── repository/
 │    └── IncomeExpenseRepository.java
 ├── service/
 │    └── IncomeExpenseService.java
 └── controller/
      └── IncomeExpenseController.java
```

---

## 4. Main Classes

- IncomeExpense: entity representing a transaction (value, date, description, type).

- Type: enum that differentiates revenue (INCOME) from expense (EXPENSE).

- IncomeExpenseRepository: JPA interface for persistence.

- IncomeExpenseService: business rules layer.

- IncomeExpenseController: REST endpoints for interaction with the module.

---

## 5. Endpoints REST

**Create transaction**

- POST /incomeexpense

- Body (JSON):



