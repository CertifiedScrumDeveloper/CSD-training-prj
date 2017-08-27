package CorutList;

import example.Court;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhenghp on 2017/8/27.
 */
public class CourtList {
    static List<Court> list = Arrays.asList(new Court("C1"),new Court("C2"));
    public static Court getCourt(int position){
       return  list.get(0);
    }
}
