package practice3;

public class SoccerTeam {// parameterization of Methods

    public static void printTotalMembers(String name){
        System.out.println(11);
        System.out.println(name);
    }
    public static String printBestPlayer() {
        return "aga";

    }
    public  String printBestGoalkeeper(){
        return "Ashfaq";

    }

    public static void main(String[] args) {
        printTotalMembers("Asheq");
        String ref = printBestPlayer();
        System.out.println(ref);
        SoccerTeam aga = new SoccerTeam();
        aga.printBestGoalkeeper();
       // String RAF= printBestGoalkeeper();

        System.out.println(aga.printBestGoalkeeper());
    }
}

