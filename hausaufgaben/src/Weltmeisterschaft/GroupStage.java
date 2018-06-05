package Weltmeisterschaft;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class GroupStage {
	
	Map<String, Team> teamsByName;
	ArrayList<Match> matches;
	
	public GroupStage() {
		teamsByName = new TreeMap<>();
		matches = new ArrayList<Match>();
	}
	
	

    public void readData() {
        try (BufferedReader reader = new BufferedReader(new FileReader("teams.csv"))) {
            String einlesen;
            while ((einlesen = reader.readLine()) != null) {
                String[] Lesen = einlesen.split(",");
                String Gruppe = Lesen[0];
                String Name = Lesen[1];
                Team team = new Team(Gruppe, Name);
                teamsByName.put(team.getName(), team);
            }
        } catch (IOException e) {
            System.err.println("Geht nischt!");
        }
        try (BufferedReader Matches = new BufferedReader(new FileReader("matches.csv"))) {
            String einlesen;
            while ((einlesen = Matches.readLine()) != null) {
                String[] Lesen = einlesen.split(",");
                Team team1 = teamsByName.get(Lesen[0]);
                Team team2 = teamsByName.get(Lesen[1]);
                byte goals1 = Byte.parseByte(Lesen[2]);
                byte goals2 = Byte.parseByte(Lesen[3]);
                Match match = new Match(team1, team2, goals1, goals2);
                matches.add(match);
            }
        } catch (IOException e) {
            System.err.println("Geht immer noch nischt!");
        }

}
    
    private int getPoints(Team team) {
        return matches.stream()
                .filter(match -> match.getTeam1() == team ||
                             match.getTeam2() == team)
                .mapToInt(match -> (match.getTeam1() == team)
                        ? match.getPoints1()
                        : match.getPoints2())
                .sum();
    }
    
    public void printPoints() {
    	teamsByName.values()
    	.forEach(team -> System.out.println(team + ": " + getPoints(team)));
    }
    
}
