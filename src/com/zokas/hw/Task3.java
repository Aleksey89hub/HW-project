package HW2;

public class Task3 {
    public static void main(String[] args) {
        String v_new = "10.1.2";
        String v_use = "10.1.0";
        String[] mas_new = v_new.split("\\.");
        String[] mas_use = v_use.split("\\.");
        int a=0;
        int b=0;
        for(int i= 0;i<mas_use.length;i++){
            a=Integer.parseInt(mas_new[i]);
            b=Integer.parseInt(mas_use[i]);

            System.out.print("Используемая версия самая новая");
            System.out.print("Используемая версия устаревшая");
        }

    }
}
