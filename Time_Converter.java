import java.util.Scanner;

public class WheresMyJeepney {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter the number of seconds:");

        int totalSeconds = scanner.nextInt();
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        
        System.out.println("The time in hours, minutes, and seconds is:");
        System.out.printf("%d Hours %d Minutes %d Seconds\n", hours, minutes, seconds);
    }
}
