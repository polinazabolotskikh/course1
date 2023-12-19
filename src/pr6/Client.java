package pr6;

public class Client extends Human{

    String bankName;

    @Override
    public void announcing() {
        super.announcing();
    }

    public Client(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    @Override
    public String enter() {
        return this.getClass().getSimpleName() +
                " name='" + name + '\'' +
                ", surname='" + surname + '\'' + '\'' +
                ", bank name='" + bankName +'\''+
                '}';
    }
}
