package TP3;

public class NombreComplex {
    private double reel;
    private double imaginaire;

    public NombreComplex(double reel, double imaginaire) {
        this.reel = reel;
        this.imaginaire = imaginaire;
    }

    public NombreComplex addition(NombreComplex z) {
        double nouveauReel = this.reel + z.reel;
        double nouveauImaginaire = this.imaginaire + z.imaginaire;
        return new NombreComplex(nouveauReel, nouveauImaginaire);
    }

    
    public NombreComplex multiplication(NombreComplex z) {
        double nouveauReel = (this.reel * z.reel) - (this.imaginaire * z.imaginaire);
        double nouveauImaginaire = (this.reel * z.imaginaire) + (this.imaginaire * z.reel);
        return new NombreComplex(nouveauReel, nouveauImaginaire);
    }

    
    public void afficher() {
        System.out.println(reel + " + " + imaginaire + "i");
    }
}
