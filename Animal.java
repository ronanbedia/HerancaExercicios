package exerciciosHeranca;

public abstract class Animal {

		// atributos animal
		private String nome;
		private int idade;
		
		//metodos animal
		public abstract void som();
		public abstract void locomocao();
		
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		
		
			
		

}
