/**
 * Fabrica que devuelve el transporte
 * segun el tipo de embalaje
 */
public class FactoryTransport {
        public static final int PALET = 0;
        public static final int CAJACARTON = 1;
        public static final int CAJAMADERA = 2;

        public static IComun getProduct(){
                switch(type){
                        case PALET:{
                                return new Transporte();
                                break;
                        }
                        case CAJACARTON:{
                                return new CajaCarton();
                                break;
                        }
                        case CAJAMADERA:{
                                return new CajaMadera();
                                break;
                        }
                        default{

                        }


                }





}


}