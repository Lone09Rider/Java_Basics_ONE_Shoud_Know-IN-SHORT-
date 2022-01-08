
interface a
{
    public void show();
}

interface b
{
    public void show1();
}

interface c extends a, b
{
    public void show2();
}
public class Multiple_Inheritance {
    public static void main(String[] args) {
        c obj = new c() {
            @Override
            public void show2() {
                System.out.println("IN C");
            }

            @Override
            public void show() {
                System.out.println("IN A");
            }

            @Override
            public void show1() {
                System.out.println("IN B");
            }
        };
        obj.show();
        obj.show1();
        obj.show2();
    }
}
