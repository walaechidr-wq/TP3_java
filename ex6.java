package TP3;

public class ex6{
        public static void main(String[] args) {

            Voiture v = new Voiture("BMW");

            v.afficher();

            v.accelerer(50);
            v.accelerer(200);

            v.freiner(100);
            v.freiner(200);
            v.afficher();
        }
}

