package methodpractice;

public class ChampionsLeague {
    public static void main(String[] args) {
        RealMadrid objRealMadrid = new RealMadrid();
        Barcelona objBarcelona = new Barcelona();
        objRealMadrid.bestPlayer();
        objBarcelona.bestPlayer();
        RealMadrid.printStadium();
        Barcelona.printStadium();
    }

    public void worldXI() {
        Barcelona objBarcelona = new Barcelona();
        objBarcelona.bestPlayer();
    }

}
