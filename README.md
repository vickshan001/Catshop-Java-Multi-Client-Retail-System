# 🛒 Catshop – Java Multi-Client Retail System (CI553, 2021)

A multi-window Java retail application enhanced for the **CI553 module** at the University of Brighton in **2021**. The original Catshop project was forked and expanded with new functionality such as product quantity merging, GUI improvements, sounds, sorting features, and full JUnit testing.

🔗 GitHub repository: [2021-CI553-catshop](https://github.com/vickshan001/2021-CI553-catshop)

---

## 📦 Project Overview

Catshop is a simulated retail system with multiple interfaces:

- Customer Client  
- Cashier Client  
- BackDoor Client  
- Pick Client  
- Display Client  
- Collect Client  

Customers can:
- Browse items by product ID
- View quantity and price
- Place or remove orders
- Receive unique order numbers
- Collect items when ready

---

## 🛠 Tools & Setup

- **Eclipse IDE** – used after IntelliJ failed to run the provided code
- **Git & GitHub** – for cloning and version control
- **WhiteStar UML** – used for modeling Use Case & Sequence Diagrams
- **JUnit** – for automated unit testing
- **JavaDoc** – for project documentation

---

## 🚀 Features Added

### 🔁 Merge Quantity of Same Products
When the same product is added again, the quantity increases rather than creating a duplicate entry in the basket.

### 🎨 GUI Button Enhancements
Mouse hover effects added using `MouseListener` and button colors to improve UX.

### 🔊 Added Sound Effects
Custom sound class plays sounds on key interactions using a designated `/sound` folder.

### 🔢 Sort Basket by Product ID
Improved order display by sorting items by their ID in the `BetterBasket` class.

### 🗑 Remove Button
Implemented `removeItem` functionality allowing customers to remove specific items by product ID.

---

## 🧪 Testing

- Implemented **JUnit** tests for key features.
- Verified GUI behaviors and core logic independently.

---

## 📐 UML Diagrams

- ✅ Use Case Diagram  
- ✅ Customer & Cashier Client Sequence Diagrams

Created using WhiteStar UML.

---

## 📄 Documentation

- Generated using **JavaDoc plugin** in Eclipse for method-level documentation.

---

## 👨‍💻 Developed By

**Vickshan Vicknakumaran**  
CI553 – Software Development Practice  
University of Brighton | 2021

---

