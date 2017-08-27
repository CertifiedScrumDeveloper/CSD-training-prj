package tennis;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by linyan on 27/08/2017.
 */
public class PlayerTest {

    @Test
    public void WHEN_a_new_premiun_player_THEN_get_it(){

        Player player = new Player(1, "PlayerA", true);
        Assert.assertEquals(1, player.getId());
        Assert.assertEquals("PlayerA", player.getName());
        Assert.assertEquals(true, player.isPremiun());

    }

    @Test
    public void GIVEN_Normal_Player_WHEN_reserve_Available_count_THEN_should_return_Success(){
        Player player = new Player(1, "PlayerA", false);
        Court courtA = new Court(1,"CourtA",new Position(35,35));
        Reservation res = new Reservation(courtA, "2017-8-8, 12:00", true);

        boolean result = player.reserve(res);


    }
}
