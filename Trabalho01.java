/* Litro da Gasolina: 4.30
* Litro do Etanol: 3.85
* Etanol ate 20 litros, desconto de 4%, acima desconto de 6%
* Gasolina ate 20 litros, desconto de 6%, acima desconto de 8%
* Cliente Fidelidade tem mais 2% de desconto
 */
package trabalho01;

import javax.swing.JOptionPane;

public class Trabalho01 {

    public static void main(String[] args) {
        double precoEtanol = 3.85, precoGasol = 4.30, total1 = 0, total2 = 0, total3 = 0, descE1, descE2, descG1, descG2, descFid;
        String combustivelTexto, fidelidade, calculo;
        int qtdeLitros;
        descE1 = 4.0 / 100.0;
        descE2 = 6.0 / 100.0;
        descG1 = descE2;
        descG2 = 8.0 / 100;
        descFid = 2.0 / 100;
        calculo = JOptionPane.showInputDialog("Deseja Fazer um novo Calculo");
        while (calculo.equals("Sim")){
        combustivelTexto = JOptionPane.showInputDialog("Deseja abastecer com Gasolina ou Etanol ?");
        qtdeLitros = Integer.parseInt(JOptionPane.showInputDialog("Quantos litros vai abastecer ?"));
        fidelidade = JOptionPane.showInputDialog("Possui Cartão Fidelidade ?");
            if (combustivelTexto.equals("Etanol")) {
                total1 = precoEtanol * qtdeLitros;
            }
        
        if (combustivelTexto.equals("Gasolina")) {
            total1 = precoGasol * qtdeLitros;
        }
        if (combustivelTexto.equals("Etanol") && qtdeLitros <= 20) {
            total2 = total1 - (descE1 * total1);
            System.out.printf("Total: R$ %.2f %n", total2);
            System.out.println("Desconto: 4%");
            System.out.printf("Desconto em Reais: R$ %.2f %n", (total1 - total2));
        }
        if (combustivelTexto.equals("Etanol") && qtdeLitros > 20) {
            total2 = total1 - (descE2 * total1);
            System.out.printf("Total: R$ %.2f %n", total2);
            System.out.println("Desconto: 6%");
            System.out.printf("Desconto em Reais: R$ %.2f %n", (total1 - total2));
        }
        if (combustivelTexto.equals("Gasolina") && qtdeLitros <= 20) {
            total2 = total1 - (descG1 * total1);
            System.out.printf("Total: R$ %.2f %n", total2);
            System.out.println("Desconto: 6%");
            System.out.printf("Desconto em Reais: R$ %.2f %n", (total1 - total2));
        }
        if (combustivelTexto.equals("Gasolina") && qtdeLitros > 20) {
            total2 = total1 - (descG2 * total1);
            System.out.printf("Total: R$ %.2f %n", total2);
            System.out.println("Desconto: 8%");
            System.out.printf("Desconto em Reais: R$ %.2f %n", (total1 - total2));
        }
        if (fidelidade.equals("Sim")) {
            total3 = total2 - (descFid * total2);
            System.out.println("---------------------------------------------------------");
            System.out.println("Desconto  Cartão Fidelidade: 2%");
            System.out.printf("Total com Fidelidade: R$ %.2f %n", total3);
            System.out.printf("Desconto em Reais: R$ %.2f %n", (total2 - total3));
        }
    calculo = JOptionPane.showInputDialog("Deseja Fazer um novo Calculo ?");
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
    }
}
}
