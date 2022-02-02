
import java.util.Scanner;

public class Executa {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int op;
        double n1, n2;
        
        System.out.println("Operações disponíveis: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Digite a operção desejada:");
        op = Integer.valueOf(input.nextLine());
        
        Calculadora Calcule = new Calculadora();
        
        System.out.print("Digite o primeiro número: ");
        n1 = Double.valueOf(input.nextLine());
        
        System.out.print("Digite o segundo número: ");
        n2 = Double.valueOf(input.nextLine());
        
        switch (op){
            case 1:
                Calcule.soma(n1, n2);
                System.out.println(Calcule.toString());
                break;
            case 2:
                Calcule.subtrai(n1, n2);
                System.out.println(Calcule.toString());
                break;
            case 3:
                Calcule.multiplica(n1, n2);
                System.out.println(Calcule.toString());
                break;
            case 4:
                if (n2 != 0) {
                    Calcule.divide(n1, n2);
                } else {
                    System.out.println("Não é possível dividir um número por zero.");   
                }
                break;
            default: 
                System.out.println("Opção inválida, por favor escolha uma opção válida.");
        }
        
    }
}
