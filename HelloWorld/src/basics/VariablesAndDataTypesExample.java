package basics;

import java.awt.*;
import java.util.Date;

public class VariablesAndDataTypesExample {
    public static void main(String[] args) {
        //all primitive types
        byte age = 23;
        long viewCount = 1_234_567_890L;
        float price = 234.43F;
        char gender = 'F';
        boolean isValid = true;
        System.out.println(age);
        System.out.println(viewCount);
        System.out.println(price);
        System.out.println(gender);
        System.out.println(isValid);

        //non-primitive
        String name = "King Koopa";
        Date now = new Date();
        System.out.println(name);
        System.out.println(now);

        //p2 will reference the same object in memory.
        //Changing one will change both
        Point p = new Point(0,12);
        Point p2 = p;
        System.out.println(p.x + " : " + p.y);
        System.out.println(p2.x + " : " + p2.y);
        System.out.println();

        //changing p will also change p2
        p.x = 34;
        System.out.println(p.x + " : " + p.y);
        System.out.println(p2.x + " : " + p2.y);
        System.out.println();

        //changing p2 will also change p
        p2.y = -2;
        System.out.println(p.x + " : " + p.y);
        System.out.println(p2.x + " : " + p2.y);
        System.out.println();

        //clone makes a copy, instead of referencing the same object in memory
        Point p3 = (Point)p.clone();
        System.out.println(p.x + " : " + p.y);
        System.out.println(p2.x + " : " + p2.y);
        System.out.println(p3.x + " : " + p3.y);
        System.out.println();

        //Only p3 will have x = 5
        p3.x = 5;
        System.out.println(p.x + " : " + p.y);
        System.out.println(p2.x + " : " + p2.y);
        System.out.println(p3.x + " : " + p3.y);
        System.out.println();
    }
}
