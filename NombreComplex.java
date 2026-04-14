package TP3;

public class NombreComplexe {
    private double reel;
    private double imaginaire;

    public NombreComplexe(double reel, double imaginaire) {
        this.reel = reel;
        this.imaginaire = imaginaire;
    }

    public NombreComplexe addition(NombreComplexe z) {
        double nouveauReel = this.reel + z.reel;
        double nouveauImaginaire = this.imaginaire + z.imaginaire;
        return new NombreComplexe(nouveauReel, nouveauImaginaire);
    }

    // Méthode multiplication
    public NombreComplexe multiplication(NombreComplexe z) {
        double nouveauReel = (this.reel * z.reel) - (this.imaginaire * z.imaginaire);
        double nouveauImaginaire = (this.reel * z.imaginaire) + (this.imaginaire * z.reel);
        return new NombreComplexe(nouveauReel, nouveauImaginaire);
    }

    // Méthode afficher
    public void afficher() {
        System.out.println(reel + " + " + imaginaire + "i");
    }
}
