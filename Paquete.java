import java.util.Random;
/**
 *  Un objeto de esta clase guarda los datos de un
 *  paquete
 * 
 * @author - DavidReguilón
 *  
 */
public class Paquete 
{
    private Random generador;
    private Dimension dimension;
    private double peso;
    /**
     * Constructor 1 sin parámetros
     * Crea el paquete con 40 , 30, 50 de
     * alto, ancho, largo (en cm) y peso 8 Kg
     */
    public Paquete()    {
        //TODO
        Dimension dimension = new Dimension(40, 30, 50);
        this.peso = 8;
    }

    /**
     * Constructor 2 
     *  Crea el paquete con el alto, ancho, largo (en cm) indicados
     *  y peso un valor aleatorio entre 2 y 8 Kg inclusive
     *  Se crea aquí el generador
     */
    public Paquete(double alto, double ancho, double largo)    {
        //TODO
        this.dimension = new Dimension(alto, ancho, largo);
        Random generador = new Random();
        peso = generador.nextDouble() * 6.00 + 2.00;
    }

    /**
     * Constructor 3 
     * Crea el paquete a la dimension y peso indicados
     * 
     */
    public Paquete(Dimension dimension, double peso)    {
        //TODO
        this.dimension = dimension;
        this.peso = peso;

    }

    /**
     * accesor para la dimensión
     */
    public Dimension getDimension() {
        return this.dimension;

    }

    /**
     * accesor para el peso
     */
    public double getPeso() {
        return this.peso;

    }

    /**
     * calcula y devuelve el volumen del paquete (en cm3)
     * El volumen = alto x ancho x largo
     */
    public double getVolumen() {
        //TODO
        return dimension.getAlto()*dimension.getAncho()*dimension.getLargo();
    }

    /**
     * calcula y devuelve el peso volumétrico del paquete (en Kg)
     * Peso volumétrico = volumen del paquete / 5000
     */
    public double getPesoVolumetrico() {
        //TODO
        return getVolumen() / 5000;
        
    }

    /**
     *  Devuelve el peso facturable de un paquete
     *  Siempre es el valor mayor entre su peso real y su peso volumétrico
     *      
     */
    public double calcularPesoFacturable() {
        //TODO
        return Math.max(peso, getPesoVolumetrico());
    }

    /**
     * Devuelve una copia exacta al objeto actual
     * Se obtienen copias también de los objetos que contenga
    **/
    public Paquete clone() {
        //TODO
        Dimension dim = new Dimension(dimension.getAlto(), dimension.getAncho(), dimension.getLargo());
        double pesoDim = this.peso;
        Paquete p = new Paquete(dim, pesoDim);
        return p;
    }

    /**
     * Representación textual del paquete
     *  (leer enunciado)
     */
    public String toString() {
        //TODO
        return String.format(dimension.toString()) +
        String.format("%20s%10.2f(Kg)\n", "Peso real:", calcularPesoFacturable())+
        String.format("%20s%10.2f(cm3)\n", "Volumen:", getVolumen())+
        String.format("%20s%10.2f(Kg)\n", "Peso Volumétrico:", getPesoVolumetrico());

    }

    /**
     * Muestra en pantalla el objeto actual
     * Este método se incluye como método de prueba
     * de la clase Paquete
     */
    public void print() {
        System.out.println(this.toString());
    }
}
