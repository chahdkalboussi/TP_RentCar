public class AgenceLocation {

    private Voiture[] voitures;
    private Moto[] motos;
    private int nbVoitures;
    private int nbMotos;

    public AgenceLocation(int taille) {
        voitures = new Voiture[taille];
        motos = new Moto[taille];
        nbVoitures = 0;
        nbMotos = 0;
    }
    public void ajouterVehicule(Voiture v) {
        if (nbVoitures < voitures.length) {
            voitures[nbVoitures] = v;
            nbVoitures++;
        } else {
            System.out.println("Tableau des voitures plein");
        }
    }
    public void ajouterVehicule(Moto m) {
        if (nbMotos < motos.length) {
            motos[nbMotos] = m;
            nbMotos++;
        } else {
            System.out.println("Tableau des motos plein");
        }
    }

    public void afficherVehiculesDisponibles() {
        for (int i = 0; i < nbVoitures; i++) {
            if (voitures[i].isDisponible()) {
                System.out.println(voitures[i]);
            }
        }
        for (int i = 0; i < nbMotos; i++) {
            if (motos[i].isDisponible()) {
                System.out.println(motos[i]);
            }
        }
    }

    public Voiture rechercherVoiture(String matricule) {
        for (int i = 0; i < nbVoitures; i++) {
            if (voitures[i].getMatricule().equals(matricule)) {
                return voitures[i];
            }
        }
        return null;
    }
    public double calculerTarifMoyen() {
        double somme = 0;
        int nb = 0;
        for (int i = 0; i < nbVoitures; i++) {
            if (voitures[i].isDisponible()) {
                somme += voitures[i].getTarifJournalier();
                nb++;
            }
        }
        if (nb == 0) return 0;
        return somme / nb;
    }
}