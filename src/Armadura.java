public class Armadura {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
    boolean status;
    Tipo material;
   boolean weapons;

    @Override
    public String toString() {
        return "La armadura "+this.name+" es de: "+this.material;
    }
}
