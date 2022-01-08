
class A
{
    public void show()
    {
        System.out.println("In A");
    }
}

class B extends A
{
    public void show2()
    {
        System.out.println("IN B");
    }
}


public class Inheritance_Single_Level {
    public static void main(String[] args) {

        B obj = new B();
        A obj1 = new A();
        obj.show();
        obj.show2();

    }
}
