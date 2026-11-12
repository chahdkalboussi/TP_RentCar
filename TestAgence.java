public class TestAgence {
    public static void main(String[] args) {

        Voiture v = new Voiture("123TU4567", 80, true, 5);
        Moto m = new Moto("456TU7890", 40, true, true);

        AgenceLocation agence = new AgenceLocation(10);
        agence.ajouterVehicule(v);
        agence.ajouterVehicule(m);

        System.out.println("=== Véhicules disponibles ===");
        agence.afficherVehiculesDisponibles();

        System.out.println("\n=== Recherche de la voiture 123TU4567 ===");
        Voiture trouvee = agence.rechercherVoiture("123TU4567");
        if (trouvee != null) {
            System.out.println(trouvee);
        } else {
            System.out.println("Voiture introuvable");
        }

        System.out.println("\n=== Tarif journalier moyen des voitures disponibles ===");
        System.out.println(agence.calculerTarifMoyen() + " DT");
    }
}