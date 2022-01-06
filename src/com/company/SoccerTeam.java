package com.company;

public class SoccerTeam {
    private int wins;
    private int losses;
    private int ties;

    private static int goals;
    private static int gamesPlayed;

    public SoccerTeam(int w, int l, int t){
        wins = w;
        losses = l;
        ties = t;
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

    public static void


}
