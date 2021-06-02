package fp.daw.exprog20210602.ejercicio2;

import java.io.*;
import java.util.*;

public class Frecuencia {
	
	public void frecuencia (String archivo) {

		String texto=archivo;
		texto = texto.replaceAll("[\\.\\,\\(\\)]", "");
		String[] palabras = texto.split(" ");
		HashMap<String, Integer> mapaDeFrecuencias = new HashMap<>();
		for (String palabra : palabras) {
		    if (mapaDeFrecuencias.containsKey(palabra)) {
		        mapaDeFrecuencias.put(palabra, mapaDeFrecuencias.get(palabra) + 1);
		    } else {
		        mapaDeFrecuencias.put(palabra, 1);
		    }
		}
	
		for (HashMap.Entry<String, Integer> entry : mapaDeFrecuencias.entrySet()) {
		    System.out.printf("Palabra '%s' con frecuencia %d\n", entry.getKey(), entry.getValue());
		}
	}
}
