import java.awt.*;
import java.sql.Timestamp;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws AWTException, InterruptedException {
//        System.out.println("Enter time");
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input a number: ");
//        int num = in.nextInt();

        for (; ; ) {
            clickMouse(300, 600, 800000);
        }
    }


    public static void clickMouse(int min, int max, int time) throws AWTException, InterruptedException {

        Robot robot = new Robot();
        Random rn = new Random();

        int x = rn.nextInt(max - min + 1) + min;
        int y = rn.nextInt(max - min + 1) + min;

        System.out.println("sleep + " + new Timestamp(System.currentTimeMillis()));
        Thread.sleep(time);
        System.out.println("change mouse + " + new Timestamp(System.currentTimeMillis()));
        robot.mouseMove(x, y);
    }
}