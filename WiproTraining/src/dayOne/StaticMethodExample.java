package dayOne;

class Utils {
	public static int add(int x, int y) {
		return x + y;
	}
}
public class StaticMethodExample {

	public static void main(String[] args) {
		int sum = Utils.add(6, 7); // no object creation needed
        System.out.println(sum);
	}

}
