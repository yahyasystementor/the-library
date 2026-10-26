package main.dayfour;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        System.out.println(now);



        LocalDate today = LocalDate.now();

        System.out.println(today);


        /*
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");


        String formatedDate = today.format(formatter);

        System.out.println(formatedDate);


         */




    }
}






     /*


        Random radom = new Random();

       // int dice = radom.nextInt(1, 7);

        int dice = radom.nextInt(6) + 1;

        // 0 1 2 3 4 5

        // + 1

        // 1 2 3 4 5 6



        System.out.println(dice);

         */









  /*
        //  STRING AND STRING MANIPULATIONS


        String personalNumber = "19910221-1234";
        String year = personalNumber.substring(0,4);
            1 9 9 1 0 2 2 1
            0 1 2 3 4 5 6 7
        System.out.println(year);

         */


        /*

        String data = "Anna, 25, Stockholm";

        String[] parts = data.split(",");

        System.out.println(parts[0]);
        System.out.println(parts[1]);
        System.out.println(parts[2]);


         */

  /*
        String text = "Java är krånglig";

        text = text.replace("krånglig", "roligt");

        System.out.println(text);


         */


/*

        String[] names = {"Anna", "Erik", "Sara"};

        StringBuilder builder = new StringBuilder();


        for (int i = 0; i < names.length; i++) {

            builder.append(names[i]);
            builder.append("\n");

        }

        String result = builder.toString();
        System.out.println(result
        );


        StringBuilder builder = new StringBuilder();

        builder.append("Anna");
        builder.append(" ");
        builder.append("Andersson");

        String result = builder.toString();

        System.out.println(result);


         */

