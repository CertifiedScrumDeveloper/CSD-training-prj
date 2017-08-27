package tennis;

/**
 * Created by linyan on 27/08/2017.
 */
public class Order {

    private Reservation reservation;
    private Player player;

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }


    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
