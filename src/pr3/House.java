package pr3;

public class House {
    int storeys;
    int year;
    String name;
    public void setAll(int storeys, int year, String name){
       this.name=name;
       this.storeys=storeys;
       this.year=year;
    }
    public String enterAll(){
        return name+", "+storeys+", "+year;
    }
    public int quantityYears(){
        return 2023-year;
    }

}
