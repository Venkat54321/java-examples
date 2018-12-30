package problems;


public class LeaderClimbing {

    public static void main(String[] args) {

        int[] scoreArray = {100, 90, 90, 80, 75, 60};
        int number[] = {50,65,77,90,102};
        int[] ranks = calculateRanks(scoreArray);
        int[] newRanks = new int[number.length];
        for(int i = 0 ;i< number.length;i++) {
            int rank = getRank(scoreArray,ranks,number[i]);
            newRanks[i] = rank;
        }

        for(int i : newRanks){
            System.out.println(i);
        }
    }

    public static int[] calculateRanks(int[] scores){
        int[] ranks = new int[scores.length];
        int rank = 1;
        for(int i = 0;i<scores.length;i++){

            if(i > 0 && scores[i] != scores[i -1 ]){
                rank++;
            }
            ranks[i] = rank;
        }
        return ranks;

    }


    public static int getRank(int[] scoreArray,int[] ranks,int number){

        int lower = 0;
        int upper = scoreArray.length - 1;
        int aliesRank = 1;
        while(lower <= upper){
            int middle = (lower + upper) /2;
            if(number == scoreArray[middle]){
                aliesRank = ranks[middle];
                break;
            }else if(number < scoreArray[middle]){
                aliesRank = ranks[middle] + 1;
                lower = middle + 1;
            }else {
                upper = middle -1;
            }

        }
        return aliesRank;
    }
}
