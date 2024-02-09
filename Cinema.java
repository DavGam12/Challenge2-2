package Challenge2.Sala_De_Cine;

public class Cinema {
    private Film _currentfilm;

    private float _entrycost;
    private void setEntrycost(float pEntrycost){
        _entrycost = pEntrycost;
    }
    public float getEntrycost(){
        return _entrycost;
    }

    public Cinema(float pEntrycost){
        setEntrycost(pEntrycost);
    }
}
