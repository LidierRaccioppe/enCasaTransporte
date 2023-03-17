import javax.swing.*;

/**
 * Fabrica que devuelve el transporte
 * segun el tipo de embalaje
 */
public class FactoryTransport {
        public static final int CAMION = 1;
        public static final int BICICLETA = 2;
        public static  Integer codigoDePostal = null;
        public static  Float lineaX = null;
        public static  Float lineaY = null;
        public static  Float lineaZ = null;
        public static  Float peso = null;
        public static ITransporte getProduct(int tipo){
                codigoDePostal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su codigo postal"));
                lineaX = Float.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud de la linea de tierra")));
                lineaY = Float.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud de la linea de aire")));
                lineaZ = Float.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la profundidad")));
                peso = Float.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso")));
                switch (tipo){
                        case CAMION: return new Camion(codigoDePostal,lineaX,lineaY,lineaZ,peso);
                        case BICICLETA: return new Bicicleta(codigoDePostal,lineaX,lineaY,lineaZ,peso);
                        default: return null;
                }
        }
        {} //en casa anda mal
}