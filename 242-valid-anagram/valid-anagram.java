class Solution {
    public boolean isAnagram(String s, String t) {
        char sarr[] = s.toCharArray();
        char tarr[] = t.toCharArray();
        Arrays.sort(sarr);
        Arrays.sort(tarr);
        s=new String(sarr);
        t=new String(tarr);

        return s.equals(t);
    }
}