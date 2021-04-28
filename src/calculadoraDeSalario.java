import java.util.Scanner;

public class calculadoraDeSalario {
    public static void calcularSalarioAnual(){
        int horasSemanales;
        double valorHora;
        double salarioAnual = 0;
        int diasVacacionesTomadas;

        Scanner input = new Scanner(System.in);
        try {
            System.out.println("---- Por favor, ingrese los siguientes datos ----");
            do {
                System.out.println("Indique cantidad de horas semanales trabajadas: ");
                horasSemanales = input.nextInt();
            }while (horasSemanales < 0);
            do {
                System.out.println("Indique el valor de hora de trabajo: ");
                valorHora = input.nextDouble();
            }while (valorHora < 0);

            do {
                System.out.println("Indique cuantos días de vacaciones se tomó: ");
                diasVacacionesTomadas = input.nextInt();
            }while (diasVacacionesTomadas < 0);

            salarioAnual = (((horasSemanales * valorHora)*4)*12) - (diasVacacionesTomadas*8*valorHora);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("El salario Anual calculado es: " + (int)salarioAnual);
    }

}