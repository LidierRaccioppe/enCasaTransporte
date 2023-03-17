import javax.swing.*;

/**
 * La Main o App
 */
public class Main {
    /**
     * Objeto General para usar los metodos
     */
    static ITransporte it; // es un default
    public static void main(String[ ] args){
        /**
         * almacena el tipo de trasporte que puede ser
         */
        String tipo = null;//objetos puedne ser nulos
        /**
         * almacena el precio final por el trasporte
         */
        Float costeTotal = null; //objetos pueden ser nulos
        /**
         * Afectara segun que empaqueta se usa (o embalaje)
         */
        Integer numeroDelTipo = null;//Integer objeto de int a groso modo  --- para embalaje
        /**
         * Agarre para elegir la clase de envio
         */

        int palanca = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 o 2 o 3   para  CAMION  o  BICICLETA   o  CAMION dependiendo de con cual quiere que se lo enviemos, respectivamente"));

        switch(palanca){

            case 1: it = FactoryTransport.getProduct(FactoryTransport.CAMION);
                break;
            case 2: it = FactoryTransport.getProduct(FactoryTransport.BICICLETA);
                break;
            case 3: it = FactoryTransport.getProduct(FactoryTransport.BARCO);
                break;
            default: break;
        }
        costeTotal = it.costeTotal(FactoryTransport.codigoDePostal);

        System.out.println("Coste Total =" + costeTotal);
    }
}