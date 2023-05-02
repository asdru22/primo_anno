public class circle implements shape{
private int radius;

public circle(int radius){
this.radius= radius;
}

public double getArea(){
return 3.14*radius*radius;
}


public double getPerimeter(){
return 3.14*radius*2;
}

}