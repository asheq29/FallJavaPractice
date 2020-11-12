package practice3;

public class Phone {

    String model;
    int year;

    public Phone(String model, int year){
this.model= model;
this. year = year;
    }

    public Phone (String model){
        this.model = model;
    }

    public void printPhone(){
        System.out.println(model);
        System.out.println(year);
    }

    public static void main(String[] args) {
        Phone phone = new Phone("Asus",2222);
        phone.printPhone();
        Phone phone1 = new Phone("Microsoft");
        phone1.printPhone();
    }
}
