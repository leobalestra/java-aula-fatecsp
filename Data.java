public class Data {

    private int mes; // 1 a 12
    private int dia; // 1 a 31, de acordo com o mes
    private int ano; // qualquer ano
    
    public Data (int d, int m, int a)
    {
        setData(d, m, a);
    }
    
    public void setData(int d, int m, int a)
    {
        if (m > 0 && m <=12)
            mes = m;
        else
        {
            mes = 1;
            System.out.println("Mes " + m + 
                    " invalido. Configurado mes = 1.");
        }
        
        ano = a;
        dia = checkDia (d);
    }
    
    private int checkDia (int diaTeste)
    {
        int diasMes[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (diaTeste > 0 && diaTeste <= diasMes[mes])
            return diaTeste;
        System.out.println("Dia " + diaTeste +
                    " invalido. Configurado dia = 1.");
        return 1;
    }
    
    public String toString()
    {
        return dia + "/" + mes + "/" + ano;
    }
}
