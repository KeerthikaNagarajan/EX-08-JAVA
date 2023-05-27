## Ex-8
## USING INHERITANCE ONE CLASS CAN ACQUIRE THE PROPERTIES OF OTHERS
### Aim:
To Write the java program Using Inheritance one class can acquire the properties of others.

### Procedure:
* Create the class and declare the main method so that the JVM will identify the main program to run.
* Create another class and use the keyword EXTENDS to use the concept of INHERITANCE.
* Print a statement to check whether the inner class is accessable or not.
* If the extended class's statement is executed then,this program follows the concept of inheritance.
* The program will be executed after the compilation and results are printed

### Code:
```
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

### Output:
<img width="86" alt="8" src="https://github.com/KeerthikaNagarajan/Java-Ex-8/assets/93427089/ff590764-c1ab-4263-84e9-87c519821bbd">

### Result:
Thus output is verified.

