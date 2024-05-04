import java.util.Scanner;


public class Contador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro Número:");
        int param1 = sc.nextInt();
        System.out.println("Digite o segundo Número:");
        int param2 = sc.nextInt();


        try{
            contador(param1,param2);
        } catch(ParametrosInvalidosException e){
            System.out.println(e);
        }

    }
    static void contador(int param1, int param2) throws ParametrosInvalidosException {

        int contagem = 0;
        if (param1 > param2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        } else {
            contagem = param2 - param1;
            for (int i =1; i <= contagem; i++) {

                System.out.println("Imprimindo número " + i);
           }
        }
    }
}