package main.tdd;

import java.util.HashMap;

public class UserService {

    private HashMap<String, User> users = new HashMap<>();



    public void addUser(User user){
        users.put(user.getEmail(), user);
    }


    public boolean deleteUser(String email){
        User removeUser = users.remove(email);

        if (removeUser == null){
            return false;
        }
        return true;
    }

    public User getUserByEmail(String email){
        return users.get(email);
    }

    public int getUserCount(){
        return users.size();
    }

}
