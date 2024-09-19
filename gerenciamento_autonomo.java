package projeto_integrador;

import java.awt.Component;
import javax.swing.JOptionPane;

public class gerenciamento_autonomo {
	public static void main(String[] args) {
		// Variavel
		double lucro1, lucro2, lucro3, lucro4, lucro5, lucro6, lucro7, gasto1, gasto2, gasto3, gasto4, gasto5, gasto6,
				gasto7, valortotal;
		int escolha, result;
		String nome = "Juan";
		char veiculo;
		Component window = null;
		// Entrada de dados
		JOptionPane.showMessageDialog(null, "BEM-VINDO AO GERENCIAMENTO AUTÔNOMO", null, JOptionPane.CLOSED_OPTION);
		escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Opções:\n 1.Calculo\n 2.Extrato\n 3.Sair\n",
				"Escolha", (JOptionPane.QUESTION_MESSAGE)));
		switch (escolha) {
		case 1 -> {
			nome = JOptionPane.showInputDialog(null, "Por favor informe seu nome: ", "", JOptionPane.CLOSED_OPTION);
			JOptionPane.showMessageDialog(null, "Bem-Vindo " + nome);
			veiculo = JOptionPane.showInputDialog(window,"Infrome seu veículo (M) para moto e (C) para carro:","",JOptionPane.DEFAULT_OPTION).charAt(0);
			if (veiculo == 'M') {
				JOptionPane.showMessageDialog(null, "Seu veículo é uma moto ", "", JOptionPane.DEFAULT_OPTION);
			} else if (veiculo == 'C') {
				JOptionPane.showMessageDialog(null, "Seu veículo é um carro ", "", JOptionPane.DEFAULT_OPTION);
			} else {
				result = JOptionPane.showConfirmDialog(window,
						"Você não escolheu nenhuma das opção acima, deseja fechar o programa?", "Confirme a saída",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.DEFAULT_OPTION);
				if (result == JOptionPane.YES_OPTION)
					System.exit(0);
			}

			JOptionPane.showInternalMessageDialog(null, "Por favor informe seus ganhos e suas despesas: ");
			lucro1 = Double.parseDouble(
					JOptionPane.showInputDialog(null, "Segunda-feira: +R$", "Ganho", JOptionPane.CLOSED_OPTION));
			gasto1 = Double.parseDouble(
					JOptionPane.showInputDialog(null, "Segunda-feira: -R$", "Gasto", JOptionPane.CLOSED_OPTION));
			lucro2 = Double.parseDouble(
					JOptionPane.showInputDialog(null, "Terça-feira: +R$", "Ganho", JOptionPane.CLOSED_OPTION));
			gasto2 = Double.parseDouble(
					JOptionPane.showInputDialog(null, "Terça-feira: -R$", "Gasto", JOptionPane.CLOSED_OPTION));
			lucro3 = Double.parseDouble(
					JOptionPane.showInputDialog(null, "Quarta-feira: +R$", "Ganho", JOptionPane.CLOSED_OPTION));
			gasto3 = Double.parseDouble(
					JOptionPane.showInputDialog(null, "Quarta-feira: -R$", "Gasto", JOptionPane.CLOSED_OPTION));
			lucro4 = Double.parseDouble(
					JOptionPane.showInputDialog(null, "Quinta-feira: +R$", "Ganho", JOptionPane.CLOSED_OPTION));
			gasto4 = Double.parseDouble(
					JOptionPane.showInputDialog(null, "Quinta-feira: -R$", "Gasto", JOptionPane.CLOSED_OPTION));
			lucro5 = Double.parseDouble(
					JOptionPane.showInputDialog(null, "Sexta-feira: +R$", "Ganho", JOptionPane.CLOSED_OPTION));
			gasto5 = Double.parseDouble(
					JOptionPane.showInputDialog(null, "Sexta-feira: -R$", "Gasto", JOptionPane.CLOSED_OPTION));
			lucro6 = Double.parseDouble(
					JOptionPane.showInputDialog(null, "Sábado: +R$", "Ganho", JOptionPane.CLOSED_OPTION));
			gasto6 = Double.parseDouble(
					JOptionPane.showInputDialog(null, "Sábado: -R$", "Gasto", JOptionPane.CLOSED_OPTION));
			lucro7 = Double.parseDouble(
					JOptionPane.showInputDialog(null, "Domingo: +R$", "Ganho", JOptionPane.CLOSED_OPTION));
			gasto7 = Double.parseDouble(
					JOptionPane.showInputDialog(null, "Domingo: -R$", "Gasto", JOptionPane.CLOSED_OPTION));

			// calculos dos ganhos semanal e mensal
			
			valortotal = (lucro1 + lucro2 + lucro3 + lucro4 + lucro5 + lucro6 + lucro7)
					- (gasto1 + gasto2 + gasto3 + gasto4 + gasto5 + gasto6 + gasto7);
	      JOptionPane.showMessageDialog(window,"O seus ganhos semanal é de R$"+valortotal,"",JOptionPane.CLOSED_OPTION);
		}
		case 2 -> {
			JOptionPane.showMessageDialog(null, nome + " bem-vindo ao extrato", "", JOptionPane.CLOSED_OPTION);
			JOptionPane.showMessageDialog(null, "Semana 1:\n ganho bruto R$7.000,00\n despesa R$3.500,00\n"
					+ " O valor liquído é de R$3.500,00\n\n"
					+ "Semana 2:\n ganho bruto R$\n despesa R$\n"
					+ " O valor liquído é de R$R$1.000,00\n\n"
					+ "Semana 3:\n ganho bruto\n despesa\n "
					+ "O valor liquído é de R$1.300,00\n\n"
					+ "Semana 4\n ganho bruto R$\n despesa R$\n"
					+ "O valor liquido é de R$1.100,00\n\n"
					+ "O valor mensal bruto é R$   \n Despesa mensal é R$  \n"
					+ "O valor mensal liquido é de R$5.900,00", "Extrato",
					JOptionPane.CLOSED_OPTION);

		}

		case 3 -> {
			JOptionPane.showMessageDialog(null, "Volte sempre!", "", JOptionPane.DEFAULT_OPTION);
		}
		}
	}
	
}
