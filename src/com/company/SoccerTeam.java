package com.company;

public class SoccerTeam {
    private int wins;
    private int losses;
    private int ties;

    private static int goals;
    private static int gamesPlayed;

    public SoccerTeam(){
        wins = 0;
        losses = 0;
        ties = 0;
    }

    public void played(SoccerTeam other, int myScore, int otherScore){
        gamesPlayed ++;
        goals += myScore + otherScore;
        if (myScore > otherScore){
            wins ++;
            other.losses ++;
        }
        else if (myScore < otherScore){
            losses ++;
            other.wins ++;
        }
        else{
            ties ++;
            other.ties ++;
        }
    }

    public int teamPoints(){
        return wins * 3 + ties;
    }

    public void reset(){
        wins = 0;
        losses = 0;
        ties = 0;
    }

    public static int getGoals(){
        return goals;
    }

    public static int getGamesPlayed(){
        return gamesPlayed;
    }

    public static void startTournament(){
        goals = 0;
        gamesPlayed = 0;
    }

    public static void main(String[] args) {
        SoccerTeam billerica = new SoccerTeam();
        SoccerTeam tewksbury = new SoccerTeam();
        SoccerTeam methuen = new SoccerTeam();
        SoccerTeam haverhill = new SoccerTeam();

        billerica.played(tewksbury, 5, 2);
        billerica.played(methuen, 8, 0);
        billerica.played(haverhill, 2, 6);

        tewksbury.played(billerica, 4, 7);
        tewksbury.played(methuen, 5, 6);
        tewksbury.played(haverhill, 0, 2);

        methuen.played(billerica, 9, 4);
        methuen.played(tewksbury, 5, 6);
        methuen.played(haverhill, 4, 2);

        haverhill.played(billerica, 0, 1);
        haverhill.played(tewksbury, 9, 8);
        haverhill.played(methuen, 5, 5);

        System.out.println(billerica.teamPoints());
        System.out.println(tewksbury.teamPoints());
        System.out.println(methuen.teamPoints());
        System.out.println(haverhill.teamPoints());

        System.out.println(getGoals());
        System.out.println(getGamesPlayed());

        billerica.reset();
        tewksbury.reset();
        methuen.reset();
        haverhill.reset();

        startTournament();

        billerica.played(tewksbury, 5, 2);
        billerica.played(methuen, 1, 4);
        billerica.played(haverhill, 3, 3);

        tewksbury.played(billerica, 4, 7);
        tewksbury.played(methuen, 8, 6);
        tewksbury.played(haverhill, 7, 7);

        methuen.played(billerica, 9, 4);
        methuen.played(tewksbury, 5, 11);
        methuen.played(haverhill, 2, 2);

        haverhill.played(billerica, 0, 0);
        haverhill.played(tewksbury, 5, 3);
        haverhill.played(methuen, 1, 7);

        System.out.println(billerica.teamPoints());
        System.out.println(tewksbury.teamPoints());
        System.out.println(methuen.teamPoints());
        System.out.println(haverhill.teamPoints());

        System.out.println(getGoals());
        System.out.println(getGamesPlayed());

    }


}
