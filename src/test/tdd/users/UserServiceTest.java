package test.tdd.users;

import main.tdd.User;
import main.tdd.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    private UserService userService;
    private User user;


    /**
     * TODO Skriv tester för updateUser and getUser
     * Följ TDD
     * Skriv funktionalitet i UserService för metoderna
     * Refactor test
     *
     */

    @BeforeEach
    void setUp(){
        userService = new UserService();
        user = new User("Yahya", "Yahya@gmail.com");
    }














    @Test
    void getUserShouldReturnTheCorrectUser(){
        // Arrange
        userService.addUser(user);

        // Act
        User foundUser = userService.getUserByEmail("Yahya@gmail.com");

        // Assert Kontroll
        assertNotNull(foundUser);
        assertEquals("Yahya", foundUser.getName());

    }

    @Test
    void addUserShouldAddAUser(){
        // Arrange is up there in before each
        // Act
        userService.addUser(user);
        //Assert
        assertEquals(1, userService.getUserCount());
    }


    @Test
    void deleteUserShouldReturnTrueWhenUserIsDeleted(){
        // Arrange
        userService.addUser(user);

        boolean deleted = userService.deleteUser("Yahya@gmail.com");

        assertTrue(deleted);

        assertEquals(0, userService.getUserCount());

    }






    /*

    @Test
    void testTakeDamage(){

        // Arrange
        User user = new User();


        // Act
        user.takeDamage(20);

        // Kontroll
        assertEquals(70,user.getHp());


    }




     */



}
