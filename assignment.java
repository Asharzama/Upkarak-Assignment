//Ques 1

    static double findX(double a, double b){
        if(b == 0){
            return 0;
        }

        double num = Math.sqrt((3 * a) + 1);
        return num / b;
    }
    
// Ques 2

    static int largestElement(int[] arr){
        int largest = Integer.MIN_VALUE;

        for (int j : arr) {
            largest = Math.max(largest, j);
        }

        return largest;
    }
