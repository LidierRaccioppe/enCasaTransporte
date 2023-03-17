import javax.swing.*;

public class Main {

    static ITransporte it; // es un default
    public static void main(String[ ] args){
        String tipo = null;//objetos puedne ser nulos
        Float costeTotal = null; //objetos pueden ser nulos
        Integer numeroDelTipo = null;//Integer objeto de int a groso modo  --- para embalaje

        int palanca = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 o 2    para  CAMION  o  BICICLETA dependiendo de con cual quiere que se lo enviemos, respectivamente"));

        switch(palanca){

            case 1: it = FactoryTransport.getProduct(FactoryTransport.CAMION);
                break;
            case 2: it = FactoryTransport.getProduct(FactoryTransport.BICICLETA);
                break;
            default: break;
        }
        costeTotal = it.costeTotal(FactoryTransport.codigoDePostal);

        System.out.println("Coste Total =" + costeTotal);
    }
}