package variablepractice;

public class TypesOfMethods {

    public static void main(String[] args) {
        printMyName();
        TypesOfMethods ref = new TypesOfMethods();
        ref.printMyAge();
       String name = getMyName();
        System.out.println(name);
        int age = getMyAge();
        System.out.println(age);
    }

    public static void printMyName(){
        System.out.println("Izraan");

    }
    public void printMyAge(){
        System.out.println(6);

    }
    public static int getMyAge(){
        return 10;
    }
    public static String getMyName(){
        return "Alizeh";
    }
}
