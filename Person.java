class Person{
int age;
float height,weight;

public static void main(String[]args)
{
Person person1 = new Person(18);
Person person2 = new Person(20,55.0f,162.0f);
Person person3 = new Person(70.0f,170.0f);

System.out.println("details of the person 1:");
person1.display();
System.out.println("details of the person 2:");
person2.display();
System.out.println("details of the person 3:");
person3.display();
}

public Person(int age)
{
this.age=age;
this.height=150.0f;
this.weight=45.0f;
}

public Person(int age,float weight, float height)
{
    this.age=age;
this.height=height;
this.weight=weight;
}

public Person(float weight, float height)
{
    this.age=30;
this.height=height;
this.weight=weight;
}

public void display()
{
System.out.println("Age : "+age+" years");
System.out.println("Height : "+height+" cm");
System.out.println("Weight : "+weight+" kg");
}
}
