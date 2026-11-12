public class Voiture extends Vehicule {

    private int nbPlaces;

    public Voiture(String matricule, double tarifJournalier, boolean disponible, int nbPlaces) {
        super(matricule, tarifJournalier, disponible);
        this.nbPlaces = nbPlaces;
    }

    @Override
    public String toString() {
        return "[Voiture] " + super.toString() + " | Places : " + nbPlaces;
    }
}