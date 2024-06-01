class Solution {
    public static String oddEven(String s) {
        int x=0,y=0;
        int[] hash = new int[26];
        for(int i=0;i<s.length();i++){ //calculate frequency of the letters in the array
            hash[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) { // detemining odd/even index and odd/even frequency and updating
            int frequency = hash[i];    //x and y accoridingly
                if (frequency > 0) {
                if ((i+1) % 2 == 0 && frequency % 2 == 0) {
                    x++;
                }
                else if ((i+1) % 2 != 0 && frequency % 2 != 0) {
                    y++;
                }
            }
        }
        if((x+y)%2 == 0){   // return statements
            return "EVEN";  
        } else {
            return "ODD";
        }
    }
}