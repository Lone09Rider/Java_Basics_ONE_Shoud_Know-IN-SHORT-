
class P
{
    public void show()
    {
        System.out.println("In P");
    }
}

public class Anonymous_Inner_Class {
    public static void main(String[] args) {

        P obj = new P(){
            @Override
            public void show() {
                System.out.println("In Anonymous Show");
            }
        };
        obj.show();

    }
}
