public class coordinates {
    public static void main(String[] args) {

    }

    static int[] binarysearch(int[][] matrix, int row, int cstart, int cend, int target) {
        while (cstart < cend) {
            int mid = cstart + cend - cstart / 2;//finding mid column
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};//if the element of mid row in the mid col is target element then return the row and col
            }
            if (matrix[row][mid] < target) {
                cstart = mid + 1;//if it is less than the target then return then end col wlil be shifted to left
            } else {
                cend = mid - 1;
            }
        }
        return new int[]{-1, -1};

    }


    static int[] search(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        if (row == 1) {
            return binarysearch(matrix, 0, 0, col - 1, target);
        }
        int srow = 0;
        int erow = row - 1;
        while (srow < erow - 1) {
            int mid = srow + erow - srow / 2;
            if (matrix[mid][mid] == target) {
                return new int[]{mid, mid};
            }
            if (matrix[mid][mid] < target) {
                srow = mid;
            } else {
                erow = mid;
            }
        }

//check wheather the ele is int the col of row
        return new int[]{-1, -1};

    }
}

