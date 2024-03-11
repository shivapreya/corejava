package day1;

public class Student {
	
	private int sid;
	private String name;
	
	//explicit default constructor
	public Student()
	{
		this.sid=10;
		this.name="MVIT";
	}
	//parameterized constructor
	public Student(int sid,String name)
	{
		this.sid=sid;
		this.name=name;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + "]"+"by thamizh student";
	}
	
}



		
		
		

	


