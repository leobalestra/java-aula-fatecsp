public class Bissexto {

    private int ano; // qualquer ano
    
    public Bissexto (int a)
    {
        setBissexto(a);
    }
    
    public boolean setBissexto(int a)
    {
        ano = a;
        
        if ( ( ano % 4 == 0 && ano % 100 != 0 ) || ( ano % 400 == 0 ) ){
            return true;
        }
        else{
            return false;
        }
    }
}
