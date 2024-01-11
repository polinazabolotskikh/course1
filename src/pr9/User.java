package pr9;

import java.util.HashMap;
import java.util.Map;

public class User {
    public String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
    public void getMap(User u){
        Map<User,Integer> map=new HashMap<>();
        map.put(new User("Jack"),100);
        map.put(new User("Jhon"),200);
        map.put(new User("Leo"),300);
        if(map.containsKey(u)){
            System.out.println("Количество очков: "+map.get(u));
        }
        else{
            System.out.println("Not found");
        }
    }
}