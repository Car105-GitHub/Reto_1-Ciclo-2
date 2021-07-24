package co.edu.utp.misiontic2022.reto1.p61;

public class VentaProyecto {

    public int Tiempo;
    public double Monto;
    public double Interes;


public VentaProyecto() {
        this.Tiempo = 0;
        this.Monto = 0;
        this.Interes = 0;

    }

public VentaProyecto(int tiempo, double monto, double interes) {
        this.Tiempo = tiempo;
        this.Monto = monto;
        this.Interes = interes;

    }


public double calcularInteresSimple(){
    double InteresSimple = Math.round(InteresSimple=this.Monto*(this.Interes/100)*this.Tiempo);
    return InteresSimple;
    }

public double calcularInteresCompuesto(){
        double InteresCompuesto = Math.round(InteresCompuesto= this.Monto * (Math.pow (  (1+(this.Interes/100)  ) , this.Tiempo  )  -1));
        return InteresCompuesto;
        }


public String compararInversion (){


    // this.Tiempo = 0;
    // this.Monto = 0;
    // this.Interes = 0;

    double diferencia =0;
    diferencia = this.calcularInteresCompuesto() - this.calcularInteresSimple() ;

    if (diferencia == 0) {
        return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
    }
    else{
        return  "La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia ;}
    }



public String compararInversion (int tiempo, double monto, double interes ){


    this.Tiempo = tiempo;
    this.Monto = monto;
    this.Interes = interes;


    double diferencia =0;
    diferencia = this.calcularInteresCompuesto() - this.calcularInteresSimple() ;

    if (diferencia == 0) {
        return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
    }
    else{
        return  "La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia ;}
    }
}