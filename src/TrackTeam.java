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
    public int[] sortDistances(int[] arr){
        int temp;
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++)     //sorts distances in descending order
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (newArr[i] < newArr[j])
                {
                    temp = newArr[i];
                    newArr[i] = newArr[j];
                    newArr[j] = temp;
                }
            }
        }
        return newArr;
    }
    public int[] Throw(int numOfThrowers){
        Field field = new Field();
        return field.Throw(numOfThrowers);
    }
}