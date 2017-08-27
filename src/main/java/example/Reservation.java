package example;

/**
 * Created by liusteven on 17/8/27.
 */
public class Reservation {

    Integer date;
    Integer slot;
    Integer courtNo;
    String name;

    public Reservation() {

    }
    public Reservation(Integer date,Integer slot,Integer courtNo,String name) {
        this.date = date;
        this.slot = slot;
        this.courtNo = courtNo;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
