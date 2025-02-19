public class Exp2 {
    public static void main(String[]args){
        //Swapping two numbers using third variable:(temp)
        int num1=5;
        int num2=10;
        int temp;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println(num1);
        System.out.println(num2);
        //Swapping two numbers without third variable
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println(num1);
        System.out.println(num2);
        
    }
    
}
