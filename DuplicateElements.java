package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElements {

    public static void main(String[] args) {
        
        int nums[]={1,2,3,4,4,3,2,1};
        boolean isPresent=false;

        List<Integer> list=new ArrayList<>();
        Set<Integer> set=new HashSet<>();

        for (int n : nums) {
            if(set.contains(n))
            {
                isPresent=true;
                list.add(n);
            }
            else{
                set.add(n);
            }
        }
        if(isPresent){
            System.out.println(list);
        }
        else
        {
            System.out.println("-1");
        }
        Collections.reverse(list);

    }
    
}
