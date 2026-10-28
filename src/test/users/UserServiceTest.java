package test.users;

import main.unittests.users.User;
import main.unittests.users.UserService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    private UserService userService;
    private User user;

    @BeforeEach
    void setUp() {
        System.out.println("Before each test");
        userService = new UserService();
        user = new User("Anna", "anna@gmail.com");
    }

    @AfterEach
    void tearDown(){
        System.out.println("After each test");
        userService.getUsers().clear();
    }



    // Create

    @Test
    void addUserShouldAddNewUser(){

        // AA
        UserService userService1 = new UserService();
        User user = new User("Yahya", "Yahya@gmail.com");
        userService1.addUser(user);


        // A Arrange behövs inte längre för beforeEach skapar det åt oss

        // A Act



        // Assert Kontrollen
        assertEquals(1, userService1.getUsers().size());

        /*
        User foundUser = userService.getUserByEmail("anna@gmail.com");
        assertNotNull(foundUser);
        assertEquals("Anna", foundUser.getName());

         */
    }



    // Read


    @Test
    void getUserByEmailShouldReturnCorrectUser(){
        // Arrange längre upp i before each + lägga till användare eftersom before each rensar efter varje test
        userService.addUser(user);

        // Act
        User foundUser = userService.getUserByEmail("anna@gmail.com");

        //Assert
        assertNotNull(foundUser);
        assertEquals("Anna", foundUser.getName());
        assertEquals("anna@gmail.com", foundUser.getEmail());

    }



    // Update

    @Test
    void updateUserShouldChangeUserName(){
        // Arrange
        userService.addUser(user);


        //Act
        boolean updated = userService.updateUser("anna@gmail.com", "Yahya");

        assertTrue(updated);

        User updatedUser = userService.getUserByEmail("anna@gmail.com");

        assertEquals("Yahya", updatedUser.getName());

    }




    @Test
    void deleteUserShouldDeleteUser(){
        //Arrange
        userService.addUser(user);


        //Act
        boolean deleted = userService.deleteUser("anna@gmail.com");



        //Assert

        assertTrue(deleted);

        assertEquals(0, userService.getUsers().size());

        User foundUser = userService.getUserByEmail("anna@gmail.com");

        assertNull(foundUser);



    }















}


    /*

    @Test
    @DisplayName("Should create a user by name Yahya with email yahya@exempel.se")
    void addUserShouldAttAUser(){

        // A Arrange
        UserService userService = new UserService();
        User user = new User("Yahya", "Yahya@exempel.se");

        // A Act
        userService.addUser(user);

        // A Assert
        assertEquals(1,userService.getUsers().size());

        User foundUser = userService.getUserByEmail("Yahya@exempel.se");

        assertEquals("Yahya", foundUser.getName());
        assertEquals("Yahya@exempel.se", foundUser.getEmail());

    }


     */
