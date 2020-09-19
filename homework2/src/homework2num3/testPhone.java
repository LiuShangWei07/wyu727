package homework2num3;

import java.io.ObjectInputStream.GetField;

public class testPhone {
	public static void main(String[] args) {
		Phone a=new Phone();
		a.setSzie(11);
		a.setBrand("apple");
		a.setCpu("A11");
		a.setMemory("two");
        System.out.println(a.getBrand()+a.getCpu()+a.getMemory()+a.getSzie());
	}
}
