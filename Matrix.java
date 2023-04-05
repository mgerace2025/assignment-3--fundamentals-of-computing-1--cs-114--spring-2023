public class Matrix {

  private int[][] matrix;
  private int size;

  public Matrix(int setSize) {

    matrix = new int[setSize][setSize];
    this.size = setSize;

    System.out.println("Hello from matrix");

  }

  public void printMatrix() {
    final String ANSI_RESET =  "\u001b[0m";
    final String ANSI_GREEN_BACKGROUND = "\u001b[42m";

    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++){
         System.out.print(matrix[i][j] + " ");
        }

        System.out.println(ANSI_GREEN_BACKGROUND + matrix[i] + ANSI_RESET);


    }
  }

  public void swap(int x1, int y1, int x2, int y2){
    int temp = matrix[x1][y1];
    matrix[x1][y1] = matrix[x2][y2];
    matrix[x1][y1] = temp;
  }

  public void populateMatrix(){
    int counter = 1;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++){
        matrix[i][j] = counter;
        counter += 1;
      }
    }
  }

  public void flipMatrix(){
    int colCounter = (size-1);
    int rowCounter = (size-1);
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++){
          //swap(i, j, rowCounter, colCounter);
          System.out.println(rowCounter + ", " + colCounter);
          colCounter -= 1;
        }
        colCounter = (size-1);
        rowCounter -= 1;
    }



  }
}
