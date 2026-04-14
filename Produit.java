package TP3;
import java.util.ArrayList;

public class Produit {
        private int id;
        private String nom;
        private String description;
        private double prix;
        private int quantite;

        private static ArrayList<Produit> produits = new ArrayList<>();

        public Produit(int id, String nom, String description, double prix, int quantite) {
            this.id = id;
            this.nom = nom;
            this.description = description;
            this.prix = prix;
            this.quantite = quantite;
        }


        public static void ajouterProd(Produit p) {
            produits.add(p);
            System.out.println("Produit ajouté !");
        }

        public static void modifierProd(int id, String nom, String description, double prix, int quantite) {
            for (Produit p : produits) {
                if (p.id == id) {
                    p.nom = nom;
                    p.description = description;
                    p.prix = prix;
                    p.quantite = quantite;
                    System.out.println("Produit modifié !");
                    return;
                }
            }
            System.out.println("Produit non trouvé !");
        }

        public static void supprimerProd(int id) {
            for (Produit p : produits) {
                if (p.id == id) {
                    produits.remove(p);
                    System.out.println("Produit supprimé !");
                    return;
                }
            }
            System.out.println("Produit non trouvé !");
        }

        public static Produit getProduitByID(int id) {
            for (Produit p : produits) {
                if (p.id == id) {
                    return p;
                }
            }
            return null;
        }

        public static ArrayList<Produit> getAllProduit() {
            return produits;
        }

        public void afficher() {
            System.out.println("ID: " + id +
                    ", Nom: " + nom +
                    ", Desc: " + description +
                    ", Prix: " + prix +
                    ", Quantité: " + quantite);
        }
    }
