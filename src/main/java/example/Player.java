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

       public Reservation reserve(String courtId, Date date, int duration) {
              this.reservation = new Reservation(courtId, name, date,duration);
              ReservationRepo.add(reservation);
              return this.reservation;
       }

       public Reservation getReservation() {
              return reservation;
       }
}
