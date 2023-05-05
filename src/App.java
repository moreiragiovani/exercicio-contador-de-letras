import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua frase: ");
        String frase = sc.nextLine();

        System.out.print("Digite uma letra: ");
        String letra = sc.nextLine();

        int repeticao = 0;
        
        for(String s: frase.split(" ")){
            for(int i = 0; i < s.length(); i++){
                if(s.toUpperCase().charAt(i) == letra.toUpperCase().charAt(0)){
                    repeticao += 1;
                }
            }
        }   

        System.out.println("A letra " + letra + " repetiu: "+ repeticao + "." );
        sc.close();
    }
}
