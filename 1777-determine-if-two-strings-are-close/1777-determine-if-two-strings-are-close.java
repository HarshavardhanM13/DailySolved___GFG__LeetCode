class Solution {
    public boolean closeStrings(String word1, String word2) {
        HashMap<Character,Integer> hm1 = new HashMap<>();
        HashMap<Character,Integer> hm2 = new HashMap<>();

        for(int ind = 0;ind<word1.length();ind++){
            char ch = word1.charAt(ind);
            if(!hm1.containsKey(ch)){
                hm1.put(ch,1);
            }
            else{
                hm1.put(ch,hm1.get(ch)+1);
            }
        }
        for(int ind = 0;ind<word2.length();ind++){
            char ch = word2.charAt(ind);
            if(!hm2.containsKey(ch)){
                hm2.put(ch,1);
            }
            else{
                hm2.put(ch,hm2.get(ch)+1);
            }
        }
       if (!hm1.keySet().equals(hm2.keySet())) {
            return false;
        }
        List<Integer> freq1 = new ArrayList<>(hm1.values());
        List<Integer> freq2 = new ArrayList<>(hm2.values());
        Collections.sort(freq1);
        Collections.sort(freq2);

        return freq1.equals(freq2);
    }
}