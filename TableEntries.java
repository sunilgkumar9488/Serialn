import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by gudkumar on 8/11/2016.
 */
public class TableEntries extends Range{

    private String s="";
    private int level;

    TableEntries(int low,int high,String s,int level)
    {
        this.low=low;
        this.high=high;
        this.s=s;
        this.level=level;
    }

    public String getS() {
        return s;
    }

    public int getLevel() {
        return level;
    }

}
