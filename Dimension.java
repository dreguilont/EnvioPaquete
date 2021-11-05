/**
 *  Representa una dimensión
 *  
 *  @auhtor - DavidReguilon
 */
public class Dimension  
{
    private double alto;
    private double ancho;
    private double largo;

    /**
     * constructor  
     */
    public Dimension(double alto, double ancho, double largo)    {
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;

    }   

    /**
     * accesor para  el alto
     */
    public double getAlto()    {
        return alto;
    }

    /**
     * accesor para  el ancho
     */
    public double getAncho()    {
        return ancho;
    }

    /**
     * accesor para  el largo
     */
    public double getLargo()    {
        return largo;
    }

    /**
     * calcula y devuelve el volumen de la dimensión (en cm3)
     * El volumen = alto x ancho x largo
     */
    public double getVolumen() {
       //TODO
       return alto * ancho * largo;

    }
    
    /**
     * Devuelve una copia exacta al objeto actual
     */
    public Dimension clone() {
        //TODO
        Dimension dim = new Dimension(alto, ancho, largo);
        return new Dimension(this.alto, this.ancho,this.largo);

    }

    /**
     * Repesentación textual de la dimensión
     * (leer enunciado)
     */
    public String toString() {
        //TODO
        return String.format("%20s%10.2f(cm)\n", "Peso real:", getAlto())+
        String.format("%20s%10.2f(cm)\n", "Volumen:", getAncho())+
        String.format("%20s%10.2f(cm)\n", "Peso Volumétrico:", getLargo());

    }

    /**
     * Muestra en pantalla el objeto actual
     * Este método se incluye como método de prueba
     * de la clase Dimension
     */
    public void print() {
        System.out.println(this.toString());
    }
}
