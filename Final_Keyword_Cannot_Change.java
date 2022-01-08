
final class Q
{
    final int a = 10;
    public final void work()
    {
        System.out.println("Hi in Q");
    }
}

//class R extends Q  // Cannot Inherit From Final Q -> Error
//{
//
//}

public class Final_Keyword_Cannot_Change {
    public static void main(String[] args) {

        Q obj = new Q();
//        obj.a = 20; // Error
        obj.work();

    }
}
