import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws AWTException, InterruptedException {
        System.out.println("Enter time");
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();

        for(;;) {
            Thread.sleep(num);
            clickMouse(300, 300);
        }




    }
    public static void  clickMouse(int x, int y) throws AWTException
    {
        Robot robot = new Robot();
        robot.mouseMove(x, y);
    }
}