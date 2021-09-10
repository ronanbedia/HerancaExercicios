package exerciciosHeranca;

public class Preguica extends Animal{

	@Override
	public void som() {
		System.out.println("não produz som");
		
	}

	@Override
	public void locomocao() {
		System.out.println("deve subir em arvores");
		
	}

}
