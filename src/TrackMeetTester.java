public class TrackMeetTester {

    public static void main(String[] args){
        TrackTeam Billerica = new TrackTeam("Billerica");
        TrackTeam Tewksbury = new TrackTeam("Tewksbury");
        TrackTeam Chelmsford = new TrackTeam("Chelmsford");
        TrackTeam Lowell = new TrackTeam("Lowell");
        TrackTeam[] Conference = {Billerica, Tewksbury, Chelmsford, Lowell};
        int[] billericaThrows = Billerica.Throw(4);
        for (int billericaThrow : billericaThrows) {
            System.out.println(billericaThrow);
        }
    }
}
