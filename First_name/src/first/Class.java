package first;

public class Class {

int rollno;
int age;

	public void first()
	{
		System.out.println("Welcome to all");
	}
	
	public void second()
	{
		System.out.println("Automation is easy");
	}

	public static void main(String[] agrs)
    {
		Class Manish = new Class();
		Manish.first();
		Manish.second();
		Manish.rollno = 30147;
		Manish.age = 15;
		System.out.println("Student Rollno is :" + Manish.rollno);
		System.out.println("Age of the student is :" + Manish.age);
    }
}
