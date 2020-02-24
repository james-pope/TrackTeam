public class TrackMeetTester {
    public static void main(String[] args){
        TrackTeam Billerica = new TrackTeam("Billerica");
        TrackTeam Tewksbury = new TrackTeam("Tewksbury");
        TrackTeam Chelmsford = new TrackTeam("Chelmsford");
        TrackTeam Lowell = new TrackTeam("Lowell");
        TrackTeam[] Conference = {Billerica, Tewksbury, Chelmsford, Lowell};
        int[] BillericaThrows = Billerica.Throw(4);
        for(int i = 0; i < BillericaThrows.length; i++){
            System.out.println(BillericaThrows[i]);
        }
        //        for(int i = 0; i < Conference.length; i++){     //prints each team's name
//            System.out.println(Conference[i]);
//        }
    }
}
