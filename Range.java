
public class Range {
    int low;
    int high;
    
    public int getLow() {
    	return low;
    }
    
    public int getHigh() {
    	return high;
    }
    
    public boolean iscontains(Range r) {
    	return ((r.getLow()>this.low) && (r.getHigh()<this.high));
    }
    
    public boolean isless(Range r) {
    	return (this.high<r.getLow());
    }
    
    public boolean isgreater(Range r) {
    	return (r.getHigh()<this.low);
    }
    
    public boolean isequal(Range r) {
    	return ((r.getHigh()==this.high)&&(r.getLow()==this.low));
    }
    
    public boolean isadjacent(Range r) {
    	return ((r.getHigh()==this.low)||(r.getLow()==this.high));
    }
    
    public boolean lowIntersects(Range r) {
    	return ((r.getHigh()>this.low)&&(r.getLow()<this.low));
    }
    
    public boolean highIntersects(Range r) {
    	return ((r.getLow()<this.high)&&(r.getHigh()>this.high));
    }
}
