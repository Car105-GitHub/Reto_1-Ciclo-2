package co.edu.utp.misiontic2022.reto1.p61;

public class VentaProyecto {

    public int Tiempo;
    public double Monto;
    public double Interes;

    public double InteresCompuesto;
    public double diferencia;
    


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


public double calcularInteresSimple(int pTiempo, double pMonto, double pInteres){
    double InteresSimple = Math.round(InteresSimple=pMonto*(pInteres/100)*pTiempo);
    return InteresSimple;
    }




public double calcularInteresCompuesto(int pTiempo, double pMonto, double pInteres ){
    double InteresCompuesto = Math.round(InteresCompuesto= pMonto * (Math.pow (  (1+(pInteres/100)  ) , pTiempo  )  -1));
    return InteresCompuesto;
    }





public String compararInversion (){
    double diferencia =0;
    diferencia= this.calcularInteresCompuesto(pTiempo, pMonto, pInteres)
    return  "La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia ;
}
  
}


/*
public String compararInversion ( ){
    return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
          }


          (Math.round (InteresCompuesto= pMonto * (Math.pow (  (1+(pInteres/100)  ) , pTiempo  )  -1)) - 
    (Math.round( InteresSimple = pMonto*(pInteres/100)*pTiempo)));
          */