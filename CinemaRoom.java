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
        for (int i = 7; i>=0; i--){
            for (int j = 0; j<9; j++){
                System.out.printf("%s", FrontseatsFill()[i][j]);
            }
            System.out.println();
        }

        return 0;
    }


    public CinemaRoom(int a){
        setEntrycost((float) a);
    }
}
