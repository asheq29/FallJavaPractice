package oop.inheritance;

public class C extends B {
    public void methodFromC(){
        System.out.println("method details from C");

    }

    public static void main(String[] args) {
        C c = new C();
        c.methodFromB();
        c.methodFromA();
    }
}
