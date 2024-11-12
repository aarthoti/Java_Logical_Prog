import java.util.*;   
  
class Unique 
{   
  
        public static void main (String[] args)   
    {   
        
        int arrayWithDuplicates[] = { 10, 3, 5, 3, 9, 22, 4, 3, 1, 5, 6 };  
              
       
        int len = arrayWithDuplicates.length;  
  
        
        HashSet<Integer> hashset = new HashSet<>();   
    
               for (int i = 0; i < len; i++)   
        {   
           
            if (!hashset.contains(arrayWithDuplicates[i]))   
            {   
                hashset.add(arrayWithDuplicates[i]);   
            }   
        }   
                System.out.print(hashset);   
    }   
}  