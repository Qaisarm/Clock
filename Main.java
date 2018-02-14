
import java.util.Scanner;
class Main {
  public static void main(String [] args) {

int hour;
int minute;
System.out.println("Enter a hour: ");
Scanner in = new Scanner(System.in);
hour = in.nextInt();
System.out.println("Enter start minute ");
minute = in.nextInt();
    ClockDisplay clock = new ClockDisplay();

    clock.setTime (hour, minute);
    System.out.println(clock.getTime());
    clock.setTime (12, 30);
    System.out.println(clock.getTime());

  }
}
