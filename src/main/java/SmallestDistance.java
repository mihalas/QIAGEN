public class SmallestDistance {

    static int findDistance(int[] target){
        //Instantiate the variable fo the min distance
        int min = 9;

        //Instantiate the variable for the index
        int index = 0;

        //Compare the numbers in the array and remember the index in case the distance is the new minimum
        for (int i = 0; i < target.length-1; i++){
            if (target[i] > target[i+1]){
                if ((target[i] - target[i+1]) < min) {
                    min = target[i] - target[i + 1];
                    index = i;
                }
            }
            else if ((target[i+1] - target[i]) < min) {
                min = target[i + 1] - target[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args){
        int[] sequence = {4, 8, 6, 1, 2, 9, 4};

        System.out.println("The index of the minimum distance is: " + findDistance(sequence));
    }
}
