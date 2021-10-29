import java.util.ArrayList;
import java.util.List;

class Solution {
    public List solution(int n, int[] arr1, int[] arr2) {
        
        List<String> list1 = replaceArr(arr1, n);
        List<String> list2 = replaceArr(arr2, n);
        ArrayList<String> result = new ArrayList(n);
        
        for(int i = 0; i < n; i++) {
            String data = "";
            for(int j = 0; j < list1.get(i).length(); j++) {
                String ch1 = Character.toString(list1.get(i).charAt(j));
                String ch2 = Character.toString(list2.get(i).charAt(j));
                if(ch1.equals("#") || ch2.equals("#")) {
                    data += "#";
                } else {
                    data += " ";
                }
            }
            result.add(data);
        }  
        return result;
    }
    
    public ArrayList<String> replaceArr(int[] arr, int n) {
        ArrayList<String> list = new ArrayList(arr.length);
        
        for(int i = 0; i < arr.length; i++) { 
            int ar = arr[i];
            String value = "";
            while(true) {
                if(ar == 1) {
                    value = "1"+value;
                    break;  
                } 
                if(ar%2 == 0) {
                    value = "0"+value;
                }else {
                    value = "1"+value;
                }
                ar /= 2;
            }
            value = value.replaceAll("0", " ");
            value = value.replaceAll("1", "#");
            if(value.length() < n) {
                value =  " ".repeat(n - value.length())+value;
            }
            list.add(value);
            System.out.println(list.get(i));
        }
        return list;
    }
}

밑은 그나마 개선해본 것,,,=================================================================
    
import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        
        for(int i = 0; i < n; i++) {
            String data1 = Integer.toBinaryString(arr1[i]).replace("0", " ").replace("1", "#");
            data1 = (data1.length() < n)? " ".repeat(n-data1.length())+data1 : data1;
            String data2 = Integer.toBinaryString(arr2[i]).replace("0", " ").replace("1", "#");
            data2 = (data2.length() < n)? " ".repeat(n-data2.length())+data2 : data2;
            
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < n; j++) {
                if(Character.toString(data1.charAt(j)).equals("#") || Character.toString(data2.charAt(j)).equals("#")) {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }
            result[i] = sb.toString();
        }
        return result;
    }
}
