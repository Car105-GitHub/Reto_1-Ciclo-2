package co.edu.utp.misiontic2022.reto1.p61;

public class VentaProyecto {

    public int Tiempo=0;
    public double Monto=0;
    public double Interes=0;
    public double InteresSimple=0;
    public double InteresCompuesto=0;
    public double diferencia=0;





// Constructores
// -----------------------------------------------------------------
// ...
// -----------------------------------------------------------------
// Métodos
// -----------------------------------------------------------------
public double calcularInteresSimple(int pTiempo, double pMonto, double pInteres){

    if (pTiempo != 0) {

        InteresSimple = Math.round(Monto*(pInteres/100)*pTiempo);
    }

    return InteresSimple;

    }

public double calcularInteresCompuesto(int pTiempo, double pMonto, double pInteres ){

    if (pTiempo != 0) {

        InteresCompuesto= Math.round (pMonto * (Math.pow (  (1+(pInteres/100)  ) , pTiempo  )  -1));
    }

    return InteresCompuesto ;

    }

public String compararInversion (int pTiempo, double pMonto, double pInteres){
    
    diferencia= (Math.round (InteresCompuesto= pMonto * (Math.pow (  (1+(pInteres/100)  ) , pTiempo  )  -1)) - 
    (Math.round(InteresSimple=pMonto*(pInteres/100)*pTiempo)));

    return  "La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia ;

    }


//public String compararInversion ( ){
    // ...
 //   }

    
    
}
