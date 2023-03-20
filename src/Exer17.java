import javax.swing.JOptionPane;

public class Exer17 {

	public static void main(String[] args) {
		String idade = JOptionPane.showInputDialog("Qual é a sua idade?");
		int vl = Integer.parseInt(idade);
		String relatorio =  "";
		if (vl >= 18) {
			relatorio = "Vc já pode tirar carteira de motorista";
		} else {
			relatorio = "Vc não pode ser motorista";
		}
		JOptionPane.showMessageDialog(null, relatorio);
		System.exit(0);
	}

}
