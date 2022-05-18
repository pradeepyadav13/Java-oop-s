public class SimpleInheritance {
    void add(int a , int b){
        int sum=a+b;
        System.out.println("the sum of a and b is: "+sum);

    }
}
class Inheritance extends SimpleInheritance{

        public static void main (String [] args){

           Inheritance a=new Inheritance();
            a.add(20,30);
     }
}