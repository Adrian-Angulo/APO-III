import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //objecto perro
        Perro perro = new Perro("Lucas", "Negro", 10, 40);
        //Crea objecto gato

    
        Menu(sc, perro);
        
    }

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
    }

    public static void Menu(Scanner sc, Perro perro){
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
            break;
            default:
            System.out.println("opcion incorrecta");
        }
    }
}
