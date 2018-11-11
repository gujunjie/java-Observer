package project22;

public interface Subject {
    //被观察者
	
	void addObserver(Observer o);//添加订阅者
	void removeObserver(Observer o);//移除订阅者
	void noifyObserver(String data);//通知订阅者做出更新
}
