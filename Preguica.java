package exerciciosHeranca;

public class Preguica extends Animal{

	@Override
	public void som() {
		System.out.println("n�o produz som");
		
	}

	@Override
	public void locomocao() {
		System.out.println("deve subir em arvores");
		
	}

}
