package td2;

public class point {
	private double x;
	private double y;
	
	
	
	 public point(double x, double y) {
	        this.x = x;
	        this.y = y;
	    }
	 public void affiche() {
	        System.out.println("p = (" + x + " , " + y + ")");
	    }
	

	 public static double distance(point p1, point p2) {
	        double dx = p2.x - p1.x;
	        double dy = p2.y - p1.y;
	 
	        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
	    
	 }
	public static void main(String[] arg){
		point p1 = new point(1.0, 3.0);
        point p2 = new point(5.0, 6.0);

        double d = point.distance(p1, p2);

        p1.affiche();
        p2.affiche();

        System.out.println("Distance entre p1 et p2 = " + d);
    }

	

}
