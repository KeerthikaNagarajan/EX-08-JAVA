## Ex-08:
## USING INHERITANCE ONE CLASS CAN ACQUIRE THE PROPERTIES OF OTHERS
### AIM:
To Write the java program Using Inheritance one class can acquire the properties of others.

### ALGORITHM:
1. Create the class and declare the main method so that the JVM will identify the main program to run.
2. Create another class and use the keyword EXTENDS to use the concept of INHERITANCE.
3. Print a statement to check whether the inner class is accessable or not.
4. If the extended class's statement is executed then,this program follows the concept of inheritance.
5. The program will be executed after the compilation and results are printed

### PROGRAM:
```java
public class Ex8 {
    public static void main(String[] args) {
        Bird c=new Bird();
        c.fly();
        c.walk();
        c.sing();
    }
}
class Bird extends Animal{
    public void fly(){
        System.out.println("I m flying");
    }
    public void sing(){
        System.out.println("I m singing");
    }
}
class Animal {
    public void walk(){
        System.out.println("I m walking");
    }
}
```

### OUTPUT:
<img width="86" alt="8" src="https://github.com/KeerthikaNagarajan/Java-Ex-8/assets/93427089/ff590764-c1ab-4263-84e9-87c519821bbd">

### RESULT:
Thus output is verified.

