public class MatrixMult{
  
  public static int[][] calculate(int[][] m1, int[][] m2){
   
    int [][] answer = new int[m1.length][m2.length];
    
    for(int t = 0; t < m1.length; t++){//row focused on for m1
      
      for(int j = 0; j < m2.length; j++){ //row places for m1
        
        
        for(int k = 0; k < m2.length; k++){ //column places for m2
           answer[t][j] = (m1[t][j] * m2[j][t])+(m1[j][k] * m2[k][t]);
        }

      }
    }
    return answer;
  }
}