package prueba;

public class HolaMundo {
	private String saludo;
	
	public String getSaludo() {
		return saludo;
	}
	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
	public static void main(String[] args) {
		HolaMundo hola = new HolaMundo();
		
		hola.setSaludo("me voy");
		hola.setSaludo("volvi2");
		hola.setSaludo("Fabian_0521");
		hola.setSaludo("Fabian_6");
		System.out.println(hola.getSaludo());

	}

}
