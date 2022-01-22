package week1.day1;

public class Student {
	
	String name = "Karthika";
	byte rollNumber = 5;
	
	public void printCollege()
	{
		System.out.println("College Name :" + "Easwari Engineering");
		
	}
	private int getRollnumber()
	{
		int roll=24;
		return(roll);
	}
     void collegeName(String name)
	{
		System.out.println(name);
		
	}

	public static void main(String[] args) {
		
		Student object = new Student();
		object.printCollege();
		int num = object.getRollnumber();
		System.out.println("Roll Number :" + num);
		System.out.println("Student Name :" + object.name);
		
}
}
