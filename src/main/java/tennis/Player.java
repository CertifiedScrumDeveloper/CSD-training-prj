package tennis;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by linyan on 27/08/2017.
 */
public class Player {

    private GPSService gpsService = new GPSService();

    private String name;

    private int id;

    private boolean isPremiun;

    public Player(int id, String name, boolean isPremiun) {
        this.id=id;
        this.name=name;
        this.isPremiun =isPremiun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getCurrentPosition() {
        return gpsService.getCurrentPosition();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isPremiun() {
        return isPremiun;
    }

    public void setPremiun(boolean premiun) {
        isPremiun = premiun;
    }

    public boolean reserve(Reservation res) {
        res.setAvailable(false);
        return true;
    }

    public List<Reservation> recurringReserve(int interval, String startDate, int times) {
        List<Reservation> reservationList = Reservation.getAvailableReservationList();
        List<Reservation> successReservationList = new ArrayList<>();

        DateTimeFormatter formater = DateTimeFormatter.ofPattern("yyyy-MM-dd, HH:mm");
        LocalDateTime currentDateTime = LocalDateTime.parse(startDate, formater);
        for(int i= 0; i<times; i++){
            Reservation currentReservation = findAvailabeReservationAndReserve(reservationList, formater, currentDateTime);
            if(currentReservation.getDate() != null)
                successReservationList.add(currentReservation);
            currentDateTime = currentDateTime.plusDays(interval);
        }
        return successReservationList;

    }

    private Reservation findAvailabeReservationAndReserve(List<Reservation> reservationList, DateTimeFormatter formater, LocalDateTime currentDateTime) {
        Optional<Reservation> currentReservation = reservationList.stream().filter(reservation->
                currentDateTime.equals(LocalDateTime.parse(reservation.getDate(), formater)) &&
                        reservation.isAvailable()
        ).findFirst();

        if(currentReservation.isPresent()) {
            this.reserve(currentReservation.get());
            return currentReservation.get();
        }

        return new Reservation();
    }
}
