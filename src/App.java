public class App {
    public static void main(String[] args) throws Exception {
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
    }
}
