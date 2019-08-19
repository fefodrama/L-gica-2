package apresentacao;

import negocio.pessoa;

	public class principal {
	
		public static void main(String[] args) {
			pessoa obj1 = new pessoa();
			obj1.setnome ("fefo");
			obj1.setidade(26);
			
			pessoa obj2 = new pessoa();
			obj2.setnome("xixigo");
			obj2.setidade(23);
			
			System.out.println("Nome do vagabundo 1: " + obj1.getnome());
			System.out.println("Idade do vagabundo 1: " + obj1.getidade());
			
			System.out.println(" ");
			
			System.out.println("Nome do vagabundo 2: " + obj2.getnome());
			System.out.println("Idade do vagabundo 2: " + obj2.getidade());
		}
		
}
