package TP3;

public class ex7 {
        public static void main(String[] args) {

            Produit.ajouterProd(new Produit(1, "PC", "Ordinateur portable", 8000, 5));
            Produit.ajouterProd(new Produit(2, "Souris", "Souris sans fil", 150, 20));

            System.out.println("Liste des produits :");
            for (Produit p : Produit.getAllProduit()) {
                p.afficher();
            }

            Produit.modifierProd(1, "PC Gamer", "RTX 4060", 12000, 3);

            Produit p = Produit.getProduitByID(1);
            if (p != null) {
                System.out.println("Produit trouvé :");
                p.afficher();
            }

            Produit.supprimerProd(2);

            System.out.println("Après suppression :");
            for (Produit pr : Produit.getAllProduit()) {
                pr.afficher();
            }
        }
    }
