public class TesteData 
{
    public static void main (String args[])
	{
		Data data = new Data(06, 04, 2018);
      Bissexto bissexto = new Bissexto(2018);
		System.out.println("Meu anivers�rio: " + data.toString());
      if (bissexto == true  )
      {
          System.out.println("Ano Bissexto");
      }
      else
      {
          System.out.println("Ano n�o Bissexto");
      }
      

		data.setData(31, 02, 2018);
      bissexto.setBissexto(2018);
		System.out.println("Que data � essa? " + data.toString());
      if (bissexto == true  )
      {
          System.out.println("Ano Bissexto");
      }
      else
      {
          System.out.println("Ano n�o Bissexto");
      }
      
	}	
}
