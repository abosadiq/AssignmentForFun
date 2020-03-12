package Collections;

import java.util.*;


public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        list1.addAll(list2);
        return list1;
    }
    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        list1.addAll(list2);
        int sum = 0;
        for (int i : list1) {
            sum += i;
        }
        return sum;
    }
    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        while (myList.remove(toRemove));
        return myList;
    }

    public boolean happyList(ArrayList<String> original) {
        for(int i = 1; i < original.size(); i++){
            ArrayList<Character> lastChars = myHelperFunc(original.get(i-1));
            ArrayList<Character> currentChars = myHelperFunc(original.get(i));
            boolean isCompare = false;
            for(Character last : lastChars){
                for(Character current : currentChars){
                    if (last.equals(current)){
                        isCompare = true;
                    }
                }
            }
            if(!isCompare){
                return false;
            }
        }
        return true;
    }


      private ArrayList<Character> myHelperFunc(String str){
        ArrayList<Character> res =  new ArrayList<>();
        int i =0;
        do{
            res.add(str.charAt(i));
        }while (i< str.charAt(i));
        return res;
      }
}