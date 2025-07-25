package Day_4;

import java.util.Timer;
import java.util.TimerTask;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Queue;

public class TimerProgram {

    private static Queue<String> tasks = new LinkedList<>();
    private static DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm a");

    public static void main(String[] args) {
        // Initialize tasks
        tasks.offer("Wake up (5:00 AM)");
        tasks.offer("Doing yoga & meditation");
        tasks.offer("Morning rituals");
        tasks.offer("Breakfast");
        tasks.offer("Training session");
        tasks.offer("Coding practice");
        tasks.offer("Lunch");
        // Add more tasks if needed to cover your entire day

        Timer timer = new Timer();

        // Schedule the task to run every hour (60 * 60 * 1000 milliseconds)
      
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (!tasks.isEmpty()) {
                    String currentTask = tasks.poll(); // Get and remove the next task
                    System.out.println("---");
                    System.out.println("⏰ Hourly Reminder: It's " + LocalTime.now().format(timeFormatter) + ".");
                    System.out.println("Time for: " + currentTask);
                    System.out.println("---");
                } else {
                    System.out.println("---");
                    System.out.println("All tasks for today completed! You can restart the program for tomorrow.");
                    System.out.println("---");
                    timer.cancel(); // Stop the timer if all tasks are done
                }
            }
        }, 60 * 06 * 1000, 60 * 60 * 1000); // Delay 1 hour, then repeat every 1 hour

        System.out.println("Task Reminder started. You'll get your first reminder in 1 hour.");
        System.out.println("Press Ctrl+C to stop the program at any time.");
    }
}

