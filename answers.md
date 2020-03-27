Activity 3

1. Flip a coin method

public static String flip(){
    Random rand = new Random;
    int flipped = rand.nextInt(3)+1;

    if(flipped == 1){
        return "Heads"
        flipped = rand.nextInt(2)-1;
    }else if(flipped == 2 ){
        return "Tails"
    }else{
        return " ";
    }
}

2.Permutations method

public static boolean arePermutations(int[] a, int[] b){
    for(int idx = 0; idx < a.length; idx++){
        boolean test1 = false;
        for(idxnt k = 0; k < b.length; k++){
            idxf(a[idx] == b[k]){
                test1 = true;
            }
        }
        if(test1){
            return true;
        }

    }
    return false;
}

3. 1,2,2,2