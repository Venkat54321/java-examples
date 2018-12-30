package custom.collections;

import java.util.Arrays;

public class CustomPriorityQueue {

   private int[] priorityQueueArray;
   private int size;
   private int number;

    @Override
    public String toString() {
        return "CustomPriorityQueue{" +
                "priorityQueueArray=" + Arrays.toString(priorityQueueArray) +
                ", size=" + size +
                ", number=" + number +
                '}';
    }

    public CustomPriorityQueue(int size){
       priorityQueueArray = new int[size];
       this.size = size;
       number = 0;
   }

   public void insert(int value) throws Exception {

        int i;
       if(ifFull()){
           throw new Exception("Queue is full");
       }
       if(number == 0){
           priorityQueueArray[number++] = value;
       }else{
           for(i= number -1 ;i>=0;i--){
               if(value < priorityQueueArray[i]){
                   priorityQueueArray[i+1] = priorityQueueArray[i];
               }else
                   break;
           }
           priorityQueueArray[++i] = value;
           number++;
       }
   }

   public boolean ifFull(){
        return (size == number);
   }

    public static void main(String[] args) throws Exception{
        CustomPriorityQueue queue = new CustomPriorityQueue(10);
        queue.insert(12);
        queue.insert(2);
        queue.insert(10);
        queue.insert(1);
        queue.insert(25);
        queue.insert(13);

        System.out.println(queue);
    }
}
