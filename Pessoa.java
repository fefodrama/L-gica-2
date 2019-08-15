
public class Pessoa {
	
	// PROPRIEDADES
	
	String nome;
	String Endereço;
	long RG;
	
	public static void main (String args[]) throws Exception {
		
		Pessoa objeto1 = new Pessoa();
		objeto1.nome = "fefo";
		objeto1.Endereço = "SQS 116";
		objeto1.RG = 1234456;
		
		Pessoa objeto2 = new Pessoa();
		objeto2.nome = "Dog";
		objeto2.Endereço = "SHCGN 907";
		objeto1.RG = 3441102;
		
		System.out.println(" o nome do objeto 2 é: " + objeto2.nome);
		System.out.println(" o endereço do objeto 1 é: " + objeto1.Endereço);
		
				
}
	
}
