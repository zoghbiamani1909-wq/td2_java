package td2;

public class ex1 {
	private int heure ;
	private int minute ;
	private int seconde ;
	
	public  ex1(int heure) {
		this.heure = heure;}
	
	 public ex1(int heure, int minute) {
	        this.heure = heure;
	        this.minute = minute;
	    }
	 public ex1(int heure, int minute, int seconde) {
	        this.heure = heure;
	        this.minute = minute;
	        this.seconde = seconde;
	    }
	 public void affiche() {
		System.out.print("il est "+heure+" h "+minute+" minutes "+seconde+" secondes \n");} 
	 


		public static void main(String[] args) {
	        ex1 t = new ex1(10);
	        t.affiche();

	        t = new ex1(10, 12);
	        t.affiche();

	        t = new ex1(10, 12, 45);
	        t.affiche();
	    }
	
	 
	 
	 
}
