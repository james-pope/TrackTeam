public class Field extends TrackTeam {
    private int[] Distances;
    private int distance;
    private int inches;
    private String event;
    public Field(String Event) {
        event = Event;
    }
    public void sortDistances() {
        int[] arr = new int[Distances.length];
        for (int i = 0; i < Distances.length; i++) {
            for (int k = i + 1; k < Distances.length; k++) {
                if (Distances[i] < Distances[k]) {
                    int temp = Distances[i];
                    Distances[i] = Distances[k];
                    Distances[k] = temp;
                }
            }
        }
    }
    public int[] Throw(int numOfAthletes){
        int[] newArr = new int[numOfAthletes];
        for(int i = 0; i < numOfAthletes; i++) {    //simulates a throwing event
            distance = (int) (Math.random() * 60);
            newArr[i] = distance * 12;
        }
        Distances = newArr.clone();
        sortDistances();
        return Distances;
    }
}
