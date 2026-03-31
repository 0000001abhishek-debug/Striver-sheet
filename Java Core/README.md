# 📘 Java Methods - Complete Notes (All Topics Covered)

---

# 🔹 1. Introduction to Methods

A **method** is a block of code that performs a specific task and can be reused multiple times.

### ✅ Why use methods?

* Code Reusability
* Better Readability
* Easy Maintenance
* Modularity

### 📌 Example:

```java
class Demo {
    void greet() {
        System.out.println("Hello");
    }
}
```

---

# 🔹 2. Method Syntax & Components

```java
access_modifier return_type method_name(parameters) {
    // method body
}
```

### 🧩 Components:

* **Access Modifier** → public/private
* **Return Type** → int, void, etc.
* **Method Name** → camelCase
* **Parameters** → inputs
* **Body** → logic

---

# 🔹 3. Types of Methods

## 🔸 1. Predefined Methods

Already available in Java

```java
Math.random();
System.out.println("Hello");
```

---

## 🔸 2. User-defined Methods

Created by programmer

```java
void sayHello() {
    System.out.println("Hello");
}
```

---

# 🔹 4. Static Methods vs Instance Methods

## 🔸 Static Method

* Belongs to class
* No object needed

```java
static void show() {
    System.out.println("Static");
}
```

👉 Call:

```java
Demo.show();
```

---

## 🔸 Instance Method

* Belongs to object
* Needs object

```java
void display() {
    System.out.println("Instance");
}
```

👉 Call:

```java
Demo obj = new Demo();
obj.display();
```

---

# 🔹 5. Access Modifiers

| Modifier  | Access                  |
| --------- | ----------------------- |
| public    | Everywhere              |
| private   | Same class only         |
| protected | Same package + subclass |
| default   | Same package            |

---

# 🔹 6. Method Parameters & Return Types

## 🔸 No parameter, no return

```java
void show() {}
```

## 🔸 With parameter

```java
void greet(String name) {}
```

## 🔸 With return

```java
int add() { return 10; }
```

## 🔸 Parameter + Return

```java
int add(int a, int b) { return a + b; }
```

---

# 🔹 7. Method Signature

👉 Method name + parameters

```java
add(int a, int b)
```

❌ Return type not included

---

# 🔹 8. Method Naming Rules

* Start with **verb**
* Use **camelCase**
* Must be meaningful

✅ Examples:

* calculateSum()
* printDetails()

---

# 🔹 9. Method Calling

## 🔸 Instance Method

```java
obj.methodName();
```

## 🔸 Static Method

```java
ClassName.methodName();
```

---

# 🔹 10. Method Call Stack

👉 Stack follows **LIFO (Last In First Out)**

### 📌 Flow:

1. Method called → pushed to stack
2. Executes
3. Removed after completion

### 📌 Example Flow:

```java
main → A → B → C
```

Stack:

```
C
B
A
main
```

---

# 🔹 11. Command Line Arguments

Arguments passed during program execution

### 📌 Example:

```java
class Demo {
    public static void main(String[] args) {
        System.out.println(args[0]);
    }
}
```

### ▶️ Run:

```
java Demo Abhishek
```

---

# 🔹 12. Variable Arguments (Varargs)

👉 Allows multiple inputs

### 📌 Syntax:

```java
int sum(int... numbers)
```

### 📌 Example:

```java
class Demo {
    static int sum(int... nums) {
        int total = 0;
        for (int n : nums) {
            total += n;
        }
        return total;
    }
}
```

---

# 🔹 13. Abstract Method

* No body
* Must be implemented in subclass

```java
abstract void show();
```

---

# 🔹 14. Final Method

* Cannot be overridden

```java
final void display() {}
```

---

# 🔹 15. Key Differences Summary

| Concept          | Key Idea           |
| ---------------- | ------------------ |
| Static           | Class level        |
| Instance         | Object level       |
| Varargs          | Multiple inputs    |
| Call Stack       | LIFO execution     |
| Access Modifiers | Control visibility |

---

# 🔥 Final Summary

* Method = reusable block of code
* Types: predefined + user-defined
* Static vs Instance → object vs class
* Call stack manages execution
* Varargs allow flexible parameters
* Access modifiers control visibility

---

# 🚀 Bonus Tip

👉 Practice by writing 1 program using ALL concepts together.

---
