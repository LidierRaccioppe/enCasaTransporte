/**
 * Posible empaquetados de los envios
 */
public interface ITransporte {

        public static final int PALET = 0;
        public static final int CAJACARTON = 1;
        public static final int CAJAMADERA = 2;

        /**
         * Abstracto que obliga a ingresar un Codigo Postal, y delimitara el coste
         * @param CodigoPostal codigo de ubicacion de una casa
         * @return el precio final por envio
         */
    public Float costeTotal ( Integer CodigoPostal);
}
