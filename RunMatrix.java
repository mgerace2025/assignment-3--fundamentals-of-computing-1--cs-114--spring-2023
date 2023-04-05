import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the matrix input: ");

    int s = sc.nextInt();
    System.out.println(s);

    Matrix m = new Matrix(s);
    m.populateMatrix();
    m.printMatrix();
    m.flipMatrix();
    System.out.println("Flipped matrix");
    m.printMatrix();



  }
}
