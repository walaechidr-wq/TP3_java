package TP3;

public class CompteBancaire {
    private String numero;
    private double solde;

    public CompteBancaire(String numero, double soldeInitial) {
        this.numero = numero;
        this.solde = soldeInitial;
    }
    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("Dépôt de " + montant + " effectué.");
        } else {
            System.out.println("Montant invalide !");
        }
    }

    public void retirer(double montant) {
        if (montant > 0 && montant <= solde) {
            solde -= montant;
            System.out.println("Retrait de " + montant + " effectué.");
        } else {
            System.out.println("Solde insuffisant ou montant invalide !");
        }
    }

    public void transferer(CompteBancaire destinataire, double montant) {
        if (montant > 0 && montant <= solde) {
            this.solde -= montant;
            destinataire.solde += montant;
            System.out.println("Transfert de " + montant + " vers le compte " + destinataire.numero);
        } else {
            System.out.println("Transfert impossible !");
        }
    }

    public void afficherSolde() {
        System.out.println("Compte " + numero + " : Solde = " + solde);
    }
}