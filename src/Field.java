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
            newArr[i] = distance;
            if (distance < 240) throwDistances[i] = 0;
        }
        for (int i = 0; i < numOfAthletes; i++)
        {
            for (int j = i + 1; j < numOfAthletes; j++)
            {
                if (a[i] < a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return throwDistances;
    }
}
