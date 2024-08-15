public class Cyberpunk1994 {
   public static int[] matrix(int n, int m, int[][] matrix) {
      int num = 0;
      int max = n * m;
      int rowMin = 0;
      int colMin = 0;
      int rowMax = n - 1;
      int colMax = m - 1;
      int[] out = new int[max];

      while (num < max) {
         for (int i = rowMin; num < max && i <= rowMax; i++) {
            out[num++] = matrix[rowMin][i];
         }
         rowMin++;
         for (int i = rowMin; num < max && i <= colMax; i++) {
            out[num++] = matrix[i][rowMax];
         }
         rowMax--;
         for (int i = rowMax; num < max && i >= colMin; i--) {
            out[num++] = matrix[colMax][i];
         }
         colMax--;
         for (int i = colMax; num < max && i >= rowMin; i--) {
            out[num++] = matrix[i][colMin];
         }
         colMin++;
      }
      return out;
   }
}
