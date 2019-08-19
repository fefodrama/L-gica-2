package negocio;

public class pessoa {
	//PROPRIEDADES
		private String nome = "";  //INICIALIZAÇÃO É REDUNDANTE
		private int idade = 0;
		
	//MÉTODOS 
		public pessoa() {
			System.out.println("O objeto foi instanciado");
			System.out.println(" ");
		}
		public String getnome() {
			return nome;
		}
		public void setnome (String nome) {
			this.nome = nome;
		}
		public int getidade() {
			return idade;
		}
		public void setidade (int idade) {
			this.idade = idade;
		}
}
