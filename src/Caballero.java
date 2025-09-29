public class Caballero {
    String nombre;
    String constellation;
    int cosmos;
    Dios dios;
    Armadura armadura;

    //Sobrescritura
    @Override
    public String toString() {
        return "Vas a saludar a: " + this.nombre + " de " + this.constellation + " Caballero con cosmos de: " + this.cosmos;
    }

    //Constructor con parametros
    public Caballero(String nombre, String constellation) {
        this.nombre = nombre;
        this.constellation = constellation;
    }

    //Constructor por defecto
    public Caballero() {
    }

    //Sobrecarga de metodos
   public void burnCosmos(){
       System.out.println(this.constellation +" esta usando "+(this.cosmos*2)+" cosmos");
       this.cosmos=this.cosmos-10;
   }
   public void burnCosmos(int c)
   {
       this.cosmos=this.cosmos*c;
   }
}
