

public class DVD extends Elemento
{
    private String director;
    public DVD(String elTitulo, int tiempo, String director)
    {
        super(elTitulo, tiempo);
        this.director = director;
    }
    public void setDirector(String director)
    {
       this.director = director;
    }
    public String getDirector()
    {
       return director;
    }
    public void imprimir()
    {
        System.out.println("DVD");
        System.out.println("El director es" + director);
    }
}
