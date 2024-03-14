package cc123;

public class Activity2m{
    public static void main(String[] args) {
        int[] p = {0, 0, 1, 1};
        int[] q = {0, 1, 0, 1};

        System.out.println("P  Q  P OR Q");
        System.out.println("------------");

        for (int i = 0; i < p.length; i++) {
            int result = (p[i] != 0 || q[i] != 0) ? 1 : 0;
            System.out.printf("%-3d%-3d%-3d\n", p[i], q[i], result);
        }
    }
    
}
