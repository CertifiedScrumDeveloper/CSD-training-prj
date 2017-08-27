package example;

/**
 * Created by liusteven on 17/8/27.
 */
public class Reservation {

    Integer date;
    Integer slot;
    Integer courtNo;

    public Reservation(Integer date,Integer slot,Integer courtNo) {
        this.date = date;
        this.slot = slot;
        this.courtNo = courtNo;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    public Integer getCourtNo() {
        return courtNo;
    }

    public void setCourtNo(Integer courtNo) {
        this.courtNo = courtNo;
    }
}
