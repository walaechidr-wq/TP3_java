package TP3;

public class Point {
    double x ,y ;
    public Point(){
    }
    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }
    public void afficher(){
        System.out.println("Le point( "+x+","+y+")");
    }
    public void deplacer(double dx,double dy){
        x += dx ;
        y += dy;
        System.out.println("X aprés le déplacement est:"+x);
        System.out.println("Y aprés déplacement est:"+y);
    }
    public void distance(){
        double dist= (double) Math.sqrt(x*x + y*y);
        System.out.println("La distance d'aprés l'origine est:\n"+dist);
    }
    public void distance( double a,double b){
        double dis= (double) Math.sqrt(Math.pow(a-x,2)+Math.pow(b-y,2));
        System.out.println("La distance entre ces points est:\n"+dis);
    }

}
