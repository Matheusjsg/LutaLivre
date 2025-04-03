public class Main {
    
    public static void main(String[] args) {
        

        Lutador lutador []= new Lutador[2];

        lutador[0] = new Lutador ("Mike", "Brasileiro", 36, 1.75, 92, 6, 2, 3);
      


            System.out.println("______________________________________");

        lutador[1] = new Lutador ("James", "Americano", 30, 1.96, 97, 8, 4, 2);
      

        Luta Card365 = new Luta(lutador[1], lutador[0]);

        System.out.println("____________________________________");
        System.out.println("____________________________________");
        System.out.println("____________________________________");
     
     
        Card365.lutar();


        System.out.println("____________________________________");
        System.out.println("____________________________________");
        System.out.println("____________________________________");
       
        lutador[0].status();
       
        System.out.println("____________________________________");

         lutador[1].status();

}
}
