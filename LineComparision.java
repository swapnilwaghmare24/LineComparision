package LineComparision;

import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.Math.*;

public class LineComparision {
    int x1, y1, x2, y2;
    String length;

    void getPoints() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting co-ordinates");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.println("Enter ending co-ordinates");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        }
        String calLength()
       {
            length = String.valueOf(Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
            return length;
       }
       public static void main(String[] args)
       {
                System.out.println("Welcome to line comparision computation program");
                LineComparision lc = new LineComparision();
                lc.getPoints();
                String length1 = lc.calLength();
                System.out.println("Length of First Line is "+length1);
                lc.getPoints();
                String length2= lc.calLength();
                System.out.println("Length of second Line is "+length2);

       }
}





