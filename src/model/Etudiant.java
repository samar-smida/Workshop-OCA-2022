package model;

public class Etudiant {

	
	//les attributs:
	private String nom;
	private int age;
	private double moyenne;
	private String adresse;
	
	
	//les methodes:
	//constructeur par défaut
	public Etudiant() {
		
	}
	//constructeur parametré
	public Etudiant(String nom, int age, double moyenne, String adresse) {
		super();
		this.nom = nom;
		this.age = age;
		this.moyenne = moyenne;
		this.adresse = adresse;
	}

	// affiche info
	public void info(){
		System.out.println( "l'étudiant " +nom+ " a " +age+ " ans. Il a " +moyenne+" moyenne. Son adresse est " +adresse);
	}
	// les getter et setter :
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		if ( nom.length() >8 && nom.length() <30 )
			{this.nom = nom; }
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public double getMoyenne() {
		return moyenne;
	}
	
	public void setMoyenne(double moyenne) {
		this.moyenne = moyenne;
	}
	
	public String getAdresse() {
		return adresse;
	}
	
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
	
	
	
}
