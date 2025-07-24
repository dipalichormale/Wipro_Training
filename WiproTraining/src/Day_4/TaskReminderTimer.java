package Day_4;

public class TaskReminderTimer {
	public static void main(String[] args) {
		String[] tasks = {
				"wake up at 5 AM",
				"Doing Yoga and Meditation",
				"following moring rituals",
				"books reading",
				"breakfast",
				"training",
				"practicing programs",
				"lunch",
				"coding",
		};
		
		double[] times = {05.00,06.00,07.00,08.00,09.00,10.00,11.00,12.00,01.00,02.00,03.00};
		String a = "";
		
		for(int i=0;i<times.length;i++) {
			if(times[i] < 06) {
				a = "pm";
			}else {
				a = "am";
			}
			
			System.out.println("Now the time is : " +times[i]+""+a);
			System.out.println("So your task is : " +tasks[i]);
			System.out.println("------------------------------");

		}
	}

}
