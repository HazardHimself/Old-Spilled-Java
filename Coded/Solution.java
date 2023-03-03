public class Solution {
    public static int[] solution(int[] l, int t) {
        int [] out =  new int[2];
        int keyTest = 0;
        for (int i = 0; i <= l.length-1; i++) {
            if (keyTest == t){
                break;
            } else if (l[i] == t) {
                out[0] = i;
                out[1] = i;
                break;
            } else {
                keyTest = l[i];
            }
            for (int j = i-1; j >= 0; j--) {
                keyTest = keyTest + l[j];
                if (keyTest == t){
                    out[0] = j;
                    out[1] = i;
                    if (i<j){
                        out[0] = i;
                        out[1] = j;
                    }
                    break;
                } else {
                    out[0] = -1;
                    out[1] = -1;
                }
            }
        }
        return out;
    }
}
