//matrix multiplication
//By bsimps3... so don't try to sell it and make money off of it.


public class MatrixMultRunner{
     
     public static void main(String[] args){
          int[][] matrix1 = new int[3][3];
          int[][] matrix2 = new int[3][3];
          int[][] product;
          
          //setup matrix1 and matrix2 with loops
          //the elements of matrix1 should be the sum of the values of row and col (the top left element is 0,0)
          
          for(int p = 0; p < matrix1.length; p++){
            for(int k = 0; k < matrix1.length; k++){
              matrix1[p][k] = p + k;
            }
          }
          
          System.out.println("Test matrix1: "+matrix1[2][1]);
          
          //the elements of matrix2 should be the product of the values of row and col
          
          for(int p = 0; p < matrix1.length; p++){
            for(int k = 0; k < matrix1.length; k++){
              matrix1[p][k] = p * k;
            }
          }
          
          System.out.println("Test matrix2: "+matrix1[1][2]);
          
          product = MatrixMult.calculate(matrix1, matrix2);  //you must write a class MatrixMult with a method calculate() which returns the product of the matrices
          
          //print out the product matrix to check it by hand
          
            for(int n = 0; n < product.length; n++){
        System.out.println("row "+n);
    for(int k = 0; k < product[n].length; k++){
  
     System.out.printf("%3d",product[n][k]);
    }
    System.out.println("\n");
  }
  
          
          
     }
}