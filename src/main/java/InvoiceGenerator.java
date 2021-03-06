public class InvoiceGenerator {
    private static final int MINIMUM_COST_PER_KILOMETER = 10;
    private static final int COST_PER_TIME = 1  ;
    private static final double MINIMUMFARE = 5;

    public double calculateFare(double distance, int time) {
        double fare =  ((distance * MINIMUM_COST_PER_KILOMETER) + (time * COST_PER_TIME));
        return Math.max(fare, MINIMUMFARE);
    }
    public InvoiceSummary calculateFare(Ride[] rides){
        double fare = 0;
        for (Ride ride: rides) {
            fare += this.calculateFare(ride.distance,ride.time);
        }
        return new InvoiceSummary(rides.length, fare);
    }
}
