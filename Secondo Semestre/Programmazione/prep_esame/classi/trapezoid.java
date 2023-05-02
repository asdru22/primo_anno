public class trapezoid implements shape{
private int base;
private int base1;
private int height;

public trapezoid(int base,int base1,int height){
this.base= base;
this.base1= base1;
this.height= height;
}

public double getArea(){
return height*(base+base1)/2;
}

public double getPerimeter(){
return 2*(height)+(base1+base);
}

}