public class square implements shape{
private int side;

public square(int side){
this.side=side;
}

public double getArea(){
return side*side;
}


public double getPerimeter(){
return 4*side;
}

@Override
public String toString(){
    return "im a square";
}

}