package methodpractice;

public class Barcelona {
    public static void main(String[] args) {
        printStadium();
        Barcelona barcelona = new Barcelona();
        barcelona.bestPlayer();
    }
    public void bestPlayer() {
        System.out.println("Messi");
    }

    public static void printStadium() {
        System.out.println("Camp Nou");

    }
}
