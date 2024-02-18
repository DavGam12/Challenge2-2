package Challenge2.Sala_De_Cine;

public class Spectator {
    public final static String[] SPECTATOR_NAMES =
            {"David", "Alejandra", "Patricia",
            "Antón", "Roberto", "Diego",
            "Kit Connor", "Nanami", "Benji",
            "Pikachu", "Pichu", "Raichu",
            "Nidoran", "Bakougo", "Shikamaru",
            "Naruto", "Jiraya", "Sasuke",
            "Minato", "Miyamoto", "Python"};
    private String _name;
    private void setName(String pName){
        _name = pName;
    }
    //public String getName(){return _name;}

    private int _age;
    private void setAge(int pAge){_age = pAge;}
    public int getAge(){return _age;}

    private float _money;
    private void setMoney(float pMoney){_money = pMoney;}
    public float getMoney(){return _money;}

    public Spectator(String pName, int pAge, float pMoney){
        setName(pName);
        setAge(pAge);
        setMoney(pMoney);
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %2s", "Spectator with name: " + _name + ", Age: " + _age + " and Balance:" ,_money, "");
    }
}
