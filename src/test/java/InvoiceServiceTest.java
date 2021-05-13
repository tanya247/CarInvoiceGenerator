import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InvoiceServiceTest {
    InvoiceGenerator invoiceGenerator = null;
    @BeforeEach
    public void setUp() throws Exception {
         invoiceGenerator = new InvoiceGenerator();
    }
    @Test
    public void theGivenDistanceAndTimeShouldReturnTotalFare() {
        double distance = 2.0;
        int time = 5;
        double fare = invoiceGenerator.calculateFare(distance,time);
        System.out.println("Total Fare is : Rs. "+ fare);
        Assertions.assertEquals(25,fare,0.0);
    }
    @Test
    public void givenLessDistanceOrTime_ShouldReturnMinimumFare() {
        double distance = 0.1;
        int time = 1;
        double fare = invoiceGenerator.calculateFare(distance,time);
        System.out.println("Total Fare is : Rs. "+ fare);
        Assertions.assertEquals(5,fare,0.0);
    }

    /*@Test
    public void givenMultipleRides_ShouldReturnTotalFare() {
        double distance = 0.1;
        int time = 1;
        Ride[] rides = {new Ride(2.0, 5),
                new Ride(0.1, 1)
        };
        double fare = invoiceGenerator.calculateFare(rides);
        System.out.println("Total Fare is : Rs. " + fare);
        Assertions.assertEquals(30, fare, 0.0);
    }*/
    @Test
    public void givenMultipleRides_ShouldReturnInvoiceSummary() {
        double distance = 0.1;
        int time = 1;
        Ride[] rides = {new Ride(2.0, 5),
                new Ride(0.1, 1)
        };
        InvoiceSummary summary = invoiceGenerator.calculateFare(rides);
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30.0);
        Assertions.assertEquals(expectedInvoiceSummary,summary);
    }

}
