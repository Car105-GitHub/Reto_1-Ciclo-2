package co.edu.utp.misiontic2022.reto1.p61;


public class App 
{
    public static void main( String[] args )
    {
        VentaProyecto ventaConstruccion = new VentaProyecto();
        System.out.println(ventaConstruccion.calcularInteresSimple(12,150000,2.0));
        System.out.println(ventaConstruccion.calcularInteresCompuesto(12,150000,2.0));
        //System.out.println(ventaConstruccion.compararInversion(36,200000,5.0));
    }
}
