package test;



public class Auto {
	String modelo;
	int precio;
	String marca;
	int registro;
	Motor motor;
	Asiento[] asientos;
	
	
	static int cantidadCreados;

public int cantidadAsientos() {
		
		int NumeroAsientos = 0;
		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i] != null) {
				NumeroAsientos++;
			}
		}
		return NumeroAsientos;
					
	}
	
	public String verificarIntegridad() {
		boolean verificarAsientos = true;
		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i] != null) {
				if (registro != asientos[i].registro) {
					verificarAsientos = false;
					break;
				}
	
				}
			}
		if (registro == motor.registro && verificarAsientos == true) {
			return "Auto original";
		}else {
			return "Las piezas no son originales";
		}
	
	
	}
}