import javax.swing.JOptionPane;

public class Exer24 {

	public static void main(String[] args) {
		String qtd = JOptionPane.showInputDialog("Quantos filhos voc� tem?");
		int filhos = Integer.parseInt(qtd);
		String rel = "";
		for (int ct = 1; ct < filhos; ct++) {
			String nome = JOptionPane.showInputDialog("Digite o " + ct + "� nome: ");
			String idade = JOptionPane.showInputDialog("Diigite a " + ct + "� idade: ");
			String item = "nome=" + nome + " idade=" + idade + "\n";
			rel += item;
		}
		JOptionPane.showConfirmDialog(null, rel);
		System.exit(0);
	}

}
