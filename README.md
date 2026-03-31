# Core java
1.Introduction
2.java Methods: A method is a block of code that performs a specific task and can be reused multiple times.
* Why Methods are Important?
♻️ Code Reusability → Write once, use many times
🧩 Modularity → Break big program into smaller parts
📖 Readable Code → Easy to understand
🔧 Maintainability → Easy to fix or update

* What is Call Stack?
👉 Call Stack = ek stack data structure (LIFO)
Jo Java me method calls ko manage karta hai.

👉 Jab bhi koi method call hota hai → wo stack me push hota hai
👉 Jab method ka kaam complete ho jata hai → wo pop (remove) ho jata hai

Simple Definition (Exam Ready)

👉 Call Stack is a memory structure used to store information about active method calls in a program.

* How Are Methods Executed
When a method is called : A new stack frame is added to the call stack to store method details.
The method runs its code.
After execution, the stack frame is removed, and control goes back to the calling method.

* Types of Methods in Java

Java me methods ko mainly 2 tareeke se classify karte hain:

1. Predefined Methods (Built-in)

👉 Ye already Java me bane hote hain
👉 Tum directly use karte ho

Example: System.out.println("Hello");
Yaha: println() ek predefined method hai

2. User-defined Methods

👉 Ye methods tum khud banate ho

Example:
public void greet() {
    System.out.println("Hello Bhai");
}

1. Instance Method (Non-Static Method)

👉 Ye method object ke through call hota hai
👉 Ye instance (object) data ko access kar sakta hai

Syntax: void method_name() {
    // code
}

2. Static Method

👉 Ye method class ke through call hota hai
👉 Object banane ki zarurat nahi hoti

Syntax: static void method_name() {
    // code
}
* Method Signature
It consists of the method name and a parameter list.

Number of parameters
Type of the parameters
Order of the parameters

* 8alling Different Types of Methods in Java
Method calling in Java means invoking a method to execute the code it contains. It transfers control to the process, runs its logic, and then returns to the calling point after execution.

1. Calling a User-Defined Method
User-defined methods are blocks of code written by the programmer. To execute a user-defined method, we first create an object of the class (if the method is non-static) and then call the method using that object.

2. Calling an Abstract Method
Abstract methods have no body and must be overridden in a subclass. They are called using an object of the subclass.

3. Calling the Predefined Methods
Java provides many built-in methods via the Java Standard Library, like hashCode().

4. Calling a Static Method
Static methods belong to the class, not the object. They can be called without creating an object.




























































































# Striver-sheet
A code repo for Java and Striver sheet series
