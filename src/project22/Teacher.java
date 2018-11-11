package project22;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements Subject{
	
	private List<Observer> list=new ArrayList<>();//用一个列表来装观察者
	
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void addObserver(Observer o) {
		list.add(o);//添加到列表中
		
	}
	
	@Override
	public void removeObserver(Observer o) {
		list.remove(o);//从列表中移除
		
	}
	
	@Override
	public void noifyObserver(String data) {
	
		for(int i=0;i<list.size();i++)
		{
			list.get(i).update(data);//通知每一个观察者
		}
		
	}

}
