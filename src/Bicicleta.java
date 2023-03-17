/**
 * Clase que especifica el metodo de transporte, siendo este una bicicleta
 * segun el FactoryTransport
 */
public class Bicicleta implements ITransporte{
    /**
     * El codigo de la recidencia de una edificio
     */
    private Integer codigoPostal;
    /**
     * Linea de Tierra, eje horizontal, largo, otro nombres.
     */
    private Float ejeX;
    /**
     * Linea de aire, eje vertical, altura, otros nombre.
     */
    private Float ejeY;
    /**
     * Linea de Fondo, eje de profundidad, profuntidad.
     */
    private Float ejeZ;
    /**
     * El peso cambia el coste, por el desgasto de mantener tal peso.
     */
    private Float peso;

    public Bicicleta(Integer codigoPostal, Float ejeX, Float ejeY, Float ejeZ, Float peso) {
        this.codigoPostal = codigoPostal;
        this.ejeX = ejeX;
        this.ejeY = ejeY;
        this.ejeZ = ejeZ;
        this.peso = peso;
    }

    /**
     *
     * @param CodigoPostall
     * @return precio  Parte de lo que tendra que pagar por el envio, sin tener en cuenta el impuesto de transporte o de aduana
     */
    public Float costeTotal(Integer CodigoPostall){
        Float precio = codigoPostal.floatValue()*0+5;
        return precio;
    }





}
