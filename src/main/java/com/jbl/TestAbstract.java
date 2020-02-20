package com.jbl;

public class TestAbstract {

	private static MyAbstract theA;
	private static MyInterface theI;
	
	public static void main(String[] args) {
		System.out.println("Stuff List...");
	
		setAnAbstract(new MyClassA());
		setAnInterface(new MyClassI());
		
		System.out.println(theI.getStuff1(1));
		System.out.println(theA.getStuff2(1));
	
	}

	
	private static void setAnAbstract(MyAbstract anA) {
		theA = anA;
	}

	private static void setAnInterface(MyInterface anI) {
		theI = anI;
	}
	
}


class MyClassA extends MyAbstract{

	@Override
	public String getStuff2(int idxStuff) {
		return "Stuff 2";
	}
	
}

class MyClassI implements MyInterface{

	@Override
	public String getStuff1(int idxStuff) {
		return "Stuff 1";
	}
	
}


interface MyInterface{
	public String getStuff1(int idxStuff);
}

abstract class MyAbstract{
	
	public abstract String getStuff2(int idxStuff);
	
	public String getStuff3(int idxStuff) {
		return "Stuffs 3";
	}
	
}
