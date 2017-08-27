package example;

import java.util.ArrayList;

/**
 * Created by 84842 on 2017/8/27.
 */
public class Player {
    public Court searchNearestCourt(int longitude, int latitude) {
        ArrayList<Court> courtlist = CourtManager.getAllCourts();


        Court court =new Court();
        int media= (courtlist.get(0).getLong() - longitude) + (courtlist.get(0).getLat() - latitude);

        for (int i = 1; i < courtlist.size() ; i++) {
            int d = (courtlist.get(i).getLong() - longitude) + (courtlist.get(i).getLat() - latitude);
            if (d <= media)
                media=d;
                court = courtlist.get(i);
        }


        return court;
    }


}
