
# ✅ 1. What is an Interface in Java?

An **interface** in Java is a blueprint of a class that specifies **what a class must do**, not **how** it does it.

### ✅ Key Points:

* It is used to achieve **100% abstraction** (before Java 8).
* A class uses the `implements` keyword to use an interface.
* All variables in an interface are:

    * `public static final` by default.
* All abstract methods are:

    * `public abstract` by default.
* Multiple inheritance is supported using interfaces.

### ✅ Real-World Example:

Think of an interface as a **contract**. If a class implements it, it must provide implementations for its abstract methods.

---

# ✅ 2. Types of Methods in Interface (Java 8 & Java 9 Onward)

Java interfaces have evolved over versions. Here's the full list:

---

## ✅ 2.1 Abstract Methods (Before Java 8)

* Methods without body.
* Must be implemented by the implementing class.
* Implicitly `public abstract`.

```java
interface Bank {
    void pay();
}
```

---

## ✅ 2.2 Default Methods (Java 8)

* Have a body using the `default` keyword.
* Can be inherited or overridden.
* Used for **backward compatibility**.

```java
default void getBankDetails() {
    System.out.println("Default Bank Details");
}
```

---

## ✅ 2.3 Static Methods (Java 8)

* Have implementation.
* Called using `InterfaceName.methodName()`.
* **Cannot be overridden**.

```java
static void offerLoan() {
    System.out.println("Loan at 6% interest");
}
```

---

## ✅ 2.4 Private Methods (Java 9)

* Used **inside the interface only**.
* Cannot be accessed by implementing classes.
* Improve code reusability.

```java
private void log() {
    System.out.println("Private logging");
}
```

---

## ✅ 2.5 Private Static Methods (Java 9)

* Helper methods inside the interface.
* Used by other static/default methods.
* Not accessible outside the interface.

```java
private static void helper() {
    System.out.println("Private static helper");
}
```

---

# ✅ 3. Combined Example with All Methods

```java
@FunctionalInterface
interface Bank {
    // 1. Abstract method
    void pay();

    // 2. Default method
    default void show() {
        log();   // calling private method
        System.out.println("Default show method");
    }

    // 3. Static method
    static void offer() {
        helper();  // calling private static method
        System.out.println("Static offer method");
    }

    // 4. Private method
    private void log() {
        System.out.println("Private logging");
    }

    // 5. Private static method
    private static void helper() {
        System.out.println("Private static helper");
    }
}

class SBI implements Bank {
    @Override
    public void pay() {
        System.out.println("Payment done by SBI");
    }
}

public class Test {
    public static void main(String[] args) {
        Bank bank = new SBI();
        bank.pay();
        bank.show();     // default method
        Bank.offer();    // static method
    }
}
```

---

# ✅ 4. Java 8 vs Java 9 Interface Features

| Feature Type           | Java 8 | Java 9 |
| ---------------------- | ------ | ------ |
| Abstract Methods       | ✅      | ✅      |
| Default Methods        | ✅      | ✅      |
| Static Methods         | ✅      | ✅      |
| Private Methods        | ❌      | ✅      |
| Private Static Methods | ❌      | ✅      |

---

# ✅ 5. Why Interface is Used?

🔹 To achieve abstraction
🔹 To support multiple inheritance
🔹 To define contracts/standards
🔹 To separate "what to do" from "how to do"
🔹 Used extensively in frameworks (Spring, Hibernate, JDBC)

---

# ✅ 6. When to Use Interface?

✅ Use an interface when:

* Behavior needs to be shared across unrelated classes.
* You need multiple inheritance.
* You design APIs or services.
* You want flexibility and loose coupling.


