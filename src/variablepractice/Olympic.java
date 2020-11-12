package variablepractice;

public class Olympic {
    public static void main(String[] args) {
        System.out.println(Canada.province);
        System.out.println(Usa.state);
        Usa usa = new Usa();
        System.out.println(usa.zipcode);
        Canada canada = new Canada();
        System.out.println(canada.zipCode);
    }
}
