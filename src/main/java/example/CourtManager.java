package example;

import java.util.ArrayList;

/**
 * Created by 84842 on 2017/8/27.
 */
public class CourtManager {
    public  static ArrayList<Court> courtlist = new ArrayList<Court>();

    public static ArrayList<Court> getAllCourts(){
      Court court1 = new Court();
        court1.setName("场地1");
        court1.setLocation(10, 10);

        Court court2 = new Court();
        court2.setName("场地2");
        court2.setLocation(20, 20);
        courtlist.add(court2);

        return courtlist;
    }
}
