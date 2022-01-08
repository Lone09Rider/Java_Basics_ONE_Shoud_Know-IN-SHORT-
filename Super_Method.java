
class S
{
    public S(int a)
    {
        System.out.println(a);
    }
    public void show()
    {
        int a = 10;
        System.out.println(a+" In S");
    }
}

class T extends S
{
    public T()
    {
        super(12);
    }
    public void show()
    {
        super.show();
    }
}

public class Super_Method {
    public static void main(String[] args) {

        T obj = new T();
        obj.show();

        S obj1 = new S(4);
        obj1.show();

    }
}
