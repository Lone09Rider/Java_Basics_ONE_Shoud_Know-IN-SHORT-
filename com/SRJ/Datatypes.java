package com.SRJ;

public class Datatypes {
    public static void main(String[] args) {
        // Numbers
        int x = 9;
        double d = 1.6;
        float f = 1.6f;
        System.out.println(x);
        System.out.println(d);
        System.out.println(f);

        // Strings
        char c = 'A';
        String s = "Manish";
        System.out.println(c);
        System.out.println(s);

        // Array - 1D
        int[] lis = {1, 9, 33, 4, 5};
        for (int i : lis) {
            System.out.println(i);
        }

        // Array - 2D
        int[][] lis2 = {
                {1, 2, 3, 4, 5},
                {5, 4, 3, 2, 1},
                {1, 2, 3}
                        };
        for (int i[] :lis2)
        {
            for (int j:i)
            {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}

