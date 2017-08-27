package tennis;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * Created by linyan on 27/08/2017.
 */
public class ReservationTest {
    @Test
    public void GIVEN_a_court_WHEN_new_a_reservation_THEN_get_it(){
        Court court = new Court(1, "Court A", new Position(35, 35));

        Reservation reservation = new Reservation();
        Date date = new Date();
        reservation.setDate(date);
        reservation.setAvailable(true);
        reservation.setCourt(court);
        reservation.setPrice(100);

        Assert.assertEquals(date, reservation.getDate());
        Assert.assertEquals(true, reservation.isAvailable());
        Assert.assertEquals(court, reservation.getCourt());
        Assert.assertEquals((double)100, reservation.getPrice(), 0);

    }

}
