public class TrackTeam {
    public static int EventsScored = 0;
    private int points;
    private String TeamName;
    private String event;
    public String toString(){
        return TeamName;
    }
    public TrackTeam(String name) {
        TeamName = name;
        points = 0;
    }
    public TrackTeam() {
        TeamName = "Unattached";
        points = 0;
    }
    public int getPoints(){
        return points;
    }
    public String getTeamName() {
        return TeamName;
    }
    public int[] Throw(int numOfThrowers){
        Field field = new Field("ShotPut");
        return field.Throw(numOfThrowers);
    }
    public void runField(){
        
    }
}