package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String name = "Asel";
        System.out.println(name);
        Scanner scanner = new Scanner(System.in);
        String secondName = scanner.nextLine();
        System.out.println(secondName);

        System.out.println("- Атын ким ?");
        String myName = scanner.nextLine();

        System.out.println(" - Жашын канчада ?");
        int myAge2 = scanner.nextInt();
        System.out.println(" - А менин атым JAVA , таанышканыма кубанычтамын !");
        int number  = 10 ;
        System.out.println(number);
        float number2 = (float) (number - 0.2);
        System.out.println(number2);

        String nedelya=scanner.nextLine();
        switch (nedelya) {
            case "1":
                System.out.println("ponedelnik");
                break;
            case "2":
                System.out.println("vtornik");
                break;
            case "3":
                System.out.println("sreda");
                break;
            case "5":
                System.out.println("pyatnitsa");
                break;
            case "6":
                System.out.println("subbota");
                break;
            case "7":
                System.out.println("voskresenya");
                break;
        }

    }
}
