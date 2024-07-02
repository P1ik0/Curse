package Lesson22;

public class chelovek {
    final String pol;

  public   chelovek(String pol)
    {
        this.pol = pol;
    }
    private boolean clever;
    public boolean isClever(){return clever;}


    //Инкапсуляция
    private StringBuilder name;
    public StringBuilder getName()
    {
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }
    public void setName(StringBuilder s){name = s;}


    private int vozvrast;
    public int getVozvrast(){return vozvrast;}
    public void setVozvrast(int i ){
        if (i>0){
            vozvrast = i;
        }
    }
    private int ves;
    public int getVes(){return ves;}
    public  void setVes(int i)
    {
        if (i>0){
            ves = i;
        }
    }
}
class Test
{
    public static void main(String[] args) {
        chelovek c = new chelovek("male");
        c.setName(new StringBuilder("Oleg"));
        System.out.println(c.getName());

    }
}
