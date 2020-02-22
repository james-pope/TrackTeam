public class TrackTeam {
    public static int EventsScored = 0;
    private int points;
    private String TeamName;
    private String event;
    public TrackTeam(String name){
        TeamName = name;
        event = "";
        points = 0;
    }
    public String getTeamName(){ return TeamName;}
    public static void main(String[] args){
        TrackTeam Billerica = new TrackTeam("Billerica");
        TrackTeam Tewksbury = new TrackTeam("Tewksbury");
        TrackTeam Chelmsford = new TrackTeam("Chelmsford");
        TrackTeam Lowell = new TrackTeam("Lowell");
        TrackTeam Dracut = new TrackTeam("Dracut");
        TrackTeam Haverill = new TrackTeam("Haverill");
        TrackTeam Methuen = new TrackTeam("Methuen");
        TrackTeam Lawrence = new TrackTeam("Lawrence");
        TrackTeam CentralCatholic = new TrackTeam("Central Catholic");
        TrackTeam NorthAndover = new TrackTeam("North Andover");
        TrackTeam Andover = new TrackTeam("Andover");
        TrackTeam[] Conference = {Billerica, Tewksbury, Chelmsford, Lowell, Dracut, Haverill, Methuen, Lawrence, CentralCatholic, NorthAndover, Andover};
        for(int i = 0; i < Conference.length; i++){     //prints each team's name
            System.out.println(Conference[i]);
        }
    }

}
