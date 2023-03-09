import java.lang.UnsupportedOperationException;
import java.util.Arrays;

public class RangeList {

  private class RangeNode {
    Range range;
    RangeNode next;
    
    RangeNode(int x) {
      range = new Range(x);
      next = null;
    }
    
    RangeNode(int x, int y) {
      range = new Range(x, y);
      next = null;
    }
    
  }
  
  private RangeNode head;

  public RangeList() {
    head = null;
  }
  
  public RangeList(int x) {
    head = new RangeNode(x);
  }
  
  public RangeList(int x, int y) {
    head = new RangeNode(x, y);
  }
  
  public RangeList(int[] A) {
    int n = A.length;
    if (n == 0) {
      head = null;
      return;
    }
    int[] A1 = new int[n];
    for (int i = 0; i < n; ++i)
      A1[i] = A[i];
    Arrays.sort(A1);
    head = new RangeNode(A1[0]);
    RangeNode p = head;
    for (int i = 1; i < n; ++i)
      if (A1[i] > A1[i-1] + 1) {
        RangeNode q = new RangeNode(A1[i]);
        p.next = q;
        p = q;
      }
      else if (A1[i] > A1[i-1])
        p.range.setUpper(A1[i]);
  }
  
  public String toString() {
    if (head == null)
      return "{}";
    if (head.next == null)
      if (head.range.size() == 1)
        return "{" + head.range.getLower() + "}";
      else
        return head.range.toString();
    String s = "{";
    RangeNode p = head;
    do {
      Range r = p.range;
      s += r.getLower();
      if (r.size() > 1)
        s += ".." + r.getUpper();
      p = p.next;
      if (p != null)
        s += ", ";
    } while (p != null); 
    return s + "}";
  }
  
  boolean isEmpty() {
    return head == null;
  }
  
  long size() {
    long n = 0;
    RangeNode p = head;
    while (p != null) {
      n += p.range.size();
      p = p.next;
    }
    return n;
  }
  
  int min() {
    if (head == null)
      throw new UnsupportedOperationException("Min on empty set.");
    return head.range.getLower();
  }
  
  int max() {
    if (head == null)
      throw new UnsupportedOperationException("Max on empty set.");
    RangeNode p = head;
    while (p.next != null)
      p = p.next;
    return p.range.getUpper();
  }
  
  public boolean equals(RangeList x) {
    if (this == x)
      return true;
    if (head == null || x.head == null)
      return head == x.head;
    RangeNode p1 = head;
    RangeNode p2 = x.head;
    while (p1.range.equals(p2.range)) {
      p1 = p1.next;
      p2 = p2.next;
      if (p1 == null || p2 == null)
        return p1 == p2;
    }
    return false;
  }
  
  public boolean contains(int x) {
    if (head == null)
     return false;
    RangeNode p = head;
    while (p != null) {
     Range r = p.range;
     if (x < r.getLower())
       return false;
     if (r.contains(x))
       return true;
     p = p.next;
    }
    return false;
  }
  

}