package example;

/**
 * Created by zhenghp on 2017/8/27.
 */
public class Court {
    private String _id;
    private int _position;

    public Court(String id){
        this._id = id;
    }

    public String getId(){
        return  this._id;
    }

    public int getPosition() { return _position; }
}
