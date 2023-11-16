package sorting_03_02;

public class ArraySel {
    private long[] a;
    private int nElement;

    public ArraySel(int max) {
        a = new long[max];
        nElement = 0;
    }

    public void insert(long value) {
        a[nElement] = value;
        nElement++;
    }

    public void display() {
        for(int i = 0; i < nElement; i++)
            System.out.print(a[i] + " ");
        System.out.println("");
    }

    public void selectSort() {
      int out;
      int in;
      int min;

      for(out = 0; out < nElement -1; out++) {
          min = out;
          for(in = out+1; in < nElement; in++)
              if(a[in] < a[min])
                  min = in;
          swap(out, min);
      }
    }

    public void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

}