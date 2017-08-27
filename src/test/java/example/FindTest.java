package example;

/**
 * Created by 84842 on 2017/8/27.
 */

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class FindTest {
    @Test
    public void GIEN_场地列表_WHEN_用户查找最近场地_THEN_返回最近场地() {

        Player player = new Player();

        Court court = player.searchNearestCourt(30, 30);

        assertEquals("场地2", court.getName());
    }

   /* @Test
    public void GIEN_场地列表_WHEN_用户查找最近场地_THEN_返回最近场地2() {

        Player player = new Player();

        Court court = player.searchNearestCourt(5, 5);

        assertEquals("场地1", court.getName());
    }*/
}
