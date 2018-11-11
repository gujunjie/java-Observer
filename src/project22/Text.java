package project22;

public class Text {

	public static void main(String[] args) {
		Teacher teacher=new Teacher();
		
		Student student1=new Student();
		Student student2=new Student();
		teacher.addObserver(student1);
		teacher.addObserver(student2);
		
		teacher.removeObserver(student1);
		
		teacher.noifyObserver("明天交作业");

	}

}
