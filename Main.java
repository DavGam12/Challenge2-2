package Challenge2.Sala_De_Cine;

public class Main {// Cinema

    public static void main(String[] args) {
        CinemaRoom x = new CinemaRoom();

        Film y = new Film("Pinocchio", "Guillermo del Toro", 114);

        System.out.println(x.BackList());

        System.out.println(x.SeatsList());

        System.out.println(x.getEntrycost());

        System.out.println(y);
    }

}
