package modelos.tp1;

import java.util.ArrayList;
import java.util.List;

public class Pais {
	boolean cobertura;
	int limSinCobertura;
	List<Pais> limitrofes;
	
	public Pais(){
		cobertura = false;
		limSinCobertura = 0;
		limitrofes = new ArrayList<Pais>();
	}
	
	public void agregarLimitrofe(Pais lim){
		limitrofes.add(lim);
		limSinCobertura++;
	}
	
	
}
