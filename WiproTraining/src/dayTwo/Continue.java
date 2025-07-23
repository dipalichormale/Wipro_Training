package dayTwo;

public class Continue {

	public static void main(String[] args) {
		
		for(int i=0;i<10;i++) {
			if(i==4) {
				System.out.println("I am reached " +i);
				continue;
			}
			System.out.println(i);
		}


	}

}
