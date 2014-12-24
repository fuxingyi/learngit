package myGitProject.zang.solo.test;

public class TestMain {
	public static void main(String[] args) {
		A a = new A();
		a.A();a.AA();
		C c = new C();
		c.AA();
	}
}

class A {
	public void A(){
		System.out.println("this is A!");
	}
	protected void AA(){
		System.out.println("this is AA!");
	}
}
class B extends A{
	public void A(){
		System.out.println("this is B!");
	}
}
class C extends B{
	
}
