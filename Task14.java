package by.ld.unit02.main;

public class Task14 {
    public static void main(String[] args) {

        int x = 1000;
        int y = 9999;
        int ns = 15;

        for (int i = x; i <= y; i++) {
            int n4 = (i % 10000) / 1000;
            int n3 = (i % 1000) / 100;
            int n2 = (i % 100) / 10;
            int n1 = i % 10;
            int nsc = n4 + n3 + n2 + n1;

            if (nsc == ns) {
                System.out.println(i);
            }

        }

    }

}
