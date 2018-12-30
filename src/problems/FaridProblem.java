package problems;

public class FaridProblem {

    public static void main(String[] args) {


        String[] correctAnsArray = {"a", "a", "b", "c"};
        String[] ansGivenArray = {"a", "a", "b", "c"};

        // +4 for correct ans
        //-1 for wrong ans
        //0 for blank ans

        int score = getStudentScore(correctAnsArray, ansGivenArray);
        System.out.println("Student score is "+ score);
    }

    static int getStudentScore(String[] correctAnsArray,String[] ansGivenArray){

        int score = 0;

        for(int i=0;i<ansGivenArray.length && i< correctAnsArray.length;i++) {
            if (ansGivenArray[i] == "") {
                continue;
            }
            if (ansGivenArray[i] != correctAnsArray[i]) {
                score = score - 1;
            }
            if (ansGivenArray[i] == correctAnsArray[i]) {
                score = score + 4;
            }
        }

        return score;
    }
}


