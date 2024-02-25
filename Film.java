package Challenge2.Sala_De_Cine;

public class Film {
    private final static int[] _agrerestriction = {3, 7, 12, 16, 18};
    private String _title;
    private void setTitle(String pTitle){
        _title = pTitle;
    }
    // public String getTitle(){return _title;}

    private String _director;
    private void setDirector(String pDirector){
        _director = pDirector;
    }
    //public String getDirector(){return _director;}

    private int _duration; // in mins
    private void setDuration(int pDuration){
        _duration = pDuration;
    }
    // public int getDuration(){return _duration;}

    private int _minimumage;
    private void setMinimumage(int pAge){
        _minimumage = pAge;
    }
    public int getMinimumage(){
        return _minimumage;
    }

    public Film(String pTitle, String pDirector, int pDuration){
        setTitle(pTitle);
        setDirector(pDirector);
        setDuration(pDuration);
        setMinimumage(_agrerestriction[(int) (Math.random()*5)]);
    }


    @Override
    public String toString() {
        return "Film: " + _title +
                ", Director: '" + _director +
                ", Duration: " + _duration +
                " and Minimum Age: " + _minimumage;
    }
}
