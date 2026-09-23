package TestHashmapKey;

import java.util.HashMap;
import java.util.Map;

class UserKey {

    private String username;
    private int age;

    UserKey(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age){
        this.age = age;
    }


}
