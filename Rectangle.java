package TP3;

public class Rectangle {
    int largeur ;
    int hauteur;

    public Rectangle(int largeur, int hauteur){
        this.largeur=largeur;
        this.hauteur=hauteur;
    }
    public void Surface(){
       int S=largeur*hauteur;
        System.out.println("La surface de ce rectangle est: \n"+S);
    }
    public void Perimetre(){
        int P = 2*(largeur+hauteur);
        System.out.println("Le perimetre de ce rectangle est: \n"+P);
    }


}
