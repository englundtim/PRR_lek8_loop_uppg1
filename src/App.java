import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Uppgift a+b)");
        int i = 2;
        while(i<=5){
            System.out.println(i);
            i++;
        }
        System.out.println(" ");
        System.out.println("Uppgift c)");
        for(int i2 =0; i2<=5; i2++)
            System.out.println(i2);

        System.out.println(" ");
        System.out.println("Uppgift d)");
        int i3 = 2;
        do{
            System.out.println(i3);
            i3++;
        }while(i3<=5);
        System.out.println(" ");
        System.out.println("Uppgift e)");
        int i4=5;
        while(i4>=0){
            System.out.println(i4);
            i4--;
        }
        System.out.println(" ");
        System.out.println("Uppgift f)");
        for(int i5=5; i5>=0; i5--)
            System.out.println(i5);
        
        System.out.println(" ");
        System.out.println("Uppgift g)");
        
        int[] tal = new int[5];
        for(int i6=0; i6<tal.length; i6++){
            System.out.println("vad är ditt tal för ["+i6+"]");
            tal[i6] = in.nextInt();
        }
        for(int i7=0; i7<tal.length; i7++){
            System.out.println("Cell med index "+i7+" har värdet: "+tal[i7]);
        }
    }
}
