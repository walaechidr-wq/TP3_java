package TP3;

public class ex5 {
        public static void main(String[] args) {

            CompteBancaire c1 = new CompteBancaire("C001", 1000);
            CompteBancaire c2 = new CompteBancaire("C002", 500);

            c1.afficherSolde();
            c2.afficherSolde();

            c1.deposer(200);

            c1.retirer(150);

            c1.transferer(c2, 300);

            c1.afficherSolde();
            c2.afficherSolde();
        }
}
