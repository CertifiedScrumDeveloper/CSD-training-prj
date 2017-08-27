package tennis;

/**
 * Created by linyan on 27/08/2017.
 */
public class Court {
    private int id;
    private String name;
    //    private LocalDateTime time;
    private Position courtPosition;

    public Court(){}

    public Court(int id, String name, Position position) {
        this.id = id;
        this.name = name;
        this.courtPosition = position;
    }

    public Position getCourtPosition() {
        return courtPosition;
    }

    public int getId() {
        return id;
    }

    public void setCourtPosition(Position courtPosition) {
        this.courtPosition = courtPosition;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

}
