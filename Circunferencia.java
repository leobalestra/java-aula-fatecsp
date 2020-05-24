class Circunferencia
{
    private double raio;
    
    public Circunferencia(double r)
    {
        public void setRaio(double r)
        {
            if (r>0)
                raio = r;
            else
                raio = 0;
        }
        
        public void getRaio()
        {
            return raio;
        }
        
        public void getArea()
        {
            return 3.14*(raio*raio);
        }
        
        public void getPerimetro()
        {
            return 2*3.14*raio;
        }
        
        public void getDiametro()
        {
            return 2*raio;
        }
    }    
}