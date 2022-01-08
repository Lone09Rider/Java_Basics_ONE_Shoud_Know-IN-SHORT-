public class For_Loops {
    public static void main(String[] args) {


        int[] a = {1, 2, 3};

        for (int k:a)
        {
            System.out.println(k);
        }

        System.out.println();

        int[][] i = {
                {1, 2, 3},
                {4, 5, 6},
                {1, 2},
        };

        for (int[] x: i)
        {
            for (int y:x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }

        System.out.println();

        int b = 9;
        for (int r = 1; r<=10; r++)
        {
            System.out.println(b*r);
        }

    }
}
