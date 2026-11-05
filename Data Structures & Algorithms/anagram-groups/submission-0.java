class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map= new HashMap<>();
        List<List<String>> result= new ArrayList<>();

        for(String word: strs){
            char [] arr= word.toCharArray();
            Arrays.sort(arr);
            String key= new String(arr);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<String>());
            }
            map.get(key).add(word);
        }
        result.addAll(map.values());
        return result;
    }
}
