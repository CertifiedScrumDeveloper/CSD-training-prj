package tennis;

/**
 * Created by linyan on 27/08/2017.
 */
public class Position {
    public Position(long latitude, long longtitude) {
        this.latitude = latitude;
        this.longtitude = longtitude;
    }

    public long getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    public long getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(long longtitude) {
        this.longtitude = longtitude;
    }

    private long latitude;
    private long longtitude;

    public double calculateDistance(Position anotherPosition) {
        return  Math.sqrt(Math.pow((this.getLatitude() - anotherPosition.getLatitude()),2) +
                Math.pow(this.getLatitude() - anotherPosition.getLongtitude(),2));
    }


}
