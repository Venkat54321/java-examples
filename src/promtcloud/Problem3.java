package promtcloud;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.*;

public class Problem3 {

    public static void main(String[] args) {

        List<String> inputList = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("problem3Input.txt")));
            PrintWriter pw = new PrintWriter(new File("problem3Output.txt"));

            String st;
            //reading input from file and putting in list
            while ((st = br.readLine()) != null)
                inputList.add(st);

            //parse the first input and make it array.
            Integer[] newArray = parseInput(inputList.get(0));
            //maintain two map for each
            //mapWithBinaryCount- each value in array value with binary count.
            //mapWithDuplicateCount - each value in array with duplicate count.
            Map<Integer, Integer> mapWithBinaryCount = new HashMap<>();
            Map<Integer, Integer> mapWithDuplicateCount = new HashMap<>();

            //here calculating mapWithBinaryCount & mapWithDuplicateCount
            for (int i = 0; i < newArray.length; i++) {
                if (newArray[i] != 9999) {
                    getTheDetailsOfEachValue(mapWithBinaryCount, mapWithDuplicateCount, newArray[i]);
                }
            }

            //pass the next each input in the file and get the related string and write to print writer object.
            for (int i = 1; i < inputList.size(); i++) {
                String output = getEachInputOutputString(inputList.get(i), mapWithBinaryCount, mapWithDuplicateCount);
                pw.write(output);
                pw.write("\n");
            }

            pw.close();
        }catch (Exception e){
            System.out.println("Exception occurred for the input "+ inputList);
        }

    }

    public static String getEachInputOutputString(String eachInput, Map<Integer,Integer> mapWithBinayCount, Map<Integer,Integer> mapWithDuplicateCount){

        String message = "";

        try {
            if (eachInput.isEmpty()) {
                message = "No input provided!";
                return message;
            }
            Integer inputValue = Integer.parseInt(eachInput);
            Integer duplicateCount = mapWithDuplicateCount.get(inputValue);
            if(duplicateCount == null){
                message = "Exception : "+eachInput+" is not in the list!";
                return message;
            }
             else if(duplicateCount > 1){
                message = "Exception : "+ eachInput + " is a duplicate entry!";
                return message;
            }else{
                Integer binayCount = mapWithBinayCount.get(inputValue);
                Integer inputPlusBinayCount = binayCount + inputValue;
                Integer checkInputValue = mapWithBinayCount.get(inputPlusBinayCount);
                if(checkInputValue != null){
                    message = inputValue+ " is SUPPORTED BY THE NUMBER "+ inputPlusBinayCount;
                    return message;
                }else{
                    message = inputValue +" is NOT SUPPORTED";
                    return message;
                }
            }

        }catch (NumberFormatException e){
            message = "Exception : "+ eachInput +"is a string!";
            return message;
        }

    }

    /**
     *
     * @param mapWithBinayCount
     * @param mapWithDuplicateCount
     * @param value
     */
    public static void getTheDetailsOfEachValue(Map<Integer,Integer> mapWithBinayCount,Map<Integer,Integer> mapWithDuplicateCount,Integer value){

        mapWithBinayCount.put(value,getTheBinaryCount(value));
        Integer key =  mapWithDuplicateCount.get(value);
        if(key != null){
            key = key+ 1;
            mapWithDuplicateCount.put(value,key);
        }else{
            mapWithDuplicateCount.put(value,1);
        }
    }

    /**
     *
     * @param value
     * @return
     */
    public static Integer getTheBinaryCount(Integer value){

        Integer count = 0;

        while(value > 0){
            value = value /2;
            count++;
        }

        return count;
    }

    /**
     *
     * @param s
     * @return
     */
    public static Integer[] parseInput(String s){
        String[] arrayStr = s.split(",");
        String[] newArray = new String[arrayStr.length];

        newArray[0] = arrayStr[0].replace("[","").trim();
        newArray[arrayStr.length -1] = arrayStr[arrayStr.length -1].replace("]","").trim();

        for(int i = 1;i < arrayStr.length -1 ;i++){
            newArray[i] = arrayStr[i].trim();
        }

        Integer[] intArray = new Integer[newArray.length];
        for(int i = 0;i<newArray.length;i++){
            intArray[i] = parseEachInput(newArray[i]);
        }

        return intArray;

    }

    /**
     *
     * @param inputValue
     * @return
     */
    public static Integer parseEachInput(String inputValue){

        Integer i = 9999;

        try{
            i = Integer.parseInt(inputValue);
        }catch (NumberFormatException e){
            return i;
        }
        return i;
    }


}
