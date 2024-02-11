package Challenge2.Sala_De_Cine;

public class CinemaRoom {
    private Film _currentfilm;

    private float _entrycost;
    private void setEntrycost(float pEntrycost){
        _entrycost = pEntrycost;
    }
    public float getEntrycost(){
        return _entrycost;
    }

    private boolean[][] _backseats = new boolean[8][9];
    private void setBackseats(boolean[][] pBackseats){_backseats = pBackseats;}
    public boolean[][] getBackseats(){return _backseats;}

    private int _rndspectators = (int) (Math.random()*72);
    private void setRndspectators(int pRndspectators){ _rndspectators = pRndspectators;}
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

    public int SeatsList(){
        for (int iCount = 7; iCount>=0; iCount--){
            for (int jCount = 0; jCount<9; jCount++){
                System.out.printf("%s", FrontseatsFill()[iCount][jCount]);
            }
            System.out.println();
        }

        return 0;
    }

    public boolean[][] FillSeats(){
        for (int iCountNum = 0; iCountNum <_rndspectators; iCountNum++){
            int iPos;
            int jPos;

            boolean bOccupied;
            do{
                iPos = (int) (Math.random()*8);
                jPos = (int) (Math.random()*9);

                bOccupied = OccupiedSeat(iPos, jPos);

                if (!bOccupied){
                    _backseats[iPos][jPos] = true;
                }
            }while (bOccupied);
        }
        return _backseats;
    }
    public int BackList(){
        for (int iCount = 0; iCount<8; iCount++){
            for (int jCount = 0; jCount<9; jCount++){
                System.out.printf("%s ", _backseats[iCount][jCount]);
            }
            System.out.println();
        }

        return 0;
    }
    private boolean OccupiedSeat(int iPos, int jPos){
        return _backseats[iPos][jPos];
    }

    public CinemaRoom(int a){
        setEntrycost((float) a);
        setFrontseats(FrontseatsFill());
        setBackseats(FillSeats());
    }
}