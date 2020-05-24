class Retangulo
{
    private double base, altura;
    
    public Retangulo(double a, double b)
    {
        public void setBase(double b)
        {
            if (b>0)
                base = b;
            else
                base = 0;
        }
        
        public void getBase()
        {
            return base;
        }
        
        public void setAltura(double a)
        {
            if (a>0)
                altura = a;
            else
                altura = 0;
        }
        
        public void getAltura()
        {
            return altura;
        }
        
        public void getArea()
        {
            return base*altura;
        }
        
        public void getPerimetro()
        {
            return 2*base+2*altura;
        }
    }    
}