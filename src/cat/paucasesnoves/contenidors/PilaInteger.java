package cat.paucasesnoves.contenidors;

public class PilaInteger {

	private ElementInteger iniciPila;
	
	public PilaInteger() {
		iniciPila = null;
		
	}
	
	public void mostra() {
		ElementInteger actual = iniciPila;
		while(actual != null) {
			System.out.println(actual.getInfo());
			actual = actual.getSeguent();
		}
	}
	
	public void push(Integer x) {
		ElementInteger a = new ElementInteger(x, iniciPila);
		iniciPila = a;
	}
	
	public Integer peek() {
		if (iniciPila == null) {
			return null;
		}
		return iniciPila.getInfo();
	}
	
	public void pop() {
		if (iniciPila != null) {
			iniciPila = iniciPila.getSeguent();
		}
	}
	
	public boolean isEmpty() {
		return iniciPila == null;
	}
	
	public Integer poll() {
		Integer a = peek();
		pop();
		return a;
	}
	
}
