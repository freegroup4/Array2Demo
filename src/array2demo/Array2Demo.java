package array2demo;
public class Array2Demo {
    public static void main(String[] args) {
        int sale[][] = {{32,30,35,26},{34,30,33,31}};
        int i,j,sum = 0;
        for (int k = 0; k < sale.length; k++) {
            System.out.println("業務員 : " + (k+1) + "的業績為:");
            System.out.println();
        }
        System.out.println("總業績為 : " + sum);
    }
}
