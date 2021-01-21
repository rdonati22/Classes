public class SoccerTeam {

    private int wins;
    private int losses;
    private int ties;

    private static int gamesPlayed = 0;
    private static int goalsScored = 0;

    public SoccerTeam (){
        wins = 0;
        losses = 0;
        ties = 0;
    }

    public void played (SoccerTeam other, int myScore, int otherScore){
        gamesPlayed++;
        goalsScored += myScore+otherScore;
        if (myScore == otherScore){
            this.ties++;
            other.ties++;
        }
        else if (myScore>otherScore){
            this.wins++;
            other.losses++;
        }
        else{
            this.losses++;
            other.wins++;
        }
    }

    public int getPoints(){
        return wins*3+ties;
    }

    public void reset(){
        wins = 0;
        losses = 0;
        ties = 0;
    }

    public static int getGamesPlayed(){
        return gamesPlayed;
    }

    public static int getGoalsScored(){
        return goalsScored;
    }

    public static void startTournament(){
        gamesPlayed = 0;
        goalsScored = 0;
    }

    public static void main(String[] args){
        SoccerTeam one = new SoccerTeam();
        SoccerTeam two = new SoccerTeam();
        SoccerTeam three = new SoccerTeam();
        SoccerTeam four = new SoccerTeam();

        one.played(two, 2,5);
        System.out.println("Team 1: 2 goals \t Team 2: 5 goals");
        System.out.println("Team 1 has " + one.getPoints() + " points");
        System.out.println("Team 2 has " + two.getPoints() + " points");
        System.out.println(getGamesPlayed() + " games have been played");
        System.out.println(getGoalsScored() + " goals have been scored");

        two.played(four, 1,3);
        System.out.println("Team 2: 1 goal \t Team 4: 3 goals");
        System.out.println("Team 2 has " + two.getPoints() + " points");
        System.out.println("Team 4 has " + four.getPoints() + " points");
        System.out.println(getGamesPlayed() + " games have been played");
        System.out.println(getGoalsScored() + " goals have been scored");

        three.played(one, 6, 0);
        System.out.println("Team 3: 6 goals \t Team 1: 0 goals");
        System.out.println("Team 3 has " + three.getPoints() + " points");
        System.out.println("Team 1 has " + one.getPoints() + " points");
        System.out.println(getGamesPlayed() + " games have been played");
        System.out.println(getGoalsScored() + " goals have been scored");

        four.played(three, 4, 4);
        System.out.println("Team 4: 4 goals \t Team 3: 4 goals");
        System.out.println("Team 4 has " + four.getPoints() + " points");
        System.out.println("Team 3 has " + three.getPoints() + " points");
        System.out.println(getGamesPlayed() + " games have been played");
        System.out.println(getGoalsScored() + " goals have been scored");

        one.reset();
        two.reset();
        three.reset();
        four.reset();

        startTournament();

        one.played(four, 3,1);
        System.out.println("Team 1: 3 goals \t Team 2: 1 goal");
        System.out.println("Team 1 has " + one.getPoints() + " points");
        System.out.println("Team 4 has " + four.getPoints() + " points");
        System.out.println(getGamesPlayed() + " games have been played");
        System.out.println(getGoalsScored() + " goals have been scored");

        two.played(three, 2,2);
        System.out.println("Team 2: 2 goals \t Team 3: 2 goals");
        System.out.println("Team 2 has " + two.getPoints() + " points");
        System.out.println("Team 3 has " + three.getPoints() + " points");
        System.out.println(getGamesPlayed() + " games have been played");
        System.out.println(getGoalsScored() + " goals have been scored");

        three.played(one, 0, 2);
        System.out.println("Team 3: 0 goals \t Team 1: 2 goals");
        System.out.println("Team 3 has " + three.getPoints() + " points");
        System.out.println("Team 1 has " + one.getPoints() + " points");
        System.out.println(getGamesPlayed() + " games have been played");
        System.out.println(getGoalsScored() + " goals have been scored");

        four.played(two, 7, 6);
        System.out.println("Team 4: 7 goals \t Team 2: 6 goals");
        System.out.println("Team 4 has " + four.getPoints() + " points");
        System.out.println("Team 2 has " + two.getPoints() + " points");
        System.out.println(getGamesPlayed() + " games have been played");
        System.out.println(getGoalsScored() + " goals have been scored");
    }
}