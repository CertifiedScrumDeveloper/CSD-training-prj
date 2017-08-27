package tennis;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by linyan on 27/08/2017.
 */
public class CourtTest {

    @Test
    public void WHEN_create_a_count_THEN_get_it(){
        Court court = new Court();
        court.setName("Count A");
        court.setId(1);
        Position position = new Position(35,35);
        court.setCourtPosition(position);
        Assert.assertEquals("Count A", court.getName());
        Assert.assertEquals(1, court.getId());
        Assert.assertEquals(position,court.getCourtPosition());


    }
}
