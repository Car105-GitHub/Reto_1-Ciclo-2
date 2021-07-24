package co.edu.utp.misiontic2022.reto1.p61;


public class App 
{
    public static void main( String[] args )
    {
        VentaProyecto ventaConstruccion = new VentaProyecto();

        System.out.println(ventaConstruccion.calcularInteresSimple());
        System.out.println(ventaConstruccion.calcularInteresCompuesto());
        System.out.println(ventaConstruccion.compararInversion(36,200000,5.0));
        System.out.println("-----------------------------------------------------");

        VentaProyecto ventaConstruccion2 = new VentaProyecto(12,150000,2.0);

        System.out.println(ventaConstruccion2.calcularInteresSimple());
        System.out.println(ventaConstruccion2.calcularInteresCompuesto());
        System.out.println(ventaConstruccion2.compararInversion());
        System.out.println("-----------------------------------------------------");

        VentaProyecto ventaConstruccion3 = new VentaProyecto();

        System.out.println(ventaConstruccion3.calcularInteresSimple());
        System.out.println(ventaConstruccion3.calcularInteresCompuesto());
        System.out.println(ventaConstruccion3.compararInversion());
        System.out.println("-----------------------------------------------------");













    }
}
