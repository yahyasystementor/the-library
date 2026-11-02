package main.unittests;

import main.unittests.users.User;
import main.unittests.users.UserService;

import java.util.logging.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        UserService userService = new UserService();
        User user = new User("Yahya", "hello@gmail.com");

        userService.addUser(user);

        userService.getUserByEmail("Yahya@gmail.com");


        userService.updateUser("hello@gmail.com", "hello");

        userService.deleteUser("hello@gmail.com");





        /*
        //  Något har hänt
        logger.info("Program started");
        logger.info("User created");
        logger.info("Battle started");
        logger.info("Match result saved");



        //  Varning om något som har hänt
        logger.warning("User not found");
        logger.warning("Invalid menu choice");




        // Något har gått allvarligt fel
        logger.severe("Could not read file");
        logger.severe("Could not save match history");


        /*
        logger.info("Program started");
        logger.warning("Something went wrong");
        logger.severe("Something failed");

         */








    }
}
