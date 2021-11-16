public class InputArraySorted {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9; 
        twoSum(arr, target);
    }

        static int[] twoSum(int[] numbers, int target) {
            int i = 0;
            int j = 0;
            for(i = 0; i < numbers.length-1;i++){
                for(j = i+1; j<= numbers.length-1;j++){
                    if(numbers[i] + numbers[j] == target){
                        i = i+1;
                        j = j+1;
                        break;
                    }                    
                }
                break;
            }
            return new int[]{i,j};
        }    
    }

