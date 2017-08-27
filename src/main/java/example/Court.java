package example;

/**
 * Created by 84842 on 2017/8/27.
 */
public class Court {

    private String name;

   private  boolean []result = new boolean[24];
    private int lon;
    private int lat;


    public void updateState(int start, int end, boolean b) {

        for (int i = start; i < end; i++) {
            result[i] = b;
        }

    }

    public boolean getState(int start, int end) {
        boolean innerResult = true;
        for (int i = start; i < end; i++) {
            innerResult = innerResult && result[i];


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
