# Fawry Fullstack Internship - E-Commerce System

> **Note**: This project is in active development on the `dev` branch. The `main` branch does not contain the final implementation.

##  Project Overview
This is a Java-based console application that simulates an e-commerce system. It was designed and developed for the Fawry Fullstack Internship Challenge, focusing on clean Object-Oriented Programming (OOP), SOLID principles, and use of the **Decorator Design Pattern**.

##  Features Implemented
-  Products with name, price, and quantity
-  Support for expirable products (e.g., Cheese)
-  Support for shippable products (e.g., TV, with weight)
-  Cart management with quantity checks and stock validation
-  Checkout service calculating subtotal, shipping, and total
-  Error handling for:
  - Expired products
  - Out of stock items
  - Insufficient balance
  - Empty cart

## ️ Design Patterns & Principles
-  **Decorator Pattern**: Used to wrap products with additional behavior (expiry, shipping) without complex inheritance
-  **Factory Pattern**: For clean creation of product variants
-  **Single Responsibility** and **Open/Closed Principle** respected in all domain services (`Cart`, `CheckoutService`, `ShippingService`, `Customer`)

##  Test Scenarios (in `ECommerceApp`)
-  Successful purchase
-  Product expired
-  Product out of stock
-  Customer has insufficient balance
-  Non-shippable products processed correctly

##  How to Run
1. Clone the repository:
```bash
git clone https://github.com/abdomohsen228/fullstack-internship-ecommerce-challenge
cd fullstack-internship-ecommerce-challenge
git switch dev
```
##  Project Structure
```
src/main/java/com/fawry/
├── product/               # Core product interface and decorators
├── cart/                  # Cart and CartItem logic
├── checkout/              # CheckoutService and payment logic
├── shipping/              # ShippingService and weight calc
├── user/                  # Customer model
├── Main.java              # Delegates to ECommerceApp
└── ECommerceApp.java      # Main app to test all use cases
```
