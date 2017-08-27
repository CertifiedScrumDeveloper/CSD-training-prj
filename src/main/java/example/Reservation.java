package example;

import java.util.Date;

/**
 * Created by zhenghp on 2017/8/27.
 */
public class Reservation {
    public Reservation(String courtId, String playerName, Date date,int duration) {
        this.courtId = courtId;
        this.playerName = playerName;
        this.date = date;
        this.duration=duration;
        this.id = (long)(1000000 * Math.random());
    }

    private long id;
    private String courtId;
    private Date date;
    private String playerName;
    private int duration;

    public long getId(){
        return id;
    }

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

    public int getDuration() {
        return duration;
    }
}
