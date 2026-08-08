class Solution {
    public boolean isIsomorphic(String s, String t) {
        int slen=s.length();
        int tlen=t.length();

        //take one string(s). then traverse it, take its char of index i. convert it to ascii. then go to the char array's index=ascii. If that index's value is null(\0) then: store the character of other string's index i (t.charAt(i)). else if that index is already filled with other char which NOT t.charAt(i) then it's one-to-many mapping so, return false.
        //do same taking string(t) to traverse on it. its needed to find many-to-one maps as well which arnt detected by first loop.

        char[] arr =  new char[128];
        for(int i=0; i<slen; i++){
            int ascii=(int)s.charAt(i);
            if(arr[ascii]=='\0') arr[ascii]=t.charAt(i);
            else if(arr[ascii]!=t.charAt(i)) return false;
        }

        //reset arr 
        for(int i=0; i<128; i++) arr[i]='\0';

        for(int i=0; i<tlen; i++){
            int ascii=(int)t.charAt(i);
            if(arr[ascii]=='\0') arr[ascii]=s.charAt(i);
            else if(arr[ascii]!=s.charAt(i)) return false;
        }
        
        return true;
    }
}