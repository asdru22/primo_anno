public class parallelogram implements shape{
private int height;
private int base;

public parallelogram(int base,int height){
this.base= base;
this.height= height;
}

@Override
public double getArea(){
return base*height/2.0;
}

@Override
public double getPerimeter(){
return 2*(height+base);
}

}