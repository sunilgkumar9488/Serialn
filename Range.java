
public class Range {
    int low;
    int high;

    public int getLow() {
        return low;
    }

    public int getHigh() {
        return high;
    }

    public boolean iscontains(TableEntries other) {
        return ((this.low<other.low) && (this.high>other.high));
    }

    public boolean isless(TableEntries other) {
        return (other.high<this.low);
    }

    public boolean isgreater(TableEntries other) {
        return (other.low>this.high);
    }

    public boolean isequal(TableEntries other) {
        return ((other.high==this.high)&&(other.low==this.low));
    }

    public boolean isadjacent(TableEntries other) {
        return ((other.high==this.low)||(other.low==this.high));
    }

    public boolean lowIntersects(TableEntries other) {
        return ((other.high>this.low)&&(other.low<this.low));
    }

    public boolean highIntersects(TableEntries other) {
        return ((other.low<this.high)&&(other.high>this.high));
    }
}
