import java.util.Scanner;
  public class SimpleInterest{
    public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
     double principle = sc.nextDouble();
     double rate = sc.nextDouble();
     double time  = sc.nextDouble();
     double simpleInterest = (principle*rate*time)/100;
     System.out.println("The Simple Interest is " + simpleInterest + " for Principle " + principle + " Rate of Interest " + rate +  " and Time " + time);
}
}
}
}
}
