package Chapter55.e4;

import java.time.LocalDate;
import java.time.Period;

public class SmartCargo {
    private String[] names;
    private Double[] weights;
    private LocalDate[] arrivalDates;

    private static double totalNetworkWeight;
    private static double DECAY_RATE = 0.1;

    public SmartCargo(){
        this.names = new String[0];
        this.weights = new Double[0];
        this.arrivalDates = new LocalDate[0];
    }

    public void addItems(LocalDate date, String... names){
        int newLength = names.length;
        int oldLength = this.names.length; // the same old lenght for every array as they always must be the same size
        String[] newNames = new String[(newLength+oldLength)];
        Double[] newWeights = new Double[(newLength+oldLength)];
        LocalDate[] newArrivalDates = new LocalDate[(newLength+oldLength)];
        for(int i = 0; i < (newLength+oldLength); i++){
            if(i < oldLength){
                newNames[i] = this.names[i];
                newWeights[i] = this.weights[i];
                newArrivalDates[i] = this.arrivalDates[i];
            } else {
                newNames[i] = names[(i-oldLength)];
                newWeights[i] = 10.0;
                newArrivalDates[i] = date;
                totalNetworkWeight+= 10.0;
            }
        }
        this.names = newNames;
        this.weights = newWeights;
        this.arrivalDates = newArrivalDates;
        System.out.println("Added " + newLength + " new items");
    }

    public void addItems(String name, double weight, LocalDate date){
        String newName = name.trim().toUpperCase();
        double finalWeight = (weight > 100 ) ? (Math.floor(weight)) : (weight);

        int oldLength = this.names.length; // the same old lenght for every array as they always must be the same size
        String[] newNames = new String[(1+oldLength)];
        Double[] newWeights = new Double[(1+oldLength)];
        LocalDate[] newArrivalDates = new LocalDate[(1+oldLength)];
        for(int i = 0; i < (1+oldLength); i++){
            if(i < oldLength){
                newNames[i] = this.names[i];
                newWeights[i] = this.weights[i];
                newArrivalDates[i] = this.arrivalDates[i];
            } else {
                newNames[i] = newName;
                newWeights[i] = finalWeight;
                totalNetworkWeight+= finalWeight;
                newArrivalDates[i] = date;
            }
        }
        this.names = newNames;
        this.weights = newWeights;
        this.arrivalDates = newArrivalDates;
        System.out.println("Added only one item");
    }

    public void removeExpired(LocalDate referenceDate){
        for(int i = 0; i < this.arrivalDates.length; i++){
            int daysDistance = Period.between(this.arrivalDates[i], referenceDate).getDays();
            if(daysDistance > 7){
                System.out.println("Item " + this.names[i] + " already " + daysDistance + " days old. Removed!");
                totalNetworkWeight-= this.weights[i];
                this.arrivalDates[i] = null;
                this.names[i] = null;
                this.weights[i] =  null;
            }
        }
    }

    public void printManifest(){
        StringBuilder manifest = new StringBuilder();

        for(int i = 0; i < this.names.length; i++){
            String theWeight = (this.weights[i] != null ) ? (this.weights[i].toString()) : ("N/A");
            manifest.append("[").append(this.names[i]).append("] - [").append(theWeight).append("] kg - Arrived: [").append(this.arrivalDates[i]).append("] \n");
        }

        System.out.println(manifest.toString());
    }

    public void mergeBatch(SmartCargo cargo){
        int newLength = (cargo.names.length);
        int oldLength = this.names.length; // the same old lenght for every array as they always must be the same size
        int totalLength = (newLength+oldLength);
        String[] newNames = new String[(totalLength)];
        Double[] newWeights = new Double[(totalLength)];
        LocalDate[] newArrivalDates = new LocalDate[(totalLength)];
        for(int i = 0; i < (totalLength); i++){
            if(i < oldLength){
                newNames[i] = this.names[i];
                newWeights[i] = this.weights[i];
                newArrivalDates[i] = this.arrivalDates[i];
            } else {
                int currentI = (i-oldLength);
                newNames[i] = cargo.names[currentI];
                newWeights[i] = cargo.weights[currentI];
                newArrivalDates[i] = cargo.arrivalDates[currentI];
            }
            this.names = newNames;
            this.weights = newWeights;
            this.arrivalDates = newArrivalDates;
        }
    }

    public static void main(String[] args){
        SmartCargo cargo1 = new SmartCargo();
        cargo1.addItems("bananas",50.5,LocalDate.now());
        SmartCargo cargo2 = new SmartCargo();
        cargo2.addItems(LocalDate.now().minusDays(10),"Apples","Oranges");
        cargo2.removeExpired(LocalDate.now());
        cargo1.mergeBatch(cargo2);
        cargo1.printManifest();
    }
}
