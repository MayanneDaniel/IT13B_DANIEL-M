
package midterm;


public class daniel_abanales_singlearray {
   public static void main (String [] args){
       char[]daniel_abanales  = {'A', 'B', 'C', 'D', 'E', 'F','G'};
       
       for (int i = 0; i <daniel_abanales.length; i++){
           System.out.print(daniel_abanales[i]);
           
           if (i < daniel_abanales.length - 1){
                System.out.print("  ");
           }
       }
   }
   }