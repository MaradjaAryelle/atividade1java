import java.util.Scanner;

public class Questoes {
    //1. Faça um Programa que peça as 4 notas bimestrais e mostre a média.
    public static void Questao1() {
        double nota1 = 0;
        double nota2 = 0;
        double nota3 = 0;
        double nota4 = 0;

        Scanner nota = new Scanner(System.in);
        System.out.print("Digite a primeira nota:");
        nota1 = nota.nextDouble();

        System.out.print("Digite a segunda nota:");
        nota2 = nota.nextDouble();

        System.out.print("Digite a terceira nota:");
        nota3 = nota.nextDouble();

        System.out.print("Digite a quarta nota:");
        nota4 = nota.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("A média das quatro avaliações é %.2f", media);


    }

    //2. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
    public static void Questao2() {
        double salarioHora = 0;
        double horasTrabalhadas = 0;

        Scanner salario = new Scanner(System.in);
        System.out.print("Digite o valor da hora trabalhada:");
        salarioHora = salario.nextDouble();

        System.out.print("Digite o número de horas trabalhadas no mês:");
        horasTrabalhadas = salario.nextDouble();

        double salarioMes = salarioHora * horasTrabalhadas;

        System.out.printf("Seu salário deste mês será de %.2f", salarioMes);
    }

    //3. Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
    public static void Questao3() {
        double fahrenheit = 0;

        Scanner temperatura = new Scanner(System.in);
        System.out.print("Digite a temperatura em Fahrenheit:");
        fahrenheit = temperatura.nextDouble();

        double celsius = ((fahrenheit - 32) / 9) * 5;

        System.out.printf("%.2fºFahrenheit equivalem a %.2fº Celsius", fahrenheit, celsius);

    }

    /*4. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
    Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados
    11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
    - salário bruto.
    - quanto pagou ao INSS.
    - quanto pagou ao sindicato.
    - o salário líquido.
    - calcule os descontos e o salário líquido, conforme a tabela abaixo:
             + Salário Bruto : R$
             - IR (11%) : R$
             - INSS (8%) : R$
             - Sindicato ( 5%) : R$
             = Salário Liquido : R$*/
    public static void Questao4() {
        double salarioHora = 0;
        double horasTrabalhadas = 0;

        Scanner salario = new Scanner(System.in);
        System.out.print("Digite o valor da hora trabalhada:");
        salarioHora = salario.nextDouble();

        System.out.print("Digite o número de horas trabalhadas no mês:");
        horasTrabalhadas = salario.nextDouble();

        double salarioBruto = salarioHora * horasTrabalhadas;
        double impostoDeRenda = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05; //Armaria
        double salarioLiquido = salarioBruto - (impostoDeRenda + inss + sindicato);

        System.out.printf("""
                + Salário Bruto:   R$ %.2f
                - IR (11%%):        R$ %.2f
                - INSS (8%%):       R$ %.2f
                - Sindicato (5%%):  R$ %.2f
                = Salário Líquido: R$ %.2f""", salarioBruto, impostoDeRenda, inss, sindicato, salarioLiquido);
    }

    /*5. Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:      - A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
      - A mensagem "Reprovado", se a média for menor do que sete;
      - A mensagem "Aprovado com Distinção", se a média for igual a dez.*/
    public static void Questao5() {
        Scanner nota = new Scanner(System.in);
        System.out.print("Digite a primeira nota:");
        double nota1 = nota.nextDouble();

        System.out.print("Digite a segunda nota:");
        double nota2 = nota.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media < 7) {
            System.out.printf("Você foi reprovado com %.1f de média!", media);
        } else {
            System.out.printf("Você foi aprovado com %.1f de média!", media);
        }
    }

    //6. Faça um Programa que leia três números e mostre o maior e o menor deles.
    public static void Questao6() {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        Scanner numeros = new Scanner(System.in);
        System.out.print("Digite um número:");
        num1 = numeros.nextInt();

        System.out.print("Digite um número:");
        num2 = numeros.nextInt();

        System.out.print("Digite um número:");
        num3 = numeros.nextInt();

        int maior = -999999999;
        int menor = 999999999;

        if (num1 <= num2 && num1 <= num3){
            menor = num1;
            if (num2<=num3){
                maior = num3;
            } else{
                maior = num2;
            }
        } else if(num2 <= num1 && num2 <= num3){
            menor = num2;
            if (num1<=num3){
                maior = num3;
            } else{
                maior = num1;
            }
        } else{
            menor = num3;
            if (num1<=num2){
                maior = num2;
            } else{
                maior = num1;
            }
        }

        System.out.printf("O maior número é %d e o menor é %d", maior, menor);
    }
    /*7. Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:       Tabuada de 5:
               5 X 1 = 5
               5 X 2 = 10
               ...
               5 X 10 = 50*/
    public static void Questao7(){
        Scanner num = new Scanner (System.in);
        System.out.print("Digite o número para saber sua tabuada:");
        int numero = num.nextInt();

        int i;
        System.out.println("TABUADA DO " + numero);
        for ( i = 1; i < 11; i++){
            System.out.println(numero + " x " + i + " = " + numero*1);

        }
    }
}


