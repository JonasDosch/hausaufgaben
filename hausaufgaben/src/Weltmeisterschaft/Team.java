package Weltmeisterschaft;

public class Team {
	
    private String group;
    private String name;
    public Team(String group, String name) {
        this.group = group;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String getGroup() {
        return group;
    }
    @Override
    public String toString() {
        return name;
    }

}
