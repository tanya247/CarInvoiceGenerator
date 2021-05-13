public class InvoiceGenerator {
    private static final int MINIMUM_COST_PER_KILOMETER = 10;
    private static final int COST_PER_TIME = 1  ;
    private static final double MINIMUMFARE = 5;

    public double calculateFare(double distance, int time) {
        double fare =  ((distance * MINIMUM_COST_PER_KILOMETER) + (time * COST_PER_TIME));
        if(fare < MINIMUMFARE){
            return MINIMUMFARE;
        }
        else{
            return fare;
        }
    }
}
