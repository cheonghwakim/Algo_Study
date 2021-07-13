// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int[] A) {

        Set<Integer> set = new HashSet<>();
        // write your code in Java SE 8
        for(int i = 0; i < A.length; i++){
            set.add(A[i]);
            if(set.size() == X)
                return i;
        }
        
        return -1;
    }
}

// https://app.codility.com/demo/results/trainingYMG2SB-66Z/ ���� ���� �߸�
// https://app.codility.com/demo/results/trainingGVJSEM-DQ4/ ���ͳ� ����
// https://app.codility.com/demo/results/trainingHRTKHY-FS4/ ���� ���ظ� �߸��� ���: 1~X������ ������ �򸮴� ��ġ��! ������ �������� �ð��� �ƴ϶�..