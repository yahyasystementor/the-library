package test.users;

import main.unittests.User;
import main.unittests.UserService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserServiceTest {






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



}
