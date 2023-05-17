package OopsConcepts;

public class Encapsulation {

	private int rollNo;
	private String name;
	private boolean isAttended;
	
	
//	public  Encapsulation(int rollNo)
//	{
//		this.rollNo=rollNo;
//		System.out.println(this.rollNo);
//	}
//	public void setStudentAttendance(boolean flag)
//	{
//		isAttended=flag;
//		System.out.println("Teacher Assigned attendance to Student");
//		
//	}
//	public boolean getStudentAttendancce()
//	{
//		System.out.println("Teacher Accessed Student attendance");
//		return isAttended;
//	}
//	
//	public static void main(String[] args) {
//		
//		Encapsulation s=new Encapsulation(12);
//		s.setStudentAttendance(true);
//		s.getStudentAttendancce();
		
		
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isAttended() {
		return isAttended;
	}
	public void setAttended(boolean isAttended) {
		this.isAttended = isAttended;
	}
	public static void main(String[] args) {
		
		
		Encapsulation s=new Encapsulation();
		s.setAttended(true);
		s.setName("mani");
		s.setRollNo(25);
		System.out.println(s.getName());
		System.out.println(s.getRollNo());
		
		
		
		
		
		
		
	}
		
	}


