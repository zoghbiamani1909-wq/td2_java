
package td2;

public class complexe {

    private double x;
    private double y;

    public complexe(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String info() {
        return "(re : " + x + ", im : " + y + ")";
    }

    
    public complexe produit(complexe z) {
        complexe z1 = new complexe(0, 0);

        z1.x = x * z.x - y * z.y;
        z1.y = x * z.y + y * z.x;

        return z1;
    }

   
    public static complexe produit(complexe z1, complexe z2) {
        complexe z = new complexe(0, 0);

        z.x = z1.x * z2.x - z1.y * z2.y;
        z.y = z1.x * z2.y + z1.y * z2.x;

        return z;
    }

    public static void main(String[] args) {

        complexe z1 = new complexe(1.0, 2.0);
        System.out.println("z1 = " + z1.info());

        complexe z2 = new complexe(2.0, 1.0);
        System.out.println("z2 = " + z2.info());

        complexe z3 = z1.produit(z2);
        System.out.println("z1 x z2 = " + z3.info());

        complexe z4 = complexe.produit(z2, z1);
        System.out.println("z2 x z1 = " + z4.info());
    }
}
