import java.util.Scanner;

public class WheresMyJeepney {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Please Enter The Number Of Seconds Here");
		
		int s = sc .nextInt();
		int h = s / 3600;
		int m = s % 3600 / 60;
		int s2 = s % 3600 % 60;
		
		System.out.println("is");
		System.out.println(h + " Hours " + m + " Minutes " + s2 + " Seconds)");
	}
}
