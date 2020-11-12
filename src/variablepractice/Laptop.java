package variablepractice;

public class Laptop {
   public static String company = "Apple";
      public static int modelYear= 2019;
    public static void main(String[] args) {
        printNumberOfKeys();
        printCompany();
        printModelName();
    }

    public static void printNumberOfKeys(){
        System.out.println(32);
    }
    public static void printModelName(){
        String model = "MacBook Pro";
        System.out.println(model);
    }
    public static void printCompany(){
        System.out.println(company);
        Laptop laptop = new Laptop();
        System.out.println(laptop.modelYear);

    }
}
