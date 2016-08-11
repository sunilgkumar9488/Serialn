/**
 * Created by gudkumar on 8/11/2016.
 */
public class Row {
    private int start;
    private int end;
    private String S;
    private int level;

    public void row(int start,int end,String S,int level)
    {
        this.start=start;
        this.end=end;
        this.S=S;
        this.level=level;
    }

    public int getStart()
    {
        return this.start;
    }

    public int getEnd() {
        return end;
    }

    public int getLevel() {
        return level;
    }

    public String getS() {
        return S;
    }
}
