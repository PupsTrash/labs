public class example17_06 {
    private int min = Integer.MAX_VALUE;
    private int max = Integer.MIN_VALUE;

    public example17_06(int val1, int val2) {
        minMax(val1,val2);
    }

    public example17_06(int val1){
        minMax(val1);
    }
    public example17_06(){}

    public void minMax(int val1, int val2) {
        if (val1 > val2){
            if (val1 > this.max){
                this.max = val1;
            }
            if (val2 < this.min){
                this.min = val2;
            }
        }
        if (val1 < val2){
            if (val2 > this.max){
                this.max = val2;
            }
            if (val1 < this.min){
                this.min = val1;
            }
        }
    }

    public void minMax(int val1){
        if (val1 > this.max){
            this.max = val1;
        }
        if (val1 < this.min){
            this.min = val1;
        }
    }

    public void showAllValue(){
        System.out.println("min = "+ this.min + "\nmax = " + this.max);
    }
}
