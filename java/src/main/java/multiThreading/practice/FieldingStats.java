package multiThreading.practice;

public class FieldingStats implements Runnable{
    @Override
    public void run() {
        for(int i = 0 ; i<100; i++)
        {
            System.out.println("Calculation Fielding Stats - " + i);
            
        }
    }
}
