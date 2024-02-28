class Box{

int height,width,breadth;

public static void main(String[]args)
{
Box box1 = new Box(5,7,2);
int a = box1.getVolume();
System.out.println(a);

int b = box1.getArea();
System.out.println(b);

Box box2 = new Box(2,3,4);
int x = box2.getVolume();
System.out.println(x);

int y = box2.getArea();
System.out.println(y);

}

public Box(int height,int width,int breadth)
{
this.height=height;
this.width=width;
this.breadth=breadth;
}


public int getVolume()
{
int volume = height*width*breadth;
return volume;
}

public int getArea()
{
int area = height*breadth;
return area;
}

}
