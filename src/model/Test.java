package model;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		//cr�ation de deux instances:
		Etudiant e1 = new Etudiant();
		Etudiant e2 = new Etudiant("Ali",20,14,"Tunis");
		Scanner s = new Scanner(System.in);
		
		e1.info();
		e2.info();
		
		System.out.println("*******scanner methode*******");
	}

}
