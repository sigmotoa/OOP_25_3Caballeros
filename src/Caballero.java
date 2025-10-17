public class Caballero {
    private String nombre;
    private String constellation;
    int cosmos;
    Dios dios;

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

    Armadura armadura;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


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
        burnCosmos(10);
    }

    //Sobrecarga de metodos
   public void burnCosmos(){
       System.out.println(this.constellation +" esta usando "+(this.cosmos*2)+" cosmos");
       this.cosmos=this.cosmos-10;
   }
   private void burnCosmos(int c)
   {
       this.cosmos=this.cosmos*c;
   }
}
