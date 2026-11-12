public class Moto extends Vehicule {

    private boolean casqueInclus;

    public Moto(String matricule, double tarifJournalier, boolean disponible, boolean casqueInclus) {
        super(matricule, tarifJournalier, disponible);
        this.casqueInclus = casqueInclus;
    }

    @Override
    public String toString() {
        return "[Moto] " + super.toString() + " | Casque inclus : " + (casqueInclus ? "oui" : "non");
    }
}