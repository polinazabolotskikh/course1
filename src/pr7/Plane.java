package pr7;

public class Plane {
    class Wing{
        int weight;

        public Wing(int weight) {
            this.weight = weight;
        }

        public void enterWeight(){
            System.out.println("Вес крыла: "+weight);
        }
    }
Wing wing=new Wing(15);
    Wing wing1=new Wing(19);
    public void enter(){
        wing.enterWeight();
        wing1.enterWeight();
    }
}
