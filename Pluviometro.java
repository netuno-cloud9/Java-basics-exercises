public class Pluviometro {
    public String tipo;

    public Pluviometro(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
     public int getPeso(){
         if (tipo == "convencional"){
           return 1000;
         }
         if (tipo == "semiautomático"){
             return 750;
         }
         if (tipo == "automático"){
             return 500;
         }
        return 0;
     }
     public int getCapacidade(){
         if (tipo == "convencional"){
           return 1000000;
         }
         if (tipo == "semiautomático"){
             return 750000;
         }
         if (tipo == "automático"){
             return 500000;
         }
        return 0;
     }
     
}
