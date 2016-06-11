import java.util.*;
import java.util.function.IntToLongFunction;

public class MainProg {
    public static Scanner in = new Scanner(System.in);

   public static void evenOrOdd(int n){
       if (n%2==0) System.out.println("Число четное");
       else System.out.println("Число нечетное");
   }

    public static void Sum(int n){
        int sum = 0;
        sum += n%10 + n/10;
        System.out.println("Ваша сумма = "+sum);

    }

    public static void toTen(double m,double k){
        double f1 = 10-m;
        double f2 = 10-k;
        if(Math.abs(f1)<Math.abs(f2)){
            System.out.println("К 10 ближе число "+m);
            if(Math.abs(f1)==Math.abs(f2))System.out.println("Числа находятся на одинаковом 'растоянии'");
        }
        else System.out.println("К 10 ближе число "+k);
    }

    public static void main (String[] args) {
        int a,b,n;
        double m,k,g;
 //task 1
        Sth sm = new Sth();
        System.out.println(sm.getI()+" "+sm.getCh());

 //task 2
        System.out.println("+++++++++++TASK 2++++++++++");
        Dog dog1 = new Dog("Spot","Ruff!");
        Dog dog2 = new Dog("Scruffy","Wurf!");
        dog1.talk();
        dog2.talk();
 //task 3
        System.out.println("+++++++++++TASK 3++++++++++");
        System.out.print("Введите свое значение: ");
        n = in.nextInt();
        evenOrOdd(n);
 //task 4
        System.out.println("+++++++++++TASK 4++++++++++");
        System.out.print("Введите свое значение: ");
        n = in.nextInt();
        Sum(n);
 //task 5
        System.out.println("+++++++++++TASK 5++++++++++");
        System.out.println("Введите свои значение: ");
        System.out.print("m = ");
        m = in.nextDouble();
        System.out.print("n = ");
        k = in.nextDouble();
        toTen(m,k);
  //task 6
        System.out.println("+++++++++++TASK 6++++++++++");
        System.out.println("Введите значения катетов треугольника: ");
        System.out.print("a = ");
        a = in.nextInt();
        System.out.print("b = ");
        b = in.nextInt();
        triangle(a,b);
 //task 7
        System.out.println("+++++++++++TASK 7++++++++++");
        System.out.println("mx^2 + kx + g = 0");
        System.out.println("Введите значения: ");
        System.out.print("m = ");
        m = in.nextDouble();
        System.out.print("k = ");
        k = in.nextDouble();
        System.out.print("g = ");
        g = in.nextDouble();
        qE(m,k,g);
 /*task 8
        System.out.println("+++++++++++TASK 8++++++++++");
        int o = 23423;
        long h = o;
        TaskEight lon = new TaskEight();
        lon.setL(h);
        System.out.println(lon.getL());
        char cf = 'a';
        h = cf;
        lon.setL(h);
        System.out.println(lon.getL());
        h = cf;
        lon.setL(h);
        System.out.println(lon.getL());*/

    }

    public static void qE(double m, double k,double g){
        double x1, x2;
        double d = k*k - 4*m*g;
        if(d>0) {
            x1 = ((-1)*k+Math.sqrt(d))/(m*2);
            x2 = ((-1)*k-Math.sqrt(d))/(m*2);
            System.out.println("Корни уравнения "+x1+" и "+x2);
        }
        else{
            if(d==0){
                x1 = ((-1)*k)/(m*2);
                System.out.println("Корень уравнения "+x1);
            }
            else System.out.println("Корней нет");
        }

    }
   public static void triangle(int a, int b){
     double k = a*a+b*b;
     double c = Math.sqrt(k);
     System.out.println("Гипотенуза "+ c);
     double p = (c+a+b)/2;
     System.out.println("Периметр "+p*2);
     k = p*(p-a)*(p-b)*(p-c);
     double s = Math.sqrt(k);
     System.out.println("Площадь "+s);

 }

}
