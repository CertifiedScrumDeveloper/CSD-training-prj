package example;

import example.Court;
import example.Reservation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zhenghp on 2017/8/27.
 */
public class CourtRepo {
    static List<Court> list = new ArrayList<Court>();

    public static void clear(){
        list=new ArrayList<Court>();
    }
    public static  void add(Court court){
        list.add(court);
    }
    public static Court getNearest(int position) {
        Court court = null;

        if (list.size() == 1)
            return list.get(0);

        for(int i = 0; i < list.size() - 1; i++){
            court = list.get(i);
            Court courtNext = list.get(i + 1);
            if(getAbsDistance(court.getPosition(), position) > getAbsDistance(courtNext.getPosition(), position)){
                court = courtNext;
            }
        }

        return court;
    }

    private static int getAbsDistance(int from, int to){
        return Math.abs(from - to);
    }
}
