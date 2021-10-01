package question4;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class usingScans {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = scan.next();

        System.out.println("What is your lucky number?");
        Integer myLuckynum = scan.nextInt();

        System.out.println("Your name is" + userName +" and you said your lucky number is " + myLuckynum);
    }
}
