package Main;


import Domain.Cheff;
import Domain.Menu;
import Domain.Plato;
import Domain.Restaurante;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Restaurante restaurante = new Restaurante("Enigma", "Mexicana", "Cll 38 #8-66 Cartagena de indias");

        Cheff cheff = new Cheff("Alberto", "Arbelaez", "Comida mexicana", 42);

        List<Plato> platosMenu = new ArrayList<>();
        platosMenu.add(new Plato("Tacos al pastor", "Tortilla de maiz con carne y piña"));
        platosMenu.add(new Plato("Quesadillas", "Tortilla de maiz con queso por dentro"));
        platosMenu.add(new Plato("Enchiladas", "Tortilla de maiz con queso, carne y chile dentro"));

        Menu menuPrincipal = new Menu();


        System.out.println("Código estudiantil: 7502410004");
        System.out.println("Nombre: Kevin Javier Ballestas Figueroa");
        System.out.println("*************************************************************");
        System.out.println(restaurante);
        System.out.println("-------------------------------------------------------------");
        System.out.println(cheff);
        System.out.println("-------------------------------------------------------------");
        System.out.println(menuPrincipal);
        System.out.println("-------------------------------------------------------------");
    }
}
