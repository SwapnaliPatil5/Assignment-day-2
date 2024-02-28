class Vehicle{

int price;
String color;
String model;

public static void main(String[]args)
{
Vehicle vehicle = new Vehicle(9,"black","Ford");
vehicle.display();
}

public Vehicle(int price,String color,String model)
{
this.price=price;
this.color=color;
this.model=model;
}


public void display()
{
System.out.println("price: "+price + " lakhs");
System.out.println("color: "+color);
System.out.println("model: "+model);
}

}
