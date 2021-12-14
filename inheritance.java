class Base1{
    int a=80;
    void write(){
        System.out.println("this is 1st base class and in this class we have create an method  and method name is write");
    }
}
    class Derived111 extends Base1{
        public int b;
        //int b =89;
        void write2(int b ){
            System.out.println("this is 2nd class name derived and in this we have create an method name write2 and extend with class 1");
        }
    }

    public class inheritance22  {
        public static void main(String[] args) {
            System.out.println("OOP's");
            //create an object for calling class 1
            Base1 obj11 = new Base1();
            System.out.println( obj11.a);
            System.out.println("the value of a "+ obj11.a);
            obj11.write();
            Derived111 obj22 = new Derived111();
            //System.out.println(obj22.b);
            obj22.b=90;
            System.out.println("the value of b "+ obj22.b);


        }

    }

