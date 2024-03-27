package basics;

import java.util.Random;
import java.util.Scanner;

public class ReadingInputsFromUserExample {
    public static void main(String[] args) {
        //Example of reading Console Input from Keyboard
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = s.nextLine();
        //Non-Integer value will cause exception
        System.out.print("Enter Age: ");
        int age = s.nextInt();
        System.out.print("Enter Gender(M/F): ");
        char gender = s.next().charAt(0);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);

        //example of using Scanner to parse comma delimited string
        Scanner s2 = new Scanner(GenerateRow());
        s2.useDelimiter(",");
        do{
            System.out.println(s2.nextInt());
        }while(s2.hasNext());

    }

    private static String GenerateRow(){
        Random r = new Random();
        return String.format("%d,%d,%d,%d,%d",r.nextInt(1,10),r.nextInt(11,20),r.nextInt(21,30),r.nextInt(31,40),r.nextInt(41,50));
    }
}
