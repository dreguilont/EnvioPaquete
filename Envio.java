
/**
 *  Un objeto de esta clase representa un envío de varios paquetes,
 *  máximo tres
 *  
 * 
 * @author -   DavidReguilon
 *  
 */
public class Envio
{
    private final double PRECIO_KILO = 2.2;  // precio coste envío Kg. en euros
    private Paquete paquete1;
    private Paquete paquete2;
    private Paquete paquete3;

    /**
     * Constructor  
     * Inicializa los paquetes a null (inicialmente
     * el envío no tiene paquetes)
     */
    public Envio()    {
        this.paquete1 = null;
        this.paquete2 = null;
        this.paquete3 = null;

    }

    /**
     * accesor para el paquete1
     */
    public Paquete getPaquete1() {
        return paquete1;

    }

    /**
     * accesor para el paquete2
     */
    public Paquete getPaquete2() {
        return paquete2;

    }

    /**
     * accesor para el paquete3
     */
    public Paquete getPaquete3() {
        return paquete3;

    }

    /**
     * Devuelve el nº de paquetes en el envío
     * (dependerá de cuántos paquetes estén a null)
     */
    public int getNumeroPaquetes() {
        //TODO
       int NumeroPaquetes = 0;
       if(this.getPaquete1() != null){
           NumeroPaquetes++;
       }
       if(this.getPaquete2() != null){
           NumeroPaquetes++;
       }
       if(this.getPaquete3() != null){
           NumeroPaquetes++;
       } 
       return NumeroPaquetes;
    }

    /**
     * Devuelve true si el envío está completo, false en otro caso
     * (tiene exactamente 3 paquetes)
     */
    public boolean isEnvioCompleto() {
       //TODO
       if(getNumeroPaquetes() == 3){
           return true;
       }else{
           return false;
       }
    }

    /**
     * Se añade un nuevo paquete al envío
     * Si el envío está completo se muestra
     * el mensaje "No se admiten más paquetes en el envío"
     * Si no está completo se añade el paquete al envío teniendo en cuenta
     * si se añade como primero, segundo o tercero (no han de quedar huecos)
     */
    public void addPaquete(Paquete paquete) {
       //TODO
       if(isEnvioCompleto() == true){
           System.out.print("No se admiten más paquetes en el envío");
       }else{
           if(this.getPaquete1() == null){
               paquete1 = paquete.clone();
               getNumeroPaquetes();
           }
           if(this.getPaquete2() == null){
               paquete2 = paquete.clone();
               getNumeroPaquetes();
           }
           if(this.getPaquete3() == null){
               paquete3 = paquete.clone();
               getNumeroPaquetes();
           } 
       }

    }

    /**
     * Calcula y devuelve el coste total del envío
     * 
     * Para calcular el coste:
     *      - se obtiene el peso facturable de cada paquete 
     *      - se suman los pesos facturables de todos los paquetes del envío
     *      - se calcula el coste en euros según el precio del Kg 
     *      (cada Kg. no completo se cobra entero, 5.8 Kg. se cobran como 6, 5.3 Kg. se cobran como 6)
     *     
     *  
     */
    public double calcularCosteTotalEnvio() {
        //TODO
       double PesoTotal = Math.ceil(paquete1.calcularPesoFacturable()) + 
       Math.ceil(paquete2.calcularPesoFacturable()) + 
       Math.ceil(paquete3.calcularPesoFacturable());
       double PrecioTotal = PesoTotal * PRECIO_KILO;
       return PrecioTotal;

    }

    /**
     * Representación textual del envío
     * con el formato exacto indicado
     * (leer enunciado)
     */
    public String toString() {
       //TODO
       
       return "Nº Paquetes: "+ paquete1.toString() + paquete2.toString() + paquete3.toString();
       
    }

    /**
     * Muestra en pantalla el objeto actual
     * Este método se incluye como método de prueba
     * de la clase Envio
     */
    public void print() {
        System.out.println(this.toString());
    }

    
}
