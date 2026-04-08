# LAB REPORT
## Topic: Layered Architecture Built with Pure Java

## Introduction
In this lab, I implemented a simple order system using **Layered Architecture** in pure Java.  
The main purpose of this lab was to understand how a software system can be divided into different layers according to their responsibilities.

## Architecture Used
The project was designed with **3 layers**:

### 1. Presentation Layer
This layer handles user requests and prints the result.

**Class used:**
- `OrderController`

### 2. Business Layer
This layer contains the main business logic.

**Class used:**
- `OrderService`

### 3. Persistence Layer
This layer stores and retrieves product data.

**Class used:**
- `ProductRepository`

---

## How I Implemented the Project

### Product Class
I created a `Product` class to store:
- product ID
- product name
- stock amount
### Order Class
I created an 'Order' class:
-product ID
-quantity

### ProductRepository
I used a `HashMap<Long, Product>` a simple database.  
This class is responsible for saving and finding products.

### OrderService
This class contains the main order operations.  
It:
- finds the product
- checks the stock
- decreases the stock after the order
- gives an error if the product does not exist or the stock is not enough

### OrderController
This class receives the order request and handles success or error messages using `try-catch`.

### Main Class
In the `Main` class, I manually connected all objects:
- `ProductRepository`
- `OrderService`
- `OrderController`

I also added a sample product and tested the system.

---

## Dependency Injection
In this project, I used **Manual Dependency Injection** with constructors.

Examples:
- `OrderService` receives `ProductRepository`
- `OrderController` receives `OrderService`

## Test Scenarios
I tested the system with a sample product:

- ID:`1`
- Name:`Laptop`
- Stock: `5`

### Test Results
1. Ordering 2 laptops → **Successful**
2. Ordering 10 laptops → **Failed (Insufficient stock)**
3. Ordering product ID 2 → **Failed (Product not found)**

### Output
```java
🚀 System Starting...

--- Test Scenarios ---
Order placed successfully!
Order failed: Insufficient stock
Order failed: Product not found