package Day_3;

class Shape {
	void draw() {
		System.out.println("Drawimg a shape");
	}
}

class Circle extends Shape {
	//Override
	void draw() {
		System.out.println("Drawing a circle");
	}
}

class Rectangle extends Shape {
	// Override
	void draw() {
		System.out.println("Drawing a rectangle");
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		Shape s1 = new Shape();
		Shape s2 = new Shape();
		s1.draw();
		s2.draw();

	}

}
