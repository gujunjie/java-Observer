package project22;

public class Student implements Observer{
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void update(String data) {
		System.out.println(data);//做出反应
		
	}

}
