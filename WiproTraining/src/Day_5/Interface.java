package Day_5;

interface InterfaceA {
	void commonMethod();
}

interface InterfaceB {
	void commonMethod();
}

 interface InterfaceC {
	void commonMethod();
}
public class Interface implements InterfaceA, InterfaceB, InterfaceC{
	
	public void commonMethod() {
		System.out.println("Implementation of commonMethod in Interface class");
	}
	
	public static void main(String[] args) {
		Interface obj = new Interface();
		obj.commonMethod();
         
	}

}
