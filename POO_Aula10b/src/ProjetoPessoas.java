
public class ProjetoPessoas {
	public static void main(String[] args) {
		//programa principal
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Zezinho");
		p2.setNome("Claudecio");
		p3.setNome("Claudio");
		p4.setNome("Fabiana");
		
		p1.setSexo("M");
		p2.setSexo("M");
		p3.setSexo("M");
		p4.setSexo("F");
		
		p2.setCurso("Inform�tica");
		p3.setSalario(2500.75f);
		p4.setSetor("Estoque");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
		
	}
}