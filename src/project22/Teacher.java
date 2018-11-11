package project22;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements Subject{
	
	private List<Observer> list=new ArrayList<>();//��һ���б���װ�۲���
	
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void addObserver(Observer o) {
		list.add(o);//��ӵ��б���
		
	}
	
	@Override
	public void removeObserver(Observer o) {
		list.remove(o);//���б����Ƴ�
		
	}
	
	@Override
	public void noifyObserver(String data) {
	
		for(int i=0;i<list.size();i++)
		{
			list.get(i).update(data);//֪ͨÿһ���۲���
		}
		
	}

}
