
abstract class Human
{
    public abstract void eat();
    public void say()
    {
        System.out.println("Say");
    }
}


public class Abstract_Class {
    public static void main(String[] args) {

        Human obj = new Human() {
            @Override
            public void eat() {
                System.out.println("Chicken is Best");
            }
        };
        obj.eat();
        obj.say();

    }
}
