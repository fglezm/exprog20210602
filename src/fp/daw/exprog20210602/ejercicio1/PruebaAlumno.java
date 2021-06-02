package fp.daw.exprog20210602.ejercicio1;

import java.io.*;
import java.time.*;
import java.time.format.*;
import java.util.*;

public class PruebaAlumno {

	public static void main(String[] args) {

		Alumno primero = new Alumno("Juan", "Pérez", "2000-01-01", "DAW", 1);
		Alumno segundo = new Alumno("Pedro", "Zas", "2001-01-01", "DAW", 1);
		Alumno tercero = new Alumno("Ana", "Marín", "2002-01-01", "DAW", 1);

		TreeSet<Alumno> alumnos = new TreeSet<Alumno>();

		alumnos.add(primero);
		alumnos.add(segundo);
		alumnos.add(tercero);

		for (Alumno alu : alumnos) {

			System.out.println(alu);

		}

		try {

			ObjectOutputStream escribiendo_fichero = new ObjectOutputStream(
					new FileOutputStream("C:/Users/alumno/git/alumnos.txt"));

			escribiendo_fichero.writeObject(alumnos);

			escribiendo_fichero.close();

		} catch (Exception e) {

		}

	}
}
