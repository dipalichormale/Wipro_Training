package Day_5;

interface Printable {
	default void processData() {
		System.out.println("Processing data for printing.");
	}
}

interface Loggable {
	default void processData() {
		System.out.println("Loggable loggable.");
	}
}

class DocumentProcess implements Printable, Loggable {
	@Override
	public void processData() {
		//Opt1: provide new implementation specific to documentProcess
		System.out.println("processing data for doucument management.");
		
		//Opt2: call a specific default implementation
		Printable.super.processData();
		Loggable.super.processData();
		
	}
}
public class MyMainApp {

	public static void main(String[] args) {
		DocumentProcess Process = new DocumentProcess();
		Process.processData();

	}

}
