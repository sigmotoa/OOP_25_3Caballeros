import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Caballero c1 = new Caballero();
        c1.nombre = "Seiya";
        c1.constellation = "Pegaso";
        c1.cosmos = 100;
        c1.dios = Dios.ATENA;
        Bronce b1 = new Bronce();
        b1.name = "Pegaso";
        b1.animal = "Pegaso";
        b1.status = true;
        b1.material=Tipo.BRONCE;
        b1.durability=100;
        c1.armadura = b1;

        System.out.println(b1);

        Oro o1 = new Oro();
        o1.name = "Scropio";
        System.out.println(o1);


        System.out.println(c1);
    }
}