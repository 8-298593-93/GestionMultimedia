


public class CD extends Elemento
{
    private String interprete;
    private int numeroDeTemas;

    public CD(String elTitulo, String elInterprete, int temas, int tiempo)
    {
       super(elTitulo, tiempo);
       interprete = elInterprete;
       numeroDeTemas = temas; 
    }
    public String getInterprete(){
        return interprete;
    }
    public int getNumeroDeTemas(){
        return numeroDeTemas;
    }
    public void imprimir()
    {
        System.out.println("CD");
        System.out.println("El interprete es" + interprete);
        System.out.println("Numero de temas" + numeroDeTemas);
    }
}
