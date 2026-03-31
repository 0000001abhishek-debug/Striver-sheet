🔰 Introduction to Java

Java ek object-oriented, platform-independent language hai.

✔ Write Once Run Anywhere (WORA)
✔ Secure, Robust, Portable

⚙️ Download and Install Java
Steps:
JDK download karo (Oracle / OpenJDK)
Install karo
Environment variable set karo (JAVA_HOME)
Verify:
java -version
javac -version
🔥 JDK vs JRE vs JVM
Component	Work
JDK	Development tools (compiler etc.)
JRE	Run Java program
JVM	Code execute karta hai

👉 Flow:

.java → .class → JVM → Output
🆔 Identifiers

👉 Names of variables, methods, classes

Rules:
Letter ya _ se start ✔
Number se start ❌
Keywords allowed nahi ❌
Case-sensitive ✔
🔑 Keywords

👉 Reserved words (fixed meaning)

Examples:

int, class, public, static, void, if, else, return
🧪 Quiz: Java Basics
JVM ka role kya hai?
Java platform independent kaise hai?
Identifier kya hota hai?
📊 Data Types
🔹 Primitive Data Types
Type	Example
int	10
float	10.5
double	20.5
char	'A'
boolean	true
🔹 Non-Primitive
String
Array
Class
🔄 Wrapper Classes

👉 Primitive → Object conversion

Primitive	Wrapper
int	Integer
double	Double
char	Character
Example:
Integer num = 10;
📦 Variables

👉 Data store karne ke liye

Types:
Local Variable
Instance Variable
Static Variable
Example:
int x = 10;
➕ Operators
Types:
Arithmetic → + - * /
Relational → == > <
Logical → && ||
Assignment → =
Unary → ++ --
🧪 Quiz: Variables & Operators
= vs == difference?
++ kya karta hai?
Logical operator example?
🔀 Decision Making

👉 Condition ke base par decision

if-else:
if (x > 10) {
    System.out.println("Big");
} else {
    System.out.println("Small");
}
switch:
switch(day) {
    case 1: System.out.println("Mon"); break;
}
🔁 Loops

👉 Repeat execution

for loop:
for(int i=0; i<5; i++) {
    System.out.println(i);
}
while loop:
while(x < 5) {
    x++;
}
do-while:
do {
    x++;
} while(x < 5);
⏭ Jump Statements
Statement	Work
break	loop stop
continue	skip iteration
return	method end