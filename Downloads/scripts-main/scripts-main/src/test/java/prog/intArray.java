package prog;

public class intArray {

    public static void main(String[] args) {

        int[] n = {1, 5, 6, 4, 3, 5, 6, 7, 9, 8, 1, 3, 8, 5};

        difference(n);


    }

    public static void difference(int[] a) {

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        boolean[] visited;
        int difference = 0;
        for (int i = 0; i < a.length; i++) {

            if (a[i] > firstMax) {
                secondMax = firstMax;
                firstMax = a[i];
            } else if (a[i] > secondMax) {
                secondMax = a[i];
            }

        }

        for (int i = 0; i < a.length; i++) {

            if (a[i] < firstMin) {
                secondMin = firstMin;
                firstMin = a[i];
            } else if (a[i] < secondMin) {
                secondMin = a[i];
            }
        }


        difference = secondMax - secondMin;
        System.out.println(difference);

    }


}
