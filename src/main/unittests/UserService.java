package main.unittests;

import java.util.HashMap;

public class UserService {

    private HashMap<String,User> users = new HashMap<>();


    // CRUD Create Read Update Delete

    public void addUser(User user) {
        users.put(user.getEmail(),user);
    }

    public User getUserByEmail(String email){
        return users.get(email);
    }

    /**
     * TODO
     * WRITE TESTS FOR THE METHODS BELOW
     * CLEAN UP THE TESTS WITH BEFOREEACH AND AFTEREACH
     */



    public boolean updateUser(String email, String newName){
        User user = users.get(email);

        if (user == null) {
            return false;
        }
        user.setName(newName);
        return true;

    }

    public boolean deleteUser(String email){
        User user = users.remove(email);

        if (user == null){
            return false;
        }
        return true;
    }


    public HashMap<String, User> getUsers() {
        return users;
    }
}
