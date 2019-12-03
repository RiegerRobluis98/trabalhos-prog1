package trabalho01;

import javax.swing.JOptionPane;

public class Trabalho02 {

    public static void main(String[] args) {
        int psgManaus, pctManaus, psgSalvador, pctSalvador, psgCpoGde, qtdePass;
        int pctCpoGde, psgSampa, pctSampa, psgFloripa, pctFloripa, total = 0;
        String cidadeTexto, pctTexto, compra;
        psgManaus = 900;
        pctManaus = 500;
        psgSalvador = 830;
        pctSalvador = 450;
        psgCpoGde = 850;
        pctCpoGde = 470;
        psgSampa = 590;
        pctSampa = 370;
        psgFloripa = 530;
        pctFloripa = 320;
        compra = JOptionPane.showInputDialog("Deseja Iniciar uma Compra ?");
        while (compra.equals("Sim")) {
            cidadeTexto = JOptionPane.showInputDialog("Digite o destino desejado:");
            qtdePass = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Passagens:"));
            pctTexto = JOptionPane.showInputDialog("Deseja adicionar o pacote de turismo?");
            if (cidadeTexto.equals("Manaus")) {
                total = qtdePass * psgManaus;
            } else if (cidadeTexto.equals("Salvador")) {
                total = qtdePass * psgSalvador;
            } else if (cidadeTexto.equals("Campo Grande")) {
                total = qtdePass * psgCpoGde;
            } else if (cidadeTexto.equals("Florianopolis") || cidadeTexto.equals("Floripa")) {
                total = qtdePass * psgFloripa;
            } else if (cidadeTexto.equals("Sao Paulo")) {
                total = qtdePass * psgSampa;
            }
            if (cidadeTexto.equals("Manaus") && pctTexto.equals("Sim")) {
                total = total + pctManaus;
            }
            if (cidadeTexto.equals("Salvador") && pctTexto.equals("Sim")) {
                total = total + pctSalvador;
            }
            if (cidadeTexto.equals("Campo Grande") && pctTexto.equals("Sim")) {
                total = total + pctCpoGde;
            }
            if (cidadeTexto.equals("Florianopolis") || cidadeTexto.equals("Floripa") && pctTexto.equals("Sim")) {
                total = total + pctFloripa;
            }
            if (cidadeTexto.equals("Sao Paulo") && pctTexto.equals("Sim")) {
                total = total + pctSampa;
            }
            System.out.println("Total: R$" + total + ",00");
            compra = JOptionPane.showInputDialog("Deseja iniciar outra compra ?");
        }
    }
}
