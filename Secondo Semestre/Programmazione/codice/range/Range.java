import java.lang.UnsupportedOperationException;
import java.lang.IllegalArgumentException;

public class Range {

  private int lower;
  private int upper;
  
  public Range() {
    lower = 1;
    upper = 0;
  }
  
  public Range(int x) {
    lower = upper = x;
  }
  
  public Range(int x, int y)
  throws IllegalArgumentException {
  	if (y < x)
      throw new IllegalArgumentException("Upper bound lower than lower bound.");
    lower = x;
    upper = y;
  }
  
  public int getLower() 
  throws UnsupportedOperationException {
    if (isEmpty())
      throw new UnsupportedOperationException("Get on empty interval.");
    return lower;
  }
  
  public int getUpper() 
  throws UnsupportedOperationException {
    if (isEmpty())
      throw new UnsupportedOperationException("Get on empty interval.");
    return upper;
  }
  
  public void setLower(int x) 
  throws UnsupportedOperationException,
              IllegalArgumentException {
    if (isEmpty())
      throw new UnsupportedOperationException("Set on empty interval.");
    if (x > upper)
      throw new IllegalArgumentException("Upper bound too big.");
    lower = x;
  }
  
  public void setUpper(int x) 
  throws UnsupportedOperationException,
              IllegalArgumentException {
    if (isEmpty())
      throw new UnsupportedOperationException("Set on empty interval.");
    if (x < lower)
      throw new IllegalArgumentException("Upper bound too small.");
    upper = x;
  }
  
  public long size() {
    return upper - lower + 1;
  }
  
  public boolean isEmpty() {
    return lower > upper;
  }
  
  public boolean contains(int x) {
    return lower <= x && x <= upper;
  }
  
  public String toString() {
    if (isEmpty())
      return "{}";
    return lower + ".." + upper;
  }
  
  public boolean equals(Range r) {
    return lower == r.lower && upper == r.upper;
  }

}


