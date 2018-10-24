package prova1_manoel_costa;

import java.util.Scanner;

public class PROVA1_MANOEL_COSTA {

    public static void main(String[] args) {
        //1) DECLARAÇÃO DE VARIÁVEIS
        String modelo, tamanhoAlcance;
        double ganhoAntena, potenciaAntena, alcance;
        //2) ENTRADA DE DADOS
        for (int i = 0; i < 10; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Informe o nome do modelo do Ponto de Acesso a ser testado: ");
            modelo = sc.nextLine();
            System.out.println("Informe o ganho da antena do Ponto de Acesso: ");
            ganhoAntena = sc.nextDouble();
            System.out.println("Informe a Pontência do Ponto de Acesso");
            potenciaAntena = sc.nextDouble();
            //3) PROCESSAMENTO
            alcance = (0.75 * ganhoAntena) + (potenciaAntena / 100);
            if (alcance < 11 ) {
                tamanhoAlcance = "Curto Alcance";
            } else if ((alcance >= 11) && (alcance <= 25)) {
                tamanhoAlcance = "Médio Alcance";
            } else {
                tamanhoAlcance = "Longo Alcance";
            }//FIM DO IF-ELSE

            //4) SAÍDA DE DADOS
            System.out.println("O ponto de acesso do modelo " + modelo + " tem um alcance de " + alcance + " metros");
            System.out.println(tamanhoAlcance);
        }//FIM DO FOR

    }//FIM DO MAIN

}//FIM DA CLASSE
