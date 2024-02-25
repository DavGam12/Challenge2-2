package Challenge2.Sala_De_Cine;

public class Main {// Cinema

    public static void main(String[] args) {
        System.out.println(CinemaRoom.mainFilm + "\n");

        CinemaRoom[] mainCinemaRoom = new CinemaRoom[10];

        for (int iCount = 0; iCount<mainCinemaRoom.length; iCount++){
            mainCinemaRoom[iCount] = new CinemaRoom();
            mainCinemaRoom[iCount].BackList();
            System.out.println("\n");
        }
    }

}
