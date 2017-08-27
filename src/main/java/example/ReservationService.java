package example;

/**
 * Created by 84842 on 2017/8/27.
 */
public class ReservationService {
    public boolean book(Player player, Court court,int dayNum, int startTime, int endTime) {

        return court.getState(dayNum,startTime,endTime);
    }

    public boolean bookRecurring(Player player, Court court, int dayNum, int dayPeriod, int startTime, int endTime) {
        if (player.getPremium() == false) return false;

        for (int i = dayNum; i < 365; i+=dayPeriod) {
            book(player, court, dayNum, startTime, endTime);
        }

        return true;
    }
}
