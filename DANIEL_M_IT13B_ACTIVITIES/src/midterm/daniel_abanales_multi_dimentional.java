
package midterm;


public class daniel_abanales_multi_dimentional {
   public static void main(String[]args){
         int[][]DANIEL_ABANALES = {
             {1, 2, 3, 4},
             {5, 6, 7, 8},
             {9, 10, 11, 12}
                 
          
         };
       
         
         for (int i = 0; i < DANIEL_ABANALES.length; i++){
             System.out.print("The Elements in Row " + (i+1) + " : ");
             
         for(int j = 0; j < DANIEL_ABANALES[i].length; j++){
             System.out.print(DANIEL_ABANALES[i][j]+ "  ");
         }
         
         System.out.println();
         
         }
     }  
}

