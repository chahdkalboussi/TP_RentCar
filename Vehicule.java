public class Vehicule {

    private String matricule;
    private double tarifJournalier;
    private boolean disponible;

    public Vehicule(String matricule, double tarifJournalier, boolean disponible) {
        this.matricule = matricule;
        this.tarifJournalier = tarifJournalier;
        this.disponible = disponible;
    }

    public String getMatricule() { return matricule; }
    public double getTarifJournalier() { return tarifJournalier; }
    public boolean isDisponible() { return disponible; }

    @Override
    public String toString() {
        return "Matricule : " + matricule + " | Tarif : " + tarifJournalier
             + " DT/jour | Disponible : " + (disponible ? "oui" : "non");
    }
}