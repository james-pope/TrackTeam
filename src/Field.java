public class Field extends TrackTeam {
    private int[] throwDistances;
    private int distance;
    private int inches;
    public Field() {
        super();
    }
    public int[] Throw(int numOfAthletes){
        int[] newArr = new int[numOfAthletes];
        for(int i = 0; i < numOfAthletes; i++) {    //simulates a throwing event
            distance = (int) (Math.random() * 60);
            newArr[i] = distance * 12;
        }
        throwDistances = newArr.clone();
        return throwDistances;
    }
}
