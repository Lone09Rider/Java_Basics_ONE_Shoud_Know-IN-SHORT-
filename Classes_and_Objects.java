
class Student // CLASS
{
    public void stu_info(String name, int rno)
    {
        System.out.println("Your name is : " + name + ", With Roll Number : "+ rno);
    }
}


public class Classes_and_Objects {
    public static void main(String[] args) {

        Student obj = new Student();  // OBJECT
        obj.stu_info("Ram", 89);

    }
}
