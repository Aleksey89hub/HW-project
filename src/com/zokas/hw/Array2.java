package HW4;

public class Array2 {

    public static <N>void array (String s, N [] arr) {


        N [] a =arr;

        AnyArrays <N> array = new AnyArrays<>();
        array.setArr(a);

        System.out.println(s + " ");
        for(int i =0;i<array.getLength();i++){
            System.out.println(array.getIndex(i));
            System.out.println();
        }



    }

    public static void main(String[] args) {
        String [] b ={"Privet", " poka"};
        array("String ",b);

        Double [] db = { 2.4,4.2,5.6};
        array("Integer ",db);

        Integer [] inte = { 3,5,6,8,9};
        array("Double",db);

    }
}



