package HW4;

public class Task1 {
    public static void main(String[] args) {
        while (true){
            int secundsNumber=10;

            System.out.println(secundsNumber + " seconds past ");
            try{
                Thread.sleep(secundsNumber*1000);

            }catch (InterruptedException e){
                e.printStackTrace();

            }
        }
    }
}
