public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
       char[] letters = {'a','b','c','e','f'} ;
       char target = 'd';
       System.out.println(nextGreatestLetter(letters,target));
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int s = 0;
        int e = letters.length-1;
        
        while(s<=e){
            
            int m = s + (e- s)/2;
            
            if(letters[m] > target){
                e = m-1;
            }else{
                s = m+1;
            }
            
        }  
        return letters[s % letters.length];
    }
}
