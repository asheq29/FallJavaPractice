package practice3;

public class Laptop { // Parameterization of constructor

    // default constructor

    int year;
    String model;
    public Laptop(){
        System.out.println("Macbook Pro");

    }
    public Laptop(int year){
        this.year = year;
    }
    public Laptop(int year, String  model){
        this.year = year;
        this.model = model;
    }

    public  void printDetailsOfLaptop(){
        System.out.println(year);
        System.out.println(model);

    }

    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.printDetailsOfLaptop();
        Laptop laptop1 = new Laptop(2020, "Lenevo");
        laptop1.printDetailsOfLaptop();
        Laptop laptop2 = new Laptop();
        laptop2.printDetailsOfLaptop();

    }
    }

