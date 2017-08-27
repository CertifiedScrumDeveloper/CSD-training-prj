package example;

/**
 * Created by 84842 on 2017/8/27.
 */
public class ReservationService {
    public boolean book(Player player, Court court, int startTime, int endTime) {

        return court.getState(startTime,endTime);
    }
}
