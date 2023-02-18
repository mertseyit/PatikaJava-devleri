public class Main {
    public static void main(String[] args) {
        int[] seri = {1,2,3,4,5,6,7,8,9,89798};
        double harSeri = 0.0;
        double harOrt =0;
        for(int i=0; i<seri.length; i++) {
            harSeri += (1/(double)seri[i]);
        }
        harOrt = seri.length / harSeri;
        System.out.println("Serinin harmonik ortalaması: " + harOrt);
    }
}