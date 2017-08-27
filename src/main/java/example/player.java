package example;

import java.util.Date;

/**
 * Created by zhenghp on 2017/8/27.
 */
public class Player {


       private Reservation reservation;

       public Player(String name){
             this.name= name;
       }
       private String name;

       public String getName() {
              return name;
       }

       public void setName(String name) {
              this.name = name;
       }

       public void reserve(Court court, Date date) {
              this.reservation = new Reservation(court.getId(), name, date);
       }

       public Reservation getReservation() {
              return reservation;
       }
}
