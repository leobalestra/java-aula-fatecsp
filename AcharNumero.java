class AcharNumero
{
 
    public void procuraNumero()
    {
    
        float elemento;
        boolean exist = false;
        int[] arg = {3, 6, 8, 87, 21, 1, 56, 45, 21, 78, 28, 14, 69, 52, 74, 123, 658, 954, 125, 458};
    
        
        for (int i=0; i<20;  i++)  
        {
            if(arg[i]==elemento)
            {  
                exist = true; //existe
                break; //encontrou, não precisa de procurar mais
            }  
        }
    
    
        if (existe) 
        {
            System.out.println("existena posição " + i);     
        } 
        else 
        {
            System.out.println("não existe");           
        }
    }
}