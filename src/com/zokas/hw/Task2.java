package HW2;

public class Task2 {
    public static void main(String[] args) {
        String str = "((a+b)*(a+c))-3";
        char a='(';
        char b=')';
        int sum_a=0;
        int sum_b=0;
        char[] result = str.toCharArray();
        for(int i= 0;i<result.length;i++){
            if(result[i]==a){
                sum_a++;
            }
            if(result[i]==b){
                sum_b++;
            }
        }
        if(sum_a==sum_b){
            System.out.print("Совпадает");
        } else {
            System.out.print("Не совпадает");
        }

    }
}
