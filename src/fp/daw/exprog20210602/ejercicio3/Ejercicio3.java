package fp.daw.exprog20210602.ejercicio3;

import java.io.*;
import java.util.*;

public class Ejercicio3 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Deque<Integer> q = new LinkedList<Integer>();
		q.add(2);
		q.add(13);
		q.add(-42);
		q.add(21);
		q.add(4);
		q.add(9);
		q.add(14);
		q.add(-3);
		q.add(11);
		q.add(5);
		
		Scanner br = new Scanner (System.in);
		System.out.println("Elementos a ordenar: ");
		int k = br.nextInt();
		invertir(k,q);
	}



public static void invertir (int n, Deque l) {
		
	for (int i=0;i<n;i++) {
		
		l.addFirst(l);;
		
		
	}
	System.out.println(l);
	
}
}
