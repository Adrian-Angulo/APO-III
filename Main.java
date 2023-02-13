import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //objecto perro
        Perro perro = new Perro("Lucas", "Negro", 10, 40);
        //Crea objecto gato
        Gato gato = new Gato ("Paco", "Blanco", 4, 25);
        //funcion menu
        Menu(sc, perro);
        Menu(sc, gato);
        
    }
    //Funcion menuPerro
    public static void MenuPerro(Scanner sc, Perro perro){
        
        System.out.print("""
            --------------------Perro---------------------
                1. Jugar
                2. Saltar
                3. Peso
                4. Color
                5. Tamañio
                Digite la opcion que desea realizar: """);
        int opc = sc.nextInt();
        switch (opc) {
            case 1:
                perro.JugarPerro();
                break;
            case 2: 
                perro.SaltarPerro();
                break;
            case 3: 
                perro.PesoPerro();
                break;
            case 4:
                perro.ColorPerro();
                break;
            case 5: 
                perro.TamanioPerro();
                break;
            default:
                System.out.println("opcion incorrecta");
                break;
        }
        //Funcion menuGato
    public static void MenuGato(Scanner sc, Gato gato){
        
        System.out.print("""
            --------------------Gato---------------------
                1. Jugar
                2. Saltar
                3. Peso
                4. Color
                5. Tamañio
                Digite la opcion que desea realizar: """);
        int opc = sc.nextInt();
        switch (opc) {
            case 1:
                gato.JugarGato();
                break;
            case 2: 
                gato.SaltarGato();
                break;
            case 3: 
                gato.PesoGato();
                break;
            case 4:
                gato.ColorGato();
                break;
            case 5: 
                gato.TamanioGato();
                break;
            default:
                System.out.println("opcion incorrecta");
                break;
        }
    }
    //Funcion Menu
    public static void Menu(Scanner sc, Perro perro, Gato gato){
        System.out.println("1. Perro");
        System.out.println("2. Gato");
        System.out.print("Digite la opcion que desea realizar: ");
        int opc= sc.nextInt();
        switch (opc){
            case 1:
            MenuPerro(sc, perro);
            break;
            case 2:
            //ingresar MenuGato
            MenuGato(sc, gato)
            break;
            default:
            System.out.println("opcion incorrecta");
        }
    }
}

