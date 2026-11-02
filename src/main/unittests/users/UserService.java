package main.unittests.users;

import java.util.HashMap;
import java.util.logging.Logger;

public class UserService {

    private HashMap<String,User> users = new HashMap<>();

    private static final Logger logger = Logger.getLogger(UserService.class.getName());


    // CRUD Create Read Update Delete

    public void addUser(User user) {
        users.put(user.getEmail(),user);
        logger.info("User created " + user.getEmail());
    }





    public User getUserByEmail(String email){
        User user = users.get(email);
        if (user == null){
            logger.warning("User not found " + email);
        }
        return user;

    }




    public boolean updateUser(String email, String newName){
        User user = users.get(email);

        if (user == null) {
            logger.warning("User not found");
            return false;
        }
        user.setName(newName);
        logger.info("User updated " + user.getEmail());
        return true;

    }

    public boolean deleteUser(String email){
        User user = users.remove(email);

        if (user == null){
            logger.warning("User not found");
            return false;
        }
        logger.info("User deleted " + user.getEmail());
        return true;
    }


    public HashMap<String, User> getUsers() {
        return users;
    }
}
