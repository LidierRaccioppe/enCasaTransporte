import javax.swing.*;

/**
 * Zona de construccion
 */
public class FactoryTransport {
        public static final int CAMION = 1;
        public static final int BICICLETA = 2;
        public static final int BARCO = 3;
        /**
         * El codigo de la recidencia de una edificio
         */
        public static  Integer codigoDePostal = null;
        /**
         * Linea de Tierra, eje horizontal, largo, otro nombres.
         */
        public static  Float lineaX = null;
        /**
         * Linea de aire, eje vertical, altura, otros nombre.
         */
        public static  Float lineaY = null;
        /**
         * Linea de Fondo, eje de profundidad, profuntidad.
         */
        public static  Float lineaZ = null;
        /**
         * El peso cambia el coste, por el desgasto de mantener tal peso.
         */
        public static  Float peso = null;

        /**
         * Obtener el producto, por el medio de la FactoryTransport
         * @param tipo sera la palanca que permitira cambiar el switch
         * @return
         */
        public static ITransporte getProduct(int tipo){
                codigoDePostal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su codigo postal"));
                lineaX = Float.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud de la linea de tierra")));
                lineaY = Float.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud de la linea de aire")));
                lineaZ = Float.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la profundidad")));
                peso = Float.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso")));
                switch (tipo){
                        case CAMION: return new Camion(codigoDePostal,lineaX,lineaY,lineaZ,peso);
                        case BICICLETA: return new Bicicleta(codigoDePostal,lineaX,lineaY,lineaZ,peso);
                        case BARCO: return new Barco(codigoDePostal,lineaX,lineaY,lineaZ,peso);
                        default: return null;
                }
        }
        {} //en casa anda mal
}