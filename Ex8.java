//  USING INHERITANCE ONE CLASS CAN ACQUIRE THE PROPERTIES OF OTHERS
public class Ex8 {
    public static void main(String[] args) {
        Bird c=new Bird();
        c.fly();
        c.walk();
        c.sing();
    }
}
//CLASS FILE: BIRD
class Bird extends Animal{
    public void fly(){
        System.out.println("I m flying");
    }
    public void sing(){
        System.out.println("I m singing");
    }
}
//CLASS FILE: ANIMAL
class Animal {
    public void walk(){
        System.out.println("I m walking");
    }
}