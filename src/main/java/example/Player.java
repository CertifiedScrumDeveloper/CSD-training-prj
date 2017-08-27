package example;

import java.util.ArrayList;

/**
 * Created by 84842 on 2017/8/27.
 */
public class Player {
    private boolean premium;

    public Court searchNearestCourt(int longitude, int latitude) {
        ArrayList<Court> courtlist = CourtManager.getAllCourts();


        Court court =courtlist.get(0);
        int media= Math.abs(courtlist.get(0).getLong() - longitude) +Math.abs (courtlist.get(0).getLat() - latitude);

        for (int i = 1; i < courtlist.size() ; i++) {
            int d = Math.abs(courtlist.get(i).getLong() - longitude) +Math.abs (courtlist.get(i).getLat() - latitude);
            if (d <= media)
                media=d;
                court = courtlist.get(i);
        }


        return court;
    }


    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public boolean getPremium() {
        return this.premium;
    }
}
