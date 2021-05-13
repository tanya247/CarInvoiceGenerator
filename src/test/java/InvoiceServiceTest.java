import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvoiceServiceTest {
    @Test
    public void theGivenDistanceAndTimeShouldReturnTotalFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 2.0;
        int time = 5;
        double fare = invoiceGenerator.calculateFare(distance,time);
        System.out.println("Total Fare is : Rs. "+ fare);
        Assertions.assertEquals(25,fare,0.0);
    }
    @Test
    public void givenLessDistanceOrTime_ShouldReturnMinimumFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 0.1;
        int time = 1;
        double fare = invoiceGenerator.calculateFare(distance,time);
        System.out.println("Total Fare is : Rs. "+ fare);
        Assertions.assertEquals(5,fare,0.0);
    }

    @Test
    void givenMultipleRides_ShouldReturnTotalFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 0.1;
        int time = 1;
        Ride[] rides = {new Ride(2.0, 5),
                new Ride(0.1, 1)
        };
        double fare = invoiceGenerator.calculateFare(rides);
        System.out.println("Total Fare is : Rs. " + fare);
        Assertions.assertEquals(30, fare, 0.0);
    }
}
