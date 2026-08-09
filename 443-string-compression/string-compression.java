class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        
        int count=1;
        char pointer=chars[0];

        //traverse through char array and whenevr new char found append the prev char and its count to the string builder. then reset the pointer to new char.
        for(int i=1; i<chars.length; i++){
            if(pointer==chars[i]){
                count++;
            }
            else{
                sb.append(pointer);
                if(count>1) sb.append(count);
                pointer=chars[i];
                count=1;
            }
        }
        //for the last char whose count aint appended but loop ended
        sb.append(pointer);
        if(count>1) sb.append(count);

        int len=sb.length();
        for(int i=0; i<len; i++){
            chars[i]=sb.charAt(i);
        }
        return len;

    }
}