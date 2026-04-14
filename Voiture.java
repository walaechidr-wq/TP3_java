package TP3;

public class Voiture {
        private String marque;
        private int vitesse;

        public Voiture(String marque) {
            this.marque = marque;
            this.vitesse = 0;
        }

        public void accelerer(int augmentation) {
            if (augmentation > 0) {
                vitesse += augmentation;
                if (vitesse > 240) {
                    vitesse = 240;
                }
                System.out.println(marque + " accélère. Vitesse actuelle : " + vitesse + " km/h");
            } else {
                System.out.println("Valeur d'accélération invalide !");
            }
        }

        public void freiner(int diminution) {
            if (diminution > 0) {
                vitesse -= diminution;
                if (vitesse < 0) {
                    vitesse = 0;
                }
                System.out.println(marque + " ralentit. Vitesse actuelle : " + vitesse + " km/h");
            } else {
                System.out.println("Valeur de freinage invalide !");
            }
        }

        public void afficher() {
            System.out.println("Voiture : " + marque + ", Vitesse : " + vitesse + " km/h");
        }
    }
