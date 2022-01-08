
class Calc
{

    public int sum(int ... i)
    {
        int sum = 0;
        for (int j:i)
        {
            sum = sum + j;
        }
        return sum;
    }
}

public class Vargs {
    public static void main(String[] args) {

        Calc obj = new Calc();
        System.out.println(obj.sum(1, 2, 3, 4, 5));

    }
}
