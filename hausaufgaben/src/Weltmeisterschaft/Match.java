package Weltmeisterschaft;

public class Match {

    private Team team1;
    private Team team2;
    private byte goals1;
    private byte goals2;
    public Match(Team team1, Team team2, byte goals1, byte goals2) {
        this.team1 = team1;
        this.team2 = team2;
        this.goals1 = goals1;
        this.goals2 = goals2;
    }
    public Team getTeam1() {
        return team1;
    }
    public Team getTeam2() {
        return team2;
    }
    public int getGoals1() {
        return goals1;
    }
    public int getGoals2() {
        return goals2;
    }
    
    public int getPoints1() {
    	if(goals1 < 0 || goals2 < 0) {
    		return 0;
    	}
    	if(goals2 < goals1) {
    		return 3;
    	}
    	if(goals1 == goals2) {
    		return 1;
    	}
    	else {
    		return 0; 
    	}
    }
    
    public int getPoints2() {
    	if(goals1 < 0 || goals2 < 0) {
    		return 0;
    	}
    	if(goals1 < goals2) {
    		return 3;
    	}
    	if(goals1 == goals2) {
    		return 1;
    	}
    	else {
    		return 0; 
    	}
    }
    
    
}
