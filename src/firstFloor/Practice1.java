package firstFloor;

public class Practice1 {// class begins

    String vacumme = "dyson";

    public static void bedRoom() {// method begins
      String tv = "Samsung";
        System.out.println(tv);
    }// method ends

    public  void livingRoom(){
        String tv =" lg";
        System.out.println(tv);
    }

    public static void main(String[] args) {
        Practice1 ref = new Practice1();
        ref.livingRoom();
        Practice1 vacumme = new Practice1();
        System.out.println(vacumme);
    }
}// class ends

