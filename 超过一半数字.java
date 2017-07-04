public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        int len = array.length;
        int num = array[0];
        int count = 1;
        for(int i = 1;i<len;i++){
            if(num == array[i])
                count++;
            else
                count--;
            if(count == 0){
                count = 1;
                num = array[i];
            }
        }
        count = 0;
        for(int i = 0;i<len ;i++){
            if(array[i] == num)
                count++;
        }
        if(count * 2 > len)
            return num;
        else
            return 0;
    }
}