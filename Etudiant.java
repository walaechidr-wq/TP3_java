package TP3;

public class Etudiant {
        String cne;
        double note;

        public Etudiant(String cne, double note) {
            this.cne = cne;
            this.note = note;
        }

        public String toString() {
            return "CNE: " + cne + ", Note: " + note;
        }

        public boolean estAdmis() {
            return note >= 10;
        }
}
