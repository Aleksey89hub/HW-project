package HW4;

public class AnyArrays <N> {

        private N [] arr;

        public N getIndex(int i ){
            return arr[i];
        }
    public void setArr (N [] arr){
            this.arr=arr;
    }
        public int getLength(){
            return arr.length;
        }


    }


