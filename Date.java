
//convert date format from DD/MM/YYYY TO DD/MONTHNAME/YYYY
import java.util.Scanner;

public class Date {
	public static void main(String[] args) {
		int d, m, y;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the date in dd,mm,yyyy");
		d = sc.nextInt();
		m = sc.nextInt();
		y = sc.nextInt();
		String mon = null;
		switch (m) {
		case 1:
			mon = "January";
			break;
		case 2:
			mon = "Febaury";
			break;
		case 3:
			mon = "March";
			break;
		case 4:
			mon = "April";
			break;
		case 5:
			mon = "MAY";
			break;
		case 6:
			mon = "June";
			break;
		case 7:
			mon = "July";
			break;
		case 8:
			mon = "august";
			break;
		case 9:
			mon = "september";
			break;
		case 10:
			mon = "october";
			break;
		case 11:
			mon = "November";
			break;
		case 12:
			mon = "December";
			break;
		default:
			System.out.println("invalid");
		}
		System.out.println(d + " /" + mon + "/" + y);
	}
}
