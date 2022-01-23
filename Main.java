public class Main {
    public static void main(String[] args){

        int counter;
        for (counter=1; counter<=100; counter++){
            if(counter%3==0)
            {
                System.out.println("Fizz");
            }
            else if(counter%5==0){
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(counter);
            }
        }
    }
}
