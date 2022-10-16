public class Main {
    static int aparitii_1(int[] a,int n) {
        int nr=0;
        for(int i=0;i<n;i++) {
            if(a[i]==1)
                nr++;
        }
        return nr;
    }
    static boolean verific_0uri(int[] a,int n) {
        boolean ok = true;
        int nr;
        for (int i = 0; i < n-2; i++) {
            if (a[i] == 1 && i<n-3) {
                int j = i+1;
                nr = 0;
                while (a[j] != 1) {
                    nr++;
                    j++;
                }
                if (nr > 1) {
                    ok = false;
                    break;
                }
            }
        }
        return ok;
    }

    static boolean k_special(int a[],int n,int k) {
        if(a[0]==1 && aparitii_1(a,n)==k && verific_0uri(a,n))
            return true;
        return false;
    }

    public static void main(String []args) {
        // n,k, si cele n elem ale tabloului sunt transmise ca argum pe linia de comanda
        int n = Integer.parseInt(args[0]);
        System.out.println("Dimensiunea tabloului: "+n);
        int k = Integer.parseInt(args[1]);
        System.out.println("Verificam daca este "+k+"-special.");
        int[]a = new int[n];
        for(int i=2;i<n+2;i++) {
            int el = Integer.parseInt(args[i]);
            a[i-2]=el;
            System.out.print(el);
        }
        System.out.println("\n" + k_special(a,n,k));
    }
}