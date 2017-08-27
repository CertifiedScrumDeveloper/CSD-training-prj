package example;

import java.util.Date;

/**
 * Created by zhenghp on 2017/8/27.
 */
public class Reservation {
    public Reservation(String courtId, String playerName, Date date) {
        this.courtId = courtId;
        this.playerName = playerName;
        this.date = date;
    }

    private String courtId;
    private Date date;
    private String playerName;

    public String getCourtId() {
        return courtId;
    }

    public void setCourtId(String courtId) {
        this.courtId = courtId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
