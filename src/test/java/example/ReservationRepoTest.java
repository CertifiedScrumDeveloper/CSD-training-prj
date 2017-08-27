package example;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * Created by zhenghp on 2017/8/27.
 */
public class ReservationRepoTest {
    @Test
    public void GIVEN_the_reservation_repo_WHEN_add_a_reservation_THN_it_should_be_in_the_repo(){
        //Given
        Reservation reservation = new Reservation("C1", "jack", new Date(), 2);

        // When
        ReservationRepo.add(reservation);

        // THEN
        Reservation fromRepo = ReservationRepo.getById(reservation.getId());
        assertEquals(reservation.getCourtId(), fromRepo.getCourtId());
    }
}