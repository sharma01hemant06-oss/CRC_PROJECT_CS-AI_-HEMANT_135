import java.util.*;
class Student{
    String name;
    int roll;
    int marks[];

    Student(String n,int r,int m[]){
        name=n;
        roll=r;
        marks=m;
    }

    void display(){
        int sum=0;
        for(int i=0;i<marks.length;i++)
            sum+=marks[i];

        double avg=(double)sum/marks.length;
        double gpa=avg/10;

        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
        System.out.println("GPA: "+gpa);

        if(avg>=90)
            System.out.println("Grade: A");
        else if(avg>=75)
            System.out.println("Grade: B");
        else if(avg>=60)
            System.out.println("Grade: C");
        else if(avg>=50)
            System.out.println("Grade: D");
        else
            System.out.println("Grade: F");
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String name=sc.nextLine();
        int roll=sc.nextInt();
        int n=sc.nextInt();

        int m[]=new int[n];
        for(int i=0;i<n;i++)
            m[i]=sc.nextInt();

        Student s=new Student(name,roll,m);
        s.display();
    }
}
