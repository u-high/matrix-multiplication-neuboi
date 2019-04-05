public class MatrixMult{
  
  public static int[][] calculate(int[][] m1, int[][] m2){
    
    int [][] answer = new int[m1.length][m2.length];
    
    for(int v = 0; v < m1.length; v++){
      for(int g = 0; g < m1.length; g++){
        answer[v][g] = (m1[v][v]*m2[v][g])+(m1[v][(m1.length-1)]*m2[(m1.length-1)][g]);
      }
    }
   
    return answer;
  }
}