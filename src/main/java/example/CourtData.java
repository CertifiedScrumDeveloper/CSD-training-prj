package example;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by liusteven on 17/8/27.
 */
public class CourtData {

    public static int courtNum = 10;

    public static int slotNum = 8;

    public static int[][][] courtOrder = new int[courtNum][10000][slotNum];

    public static Map<Integer, String> courtOrderNameMap = new HashMap<Integer, String>();

    public static void clear() {
        courtOrder = new int[courtNum][10000][slotNum];
        courtOrderNameMap = new HashMap<Integer, String>();
    }

    public static boolean query(int date, int slot, int courtNo) {
        return courtOrder[courtNo][date][slot] == 0;
    }
}
