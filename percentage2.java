
/*
3.	We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A
and in four subjects (each out of 100) by student B. Create an abstract class 'Marks' with an abstract method
'getPercentage'. It is inherited by two other classes 'A' and 'B' each having a method with the same name which
returns the percentage of the students. The constructor of student A takes the marks in three subjects as its
parameters and the marks in four subjects as its parameters for student B. Create an object for eac of the two
classes and print the percentage of marks for both the students.
*/

public class AB {
    public static void main(String[] args) {
        A a = new A(70, 50, 100);
        System.out.println(a.getPercentage());
        B b = new B(90, 75, 64, 86);
        System.out.println(b.getPercentage());
    }

}
abstract class  Mar {
    public abstract float getPercentage();
}

class A1 extends Mar{
    int marks1, marks2, marks3;
    A1(int m1, int m2, int m3){
        marks1=m1;
        marks2=m2;
        marks3=m3;
    }
    public float getPercentage(){
        float total=((marks1+marks2+marks3)/(float)300)*100;
        return total;

    }

}

class B1 extends Mar{
    int marks1, marks2, marks3, marks4;

    B1(int m1, int m2, int m3, int m4){
        marks1=m1;
        marks2=m2;
        marks3=m3;
        marks4=m4;
    }

    public float getPercentage(){
        float total=((marks1+marks2+marks3+marks4)/(float)400)*100;
        return total;
    }

}



