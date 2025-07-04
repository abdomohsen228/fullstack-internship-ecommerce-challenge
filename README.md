# Fawry Full Stack Development Internship Challenge

##  Overview

This project is a submission for the **Fawry Full Stack Development Internship Challenge (July 2025)**. The goal is to implement an e-commerce system with the following key functionalities:

- Product definition with price, quantity, and optional expiry date or shipping weight.
- Cart operations with quantity limits.
- Checkout process with validation and summary details.
- Shipping integration for applicable products.

---

##  Features Implemented

### Product Types
- **Perishable Products** (e.g. Cheese, Biscuits): May expire.
- **Non-Perishable Products** (e.g. TV, Mobile): Do not expire.
- **Shippable Products**: Have a weight and must be shipped.
- **Non-Shippable Products**: Delivered digitally (e.g. Mobile Scratch Cards).

### Cart
- Add product with specific quantity.
- Quantity must not exceed stock.
- Prevent adding expired or out-of-stock products.

### Checkout
- Shows:
    - Subtotal
    - Shipping Fees
    - Paid Amount (Subtotal + Shipping)
    - Customer's Balance After Payment
- Error Handling for:
    - Empty cart
    - Insufficient balance
    - Expired or out-of-stock products

### ShippingService
- Accepts a list of shippable items (objects implementing an interface with:
    - `getName(): String`
    - `getWeight(): double`)

---

##  Assumptions

- Shipping fee is calculated based on total weight.
- Each product has a unique name.
- Time is simulated for expiry check.
- Product prices are in a single currency (e.g. EGP).
- Console output is used for all interactions.

---

##  Technologies Used

- Language: Java
- Paradigm: Object-Oriented Programming (OOP)
- Java Collections & Interfaces
---

##  How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/abdomohsen228/fullstack-internship-ecommerce-challenge
   cd fullstack-internship-ecommerce-challenge
