
class X
{
    public void show()
    {
        System.out.println("IN X");
    }
}

class Y extends X
{
    public void show2()
    {
        System.out.println("IN Y");
    }
}

class Z extends Y
{
    public void show3()
    {
        System.out.println("IN Z");
    }
}

public class Inheritance_Multilevel {
    public static void main(String[] args) {

        Z obj = new Z();
        obj.show();
        obj.show2();
        obj.show3();

    }
}
