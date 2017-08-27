package example;

import java.util.Date;

/**
 * Created by zhenghp on 2017/8/27.
 */
public class Player {


       private String reserve;

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
              reserve = court.getId() +","+ date.toString();
       }

       public String getReserve() {
              return reserve;
       }
}
