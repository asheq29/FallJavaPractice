package methodpractice;

public class StaticNonStatic {

    public static void main(String[] args) {
        StaticNonStatic PrintMyNAme = new StaticNonStatic();
        PrintMyNAme.printMynName();
        myCollege();
    }

    public void printMynName() {
        System.out.println("Asheq");
    }
    public  static void printMyAge() {
        System.out.println("44");
    }
    public void printMe(){
        printMyAge();
        printMynName();
        myCollege();
    }
    public static void myCollege(){
        System.out.println("Monroe");

    }
}
