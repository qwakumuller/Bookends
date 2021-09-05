package com.company;
/*
BOOKEND CODE
-It uses a Substring
 */


public class bookends {

    public String books( String a) {
        String ans ="";
       String b=  a.toLowerCase();
          for (int z=0; z<b.length(); z++){
              String first = b.substring(z);
        String second = a.substring(0, z);
        if (first.contains(second)) {
            ans = second;
        }
    }
        System.out.println(ans);
        return "";
    }
}
