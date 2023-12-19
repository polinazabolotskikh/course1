package pr6;

public abstract class Human implements Announcement{
    String name;
    String surname;

    @Override
    public void announcing() {
        System.out.println(this.getClass().getSimpleName()+" is right here!");
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public abstract String enter();

}
