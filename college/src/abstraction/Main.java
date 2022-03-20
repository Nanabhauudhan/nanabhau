package abstraction;

abstract class A{
	
	abstract public void meth1();
	
	public void meth2(){
		System.out.println("meth2");
	}
	
	static public void meth3(){
		System.out.println("meth3");
	}
}

class B extends A{

	@Override
	public void meth1() {
		// TODO Auto-generated method stub
		System.out.println("meth1");
	}

}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.meth2();
		b.meth1();
		A.meth3();
	}

}
