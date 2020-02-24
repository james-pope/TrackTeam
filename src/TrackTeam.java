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
    public int[] sortDistances(int[] distances){
        int[] arr = new int[distances.length];
        for (int i=0; i<arr.length;i++) {
            for (int k=i;k<arr.length;k++) {
                if(arr[i] > arr[k]) {
                    int temp=arr[k];
                    arr[k]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        return arr;
    }
    public int[] Throw(int numOfThrowers){
        Field field = new Field();
        return field.Throw(numOfThrowers);
    }
}