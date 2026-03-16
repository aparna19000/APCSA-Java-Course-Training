package ACP;
public class Student
{
    int rollNo;
    String name;
    int marks;

    // Method to assign values
    void setDetails(int r, String n, int m)
    {
        rollNo = r;
        name = n;
        marks = m;
    }

    // Method to display student details
    void showDetails()
    {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("----------------------");
    }

    public static void main(String[] args)
    {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
        Student s6 = new Student();
        Student s7 = new Student();
        Student s8 = new Student();
        Student s9 = new Student();
        Student s10 = new Student();

        // Assigning details
        s1.setDetails(1,"Sam",95);
        s2.setDetails(2,"Tom",94);
        s3.setDetails(3,"Riya",93);
        s4.setDetails(4,"Aman",92);
        s5.setDetails(5,"Neha",91);
        s6.setDetails(6,"Karan",90);
        s7.setDetails(7,"Anita",89);
        s8.setDetails(8,"Rahul",88);
        s9.setDetails(9,"Meena",87);
        s10.setDetails(10,"Arjun",86);

        // Displaying details
        s1.showDetails();
        s2.showDetails();
        s3.showDetails();
        s4.showDetails();
        s5.showDetails();
        s6.showDetails();
        s7.showDetails();
        s8.showDetails();
        s9.showDetails();
        s10.showDetails();
    }
}