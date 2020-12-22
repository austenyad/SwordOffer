package S03;

public class Find {


    /**
     *
     * 在二位数组中，每一行都按照从左到右递增的顺序排列，
     * 每一列都按照从上到下的递增的顺序排序。请完成一个函数，输入这样一个二维数组和一个整数，
     * 判断数组中是否有该整数。
     * @param matrix 二维数组
     * @param rows 行的长度
     *
     *
     * @param columns 列的长度
     * @param number 要找到的整数
     * @return 要做的整数是否存在于二维数组当中
     */
    public boolean find(int[][] matrix, int rows, int columns, int number) {
        boolean found = false;
        if (matrix != null && rows > 0 && columns > 0) {
            int row = 0;
            int column = columns - 1;
            while (row < rows && column >= 0) {
                int find = matrix[row][column];
                if (find == number) {
                    found = true;
                    break;
                } else if (find > number) {
                    column--;
                } else {
                    row++;
                }
            }
        }
        return found;
    }

}
