package Mapping;

public class MyKey implements Comparable{
	
  int key;
	public MyKey(int i) {
		// TODO Auto-generated constructor stub
		this.key=i;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		MyKey tm1=(MyKey)o;
		return this.key-tm1.key;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Key: "+this.key;
	}
	

}
