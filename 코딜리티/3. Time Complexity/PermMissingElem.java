// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8

        long sum = ((long)(A.length + 1) * (A.length + 2)) / 2;
        for(int i = 0; i < A.length; i++){
            sum -= A[i];
        }

        return (int) sum;
    }
}


// 1��: https://app.codility.com/demo/results/training98W32P-DFM/ ����ȯ ����
// 2��: https://app.codility.com/demo/results/trainingXWQ9VA-9K3/