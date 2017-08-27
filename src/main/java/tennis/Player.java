package tennis;


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
}
