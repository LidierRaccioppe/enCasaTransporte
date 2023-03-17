/**
 * Fabrica que devuelve el transporte
 * segun el tipo de embalaje
 */
public interface ITransporte {

        public static final int PALET = 0;
        public static final int CAJACARTON = 1;
        public static final int CAJAMADERA = 2;
    public Float costeTotal ( Integer CodigoPostal);
}
