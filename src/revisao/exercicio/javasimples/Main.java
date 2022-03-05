package revisao.exercicio.javasimples;

/*
Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual
de crescimento de 3% e que a população de B seja 200000 habitantes com uma taxa de crescimento
de 1.5%. Faça um programa que calcule e escreva o número de anos necessários
para que a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.
 */

public class Main {

    public static double taxaA() {
        return 0.03;
    }

    public  static double taxaB() {
        return 0.015;
    }



    public static void main(String[] args) {
        double a = 80000;
        double b = 200000;
        int ano = 0;

        do {
            ano+=1;
            a*=taxaA();
            b*=taxaB();
        }while (a != b);

        System.out.println("O tempo para que o país A tenha a mesma população que o país B será de " + ano + " anos.");

    }



}
