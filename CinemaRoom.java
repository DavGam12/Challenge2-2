package Challenge2.Sala_De_Cine;

public class CinemaRoom {

    public static Film mainFilm = new Film("Pinocchio", "Guillermo del Toro", (int) (Math.round(100+Math.random()*200)));


    private Spectator[] SpectatorsCreation(){
        Spectator[] mainSpectatorArray = new Spectator[_rndspectators];
        for (int iCount = 0; iCount<_rndspectators; iCount++){
             mainSpectatorArray[iCount] = new Spectator(Spectator.SPECTATOR_NAMES[(int) (Math.round(Math.random()*20))], (int) (2+Math.random()*100), (float) (Math.random()*100));
        }

        return mainSpectatorArray;
    }

    private final static float _entrycost = 11.95F;

    public float getEntrycost(){
        return _entrycost;
    }

    private boolean[][] _backseats = new boolean[8][9];
    private void setBackseats(boolean[][] pBackseats){_backseats = pBackseats;}
    public boolean[][] getBackseats(){return _backseats;}

    private int _rndspectators = (int) (Math.random()*72);
    private void setRndspectators(int pRndspectators){_rndspectators = pRndspectators;}
    public int getRndspectators(){return _rndspectators;}

    private String[][] _frontseats = new String[8][9];
    private void setFrontseats(String[][] pFrontseats){_frontseats = pFrontseats;}
    public String[][] getFrontseats(){return _frontseats;}

    public String[][] FrontseatsFill(){
        String[][] strJokerArray = new String[8][9];
        for (int iCount = 7; iCount>=0; iCount--){
            for (int jCount = 0; jCount<9; jCount++){
                strJokerArray[iCount][jCount] = iCount+1 + String.valueOf(Switch((char) jCount)) + " ";
            }
        }
        return strJokerArray;
    }
    private char Switch(char iMainNum){
        switch (iMainNum){
            case 0->iMainNum = 'A';// A
            case 1->iMainNum = 'B';// B
            case 2->iMainNum = 'C';// C
            case 3->iMainNum = 'D';// D
            case 4->iMainNum = 'E';// E
            case 5->iMainNum = 'F';// F
            case 6->iMainNum = 'G';// G
            case 7->iMainNum = 'H';// H
            case 8->iMainNum = 'I';// I
        }
        return iMainNum;
    }

    public boolean[][] FillSeats(){
        Spectator[] mainSpectatorArray = SpectatorsCreation();

        int iTestCount = 0;

        for (int iCountNum = 0; iCountNum<_rndspectators; iCountNum++){
            int iPos;
            int jPos;

            boolean bOccupied;
            boolean bAge = mainSpectatorArray[iCountNum].getAge()<mainFilm.getMinimumage();// bAge = true  si el espectador no cumple el mínimo de edad
            boolean bMoney = mainSpectatorArray[iCountNum].getMoney()<getEntrycost();// bMoney = true  si el espectador no tiene suficiente dinero

            if (!bAge && !bMoney) {
                do {
                    iPos = (int) (Math.random() * 8);
                    jPos = (int) (Math.random() * 9);

                    bOccupied = OccupiedSeat(iPos, jPos);


                    if (!bOccupied) {
                        _backseats[iPos][jPos] = true;
                    }

                } while (bOccupied);
            }

            else if (bAge && bMoney) {System.out.println(mainSpectatorArray[iCountNum] + "couldn't enter because they didn't meet the minimum age requirement and they didn't have enough money to buy the entry\n"); iTestCount++;}
            else if (bAge) {System.out.println(mainSpectatorArray[iCountNum] + "couldn't enter because they didn't meet the minimum age requirement\n"); iTestCount++;}
            else if (bMoney) {System.out.println(mainSpectatorArray[iCountNum] + "couldn't enter because they didn't have enough money to buy the entry\n"); iTestCount++;}
        }
        return _backseats;
    }

    public void BackList(){

        for (int iCount = 0; iCount<8; iCount++){
            for (int jCount = 0; jCount<9; jCount++){

                if (!_backseats[iCount][jCount]){
                    System.out.printf("%s", "Oc ");
                } else {System.out.printf("%s", _frontseats[iCount][jCount]);}

            }
            System.out.println();
        }

    }

    private boolean OccupiedSeat(int iPos, int jPos){
        return _backseats[iPos][jPos];
    }

    public CinemaRoom(){
        setFrontseats(FrontseatsFill());
        setBackseats(FillSeats());
    }
}
