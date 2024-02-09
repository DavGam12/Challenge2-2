package Challenge2.Sala_De_Cine;

public class Film {
    private String _title;
    private void setTitle(String pTitle){
        _title = pTitle;
    }
    public String getTitle(){
        return _title;
    }

    private String _director;
    private void setDirector(String pDirector){
        _director = pDirector;
    }
    public String getDirector(){
        return _director;
    }

    private int _duration; // in mins
    private void setDuration(int pDuration){
        _duration = pDuration;
    }
    public int getDuration(){
        return _duration;
    }

    private int _minimumage;
    private void setMinimumage(int pAge){
        _minimumage = pAge;
    }
    public int getMinimumage(){
        return _minimumage;
    }

    public Film(String pTitle, String pDirector, int pDuration, int pMinimumage){
        setTitle(pTitle);
        setDirector(pDirector);
        setDuration(pDuration);
        setMinimumage(pMinimumage);
    }
}
