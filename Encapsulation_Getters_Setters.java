
class Stud
{
    private int roll;
    private String name;

    public void setRoll(int r)
    {
        roll = r;
    }
    public int getRoll()
    {
        return roll;
    }
    public void setName(String n)
    {
        name = n;
    }
    public String getName()
    {
        return name;
    }
}


public class Encapsulation_Getters_Setters {
    public static void main(String[] args) {

        Stud s1 = new Stud();
        s1.setName("King");
        s1.setRoll(76);
        System.err.println(s1.getName()+" "+s1.getRoll());

    }
}
