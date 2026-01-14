package tenth.exercise;

public class BioDome {
    static double globalTemperature = 25.5;
    static short totalOrganisms;


    public static void main (String[] args){
        Organism alpha = new Organism(++totalOrganisms);
        byte nutrientFactor = 5;
        double metabolicRate = 1.5;
        alpha.energyLevel-=(float)(nutrientFactor*metabolicRate);

        Organism beta = new Organism(++totalOrganisms);
        boolean huntSuccessful2 = (alpha.energyLevel > beta.energyLevel ) ? (alpha.energyLevel++ > 0) : (--beta.energyLevel > 0);

        int totalOrganisms = 100;
        System.out.println("Difference between global and local values: " + (BioDome.totalOrganisms - totalOrganisms));

        String evolutionStatus = globalTemperature>30.0 ? "EXTINTION" : (alpha.energyLevel>90 ? "EVOLVED" : "STAGNANT");
        System.out.println("The evolution status is: " + evolutionStatus);

        boolean isMutated = false;
        if (isMutated = true && alpha.species!=null) {
            alpha.species = "Xenomorph";
        } else {
            alpha.species = "Human";
        }

        Organism gamma = beta;
        beta = null;
        alpha = null;


    }

}
