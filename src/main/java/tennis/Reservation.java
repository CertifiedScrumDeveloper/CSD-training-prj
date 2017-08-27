package tennis;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by linyan on 27/08/2017.
 */
public class Reservation {

    private Court court;
    private String date;
    private double price;
    private boolean isAvailable;

    public Reservation(Court court, String date, boolean isAvailable) {
        this.court = court;
        this.date = date;
        this.isAvailable = isAvailable;
    }

    public Reservation() {

    }

    public Court getCourt() {
        return court;
    }

    public void setCourt(Court court) {
        this.court = court;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String  date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public static Map<Double, List<Reservation>> calDistanceAndAvailableCourt(Position position, List<Reservation> reservationList ) {
        Map<Double, List<Reservation>> reservationMap =
                reservationList.stream().filter(item-> item.isAvailable())
                        .collect(Collectors.groupingBy(item -> position.calculateDistance(item.getCourt().getCourtPosition())));

        return reservationMap;
    }
}
