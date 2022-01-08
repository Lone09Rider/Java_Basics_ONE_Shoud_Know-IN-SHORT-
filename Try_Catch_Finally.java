public class Try_Catch_Finally {
    public static void main(String[] args) {

        try {
            int i = 7;
            int j = 0;
            int k = i/j;
            System.out.println(k);
        }
        catch (Exception e)
        {
            System.err.println("Cannot Divide by 0");
        }
        finally {
            System.out.println("This is the End");
        }

    }
}
