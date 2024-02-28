class Student {

String name;
 int sub1,sub2,sub3;
 

public static void main(String []args){

Student student = new Student("swapnali",67,76,87);
student.display();
}

//constructor to assign initial values

public Student(String name,int sub1,int sub2,int sub3)
{
this.name= name;
this.sub1 =sub1;
this.sub2 = sub2;
this.sub3 = sub2;
}

void computeTotalAverage()
{
float avg = (sub1+sub2+sub3)/3.0f;
System.out.println("total average is "+ avg);
}

public void display()
{
System.out.println("student name: "+ name);
float TotalMarks = sub1+sub2+sub3;
System.out.println("Total marks: "+ TotalMarks);
computeTotalAverage();
}
}