package fp.daw.exprog20210602.ejercicio1;

import java.time.*;
import java.time.format.*;
import java.util.*;

public class Alumno implements Comparable<Alumno> {

	String nombre;
	String apellidos;
	String fechaNacimiento;// Error
	String ciclo;
	Integer curso;

	public Alumno(String nom, String ape, String fechaNac, String cic, int cur) {

		nombre = nom;

		apellidos = ape;

		fechaNacimiento = fechaNac;// LocalDate error

		ciclo = cic;

		curso = cur;

	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	@Override
	public int compareTo(Alumno alu) {
		return this == alu ? 0 : apellidos.compareTo(alu.apellidos);
	}

	public class AlumnoComparator implements Comparator<Alumno> {

		@Override
		public int compare(Alumno alu1, Alumno alu2) {
			if (alu1 == alu2)
				return 0;
			int resultado = alu1.getApellidos().compareTo(alu2.getApellidos());
			if (resultado == 0)
				resultado = alu1.getNombre().compareTo(alu2.getNombre());
			return resultado;
		}
	}

}
