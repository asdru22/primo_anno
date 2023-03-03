public class range{
    private int lower;
    private int upper;

    range(){
        this.lower = 1;
        this.upper = 0;
    }
    range(int x){
        if(x<0) throw new IllegalArgumentException("x < 0");
        this.lower = x;
        this.upper = x;
    }
    range(int lower, int upper){
        if(lower>upper) throw new IllegalArgumentException("Lower bound > upper bound");
        this.lower = lower;
        this.upper = upper;
    }
    public boolean contains(int n){
        return lower<n&&n<upper;
    }
    public int getLower(){
        if (lower==1&&upper==1) throw new UnsupportedOperationException("Empty Interval");
        else return lower;
    }   
    public int getUpper(){
        if (lower==1&&upper==1) throw new UnsupportedOperationException("Empty Interval");
        else return lower;
    }
    public void setLower(int x){
        if (lower==1&&upper==1) throw new UnsupportedOperationException("Empty Interval");
        else if (x>upper) throw new IllegalArgumentException("Illegal Argument");
        lower = x;
    } 
    public void setUpper(int x){
        if (lower==1&&upper==1) throw new UnsupportedOperationException("Empty Interval");
        else if (x<lower) throw new IllegalArgumentException("Illegal Argument");
        upper = x;
    }     
    public long size(){
        long l = lower;
        long u = upper;
        return u-l+1;
    }
    public String toString(){
        return lower+"..."+upper;
    }
    public boolean equals(range r){
        return (r.getLower() == lower && r.getUpper() == upper); 
    }
}