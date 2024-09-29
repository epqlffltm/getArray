class Mod {
    private int num;
    private int[] numArr;

    public int getSum(int num, int[] ary) {
        this.num = num;
        numArr = ary;

        int sum = 0;

        for (int i = 0; i < num; i++) {
            sum += ary[i];
        }
        return sum;
    }

    public int getMax(int num, int[] ary) {
        this.num = num;
        numArr = ary;

        int max = numArr[0];

        for (int i = 1; i < num; i++) {
            if (numArr[i] > max) {
                max = numArr[i];
            }
        }
        return max;
    }

    public int getCount(int num, int[] ary, int target) {
        this.num = num;
        numArr = ary;
        int count = 0;

        for (int i = 0; i < num; i++) {
            if (numArr[i] > target) {
                count++;
            }
        }
        return count;
    }

    public int[] swapArray(int num, int[] ary) {
        this.num = num;
        numArr = ary;

        for (int i = 0; i < num / 2; i++) {
            int temp = numArr[i];
            numArr[i] = numArr[num - i - 1];
            numArr[num - i - 1] = temp;
        }
        return numArr;
    }
}