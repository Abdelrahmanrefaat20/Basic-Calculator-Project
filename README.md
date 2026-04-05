# 🧮 Basic Calculator Project

A Java console-based calculator built with **Object-Oriented Programming** principles and robust **exception handling**.

---

## 📋 Description

This project implements a simple yet well-structured calculator that performs basic arithmetic operations through a clean command-line interface. It validates all user input and gracefully handles errors such as division by zero.

---

## ✨ Features

- ➕ Supports **addition**, **subtraction**, **multiplication**, and **division**
- 🔢 Accepts both **integers** and **decimal numbers**
- 🛡️ **Input validation** — rejects letters and invalid symbols
- ⚠️ **Division by zero** handled with a clear error message
- 🏗️ Clean architecture using **interfaces** and **classes**
- 📊 Results displayed in a **formatted output**

---

## 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| Java | Core programming language |
| OOP Concepts | Interface, classes, inheritance |
| Exception Handling | Input validation & runtime errors |

---

## 📁 Project Structure

```
Basic-Calculator-Project/
│
├── src/
│   ├── Operation.java        # Interface defining the calculate() method
│   ├── Add.java              # Addition operation
│   ├── Subtract.java         # Subtraction operation
│   ├── Multiply.java         # Multiplication operation
│   ├── Divide.java           # Division operation (with zero check)
│   ├── InputValidator.java   # Validates numbers and operators
│   └── Main.java             # Entry point — handles user I/O
│
├── .gitignore
├── OOP.iml
└── README.md
```

---

## 🚀 How to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/Abdelrahmanrefaat20/Basic-Calculator-Project.git
   ```

2. **Open** the project in your IDE (e.g., IntelliJ IDEA)

3. **Run** the `Main` class

4. **Follow the prompts** — enter your numbers and operator

---

## 💡 Usage Examples

### ✅ Successful Calculation

```
Enter first number:  10
Enter operator:      /
Enter second number: 2

Result: 10.0 / 2.0 = 5.0
```

### ❌ Division by Zero

```
Enter first number:  5
Enter operator:      /
Enter second number: 0

Error: Division by zero is not allowed.
```

### ❌ Invalid Input

```
Enter first number:  abc

Error: Invalid input. Please enter a valid number.
```

---

## ✅ Validation Rules

| Input | Rule |
|---|---|
| Numbers | Must be valid integers or decimals — no letters or symbols |
| Operators | Only `+`, `-`, `*`, `/` are accepted |
| Division | Denominator must not be zero |
| Invalid input | User is prompted to re-enter |

---

## 👤 Author

**Abdelrahman Refaat**
