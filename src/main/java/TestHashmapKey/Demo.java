package TestHashmapKey;
import java.util.*;

public class Demo {

    public static void main(String[] args) {
        UserKey key = new UserKey("alice", 12);

        Map<UserKey, String> map =
                new HashMap<>();

        map.put(key, "ABC");

        System.out.println(map.get(key));
        // ABC

        key.setUsername("bob");
        key.setAge(15);

        System.out.println(map.get(key));
        // ABC
    }
}
