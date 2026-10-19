package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Path path = Path.of("users.txt");


        try(BufferedReader reader = Files.newBufferedReader(path,StandardCharsets.UTF_8)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");

                String name = parts[0];
                int age = Integer.parseInt(parts[1]);
                String email =parts[2];






                Users users = new Users(name,age,email);
                System.out.println(users.getName());



            }
        } catch (Exception e) {
            System.out.println("Couldn't read file");
        }






        /*

          try(BufferedReader reader = Files.newBufferedReader(path,StandardCharsets.UTF_8)) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("TEST " +line);
            }
        } catch (IOException e) {
            System.out.println("Couldn't read file");
        }




        try {
            String content = Files.readString(path);
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("Could not read users.txt");
            System.out.println(e.getMessage());
        }
         */




        /*
        List<Users> users = new ArrayList<>();
        users.add(new Users("Yahya", 35, "yahya@gmail.com"));
        users.add(new Users("Emily", 20, "Emily@gmail.com"));
        users.add(new Users("Gabriel", 20, "Gabriel@gmail.com"));





        try (BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)){
            for (Users user: users) {
                writer.write(user.getName() + "," + user.getAge() + "," + user.getEmail());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Could not save users");
            System.out.println(e.getMessage());
        }

         */
    }
}
