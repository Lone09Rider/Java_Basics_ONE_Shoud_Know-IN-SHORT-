package com.SRJ;

class Casio{
    public Casio(int a)
    {
        System.out.println("Hi ");
    }

    public Casio (int a, int b)
    {
        System.out.println(a+" "+ b);
    }
}


public class Cunstructor_Overloading {
    public static void main(String[] args) {

        Casio obj1 = new Casio(89);
        Casio onj = new Casio(2, 3);

    }
}
