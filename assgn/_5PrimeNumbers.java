package assgn;
 class PrimeNumbersPrinter {

  public static void main(String[] args) {
    int num = 100;
    int i, j;
    for(i = 1; i <= num; i++){
      for( j = 2; j <= i; j++){
         if(i%j == 0){
           break;
         } 
         
      }
      if(i == j){

         System.out.println(j);
      }
    }
 
        
            } 
    }
        
 
    
        


