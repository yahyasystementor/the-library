package main.errorhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args)   {








        //IOException

        //





        /*

        IllegalArgumentException
        Används när en metod får ett argument som har fel värde


        setAge(-5);
        public static void setAge(int age) {
            if (age < 0) {
                throw new IllegalArgumentException("Age must be a positive integer");
            }
        }


         */








        // NumberFormatException
        // När du försöker konvertera text till tal men texten innehåller inte ett giltig tal
        // int age = Integer.parseInt("Twenty");
        // System.out.println(age);



        //ArrayIndexOutOfBoundsException
        // När du försöker läsa en polats i en array/Lista som inte finns
       // int[] numbers = {1,2,3};
       // System.out.println(numbers[3]);






        // NullPointerException = Försöker använda ett objekt som är null
       // String name = null;
       // System.out.println(name.length());

    }



       /*

    public static void startRegistration() {
        int age = readAge("twenty");
        System.out.println("Age is " + age);
    }



    public static int readAge(String text) {
            return Integer.parseInt(text);
    }



    public static int readAge(String text) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("Fel!: " + text + " is not a number");
            return 0;
        }
    }

     */

}
