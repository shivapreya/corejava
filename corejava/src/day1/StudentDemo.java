package day1;

public class StudentDemo {

	public static void main(String[] args) {
		
		
		Student s1=new Student();
		s1.setSid(101);
		s1.setName("Suriya");
		System.out.println(s1.getSid()+" "+s1.getName());
		
		Student s2=new Student();//invoking default constructor
		System.out.println(s2);// calling toString
		
		Student s3=new Student(47,"Thamizh");//invoking parameterized constructor
		System.out.println(s3);// calling toString
		

	}

}
