class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map= new HashMap<>();
        List<List<String>> result= new ArrayList<>();

        for(String word: strs){
            char [] arr= word.toCharArray();
            char [] freq= new char [26];
            for( char count: arr ){
                freq[count-'a']++;
            }
            String key= new String(freq);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<String>());
            }
            map.get(key).add(word);
        }
        result.addAll(map.values());
        return result;
    }
}
