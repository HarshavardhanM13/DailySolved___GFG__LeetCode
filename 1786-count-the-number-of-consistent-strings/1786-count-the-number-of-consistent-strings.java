class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        for(char ch: allowed.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);
            }
        }
        int count = 0;
        for(String str : words){
            boolean flag = true;
            for(char ch: str.toCharArray()){
                if(!set.contains(ch)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                count+=1;
            }
        }
        return count;
    }

}