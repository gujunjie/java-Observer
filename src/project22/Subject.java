package project22;

public interface Subject {
    //���۲���
	
	void addObserver(Observer o);//��Ӷ�����
	void removeObserver(Observer o);//�Ƴ�������
	void noifyObserver(String data);//֪ͨ��������������
}
