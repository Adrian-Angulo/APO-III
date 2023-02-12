import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Perro perro = new Perro("Lucas", "Negro", 10, 40);
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
}
