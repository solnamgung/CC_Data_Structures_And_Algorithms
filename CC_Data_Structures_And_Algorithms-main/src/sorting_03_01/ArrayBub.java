package sorting_03_01;

class ArrayBub {

    private long[] a;
    private int nElement;

    public ArrayBub(int max) {
        a = new long[max];
        nElement = 0;
    }

    public void insert(long value) {
        a[nElement] = value;
        nElement ++;
    }

    public void display() {
        for(int i = 0; i < nElement; i++)
            System.out.print(a[i] + " " );
        System.out.println("");
    }

    public void bubbleSort() {
        int out;
        int in;

        for(out = nElement -1; out > 1; out--) {
            for(in = 0; in < out; in++) {
                if(a[in] > a[in+1])
                    swap(in, in + 1);
            }
        }
    }
    public void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

}