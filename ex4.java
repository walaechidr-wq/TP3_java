package TP3;
public class ex4 {
    public static void main(String[] args) {

        NombreComplexe c1 = new NombreComplexe(2, 3);
        NombreComplexe c2 = new NombreComplexe(1, 4);

        // Addition
        NombreComplexe somme = c1.addition(c2);
        System.out.print("Somme : ");
        somme.afficher();

        // Multiplication
        NombreComplexe produit = c1.multiplication(c2);
        System.out.print("Produit : ");
        produit.afficher();
    }
}