//*****REPEATED DNA SEQUENCE*****
//Time complexity:o(n);
//Space complexity:o(n);
//Leetcode runnable: Y;
//Any doubts:N;

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> allstrs=new HashSet<>();
        HashSet<String> result=new HashSet<>();
        
        for(int i=0;i<=s.length()-10;i++)
        {
            String sub=s.substring(i,i+10);
                if(allstrs.contains(sub))
                {
                    result.add(sub);
                }
            allstrs.add(sub);
        }

        return new ArrayList<>(result);
    }
}
