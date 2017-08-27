package example;

/**
 * Created by 84842 on 2017/8/27.
 */
public class Court {

    private String name;

   private  boolean [][]result = new boolean[365][24];
    private int lon;
    private int lat;


    public void updateState(int dayNum ,int startTime, int endTime, boolean isAvailable) {

        for (int i = startTime; i < endTime; i++) {
            result[dayNum][i] = isAvailable;
        }

    }

    public boolean getState(int dayNum,int startTime, int endTime) {
        boolean innerResult = true;
        for (int i = startTime; i < endTime; i++) {
            innerResult = innerResult && result[dayNum][i];


        }
        return innerResult;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(int longitude, int latitude)
    {
        this.lon=longitude;
        this.lat=latitude;
    }

    public String getName() {
        return name;
    }

    public int getLong() {

        return this.lon;
    }

    public int getLat() {
        return this.lat;
    }
}
