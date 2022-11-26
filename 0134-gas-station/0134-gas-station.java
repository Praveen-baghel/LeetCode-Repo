class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0;
        int curr=0;
        int si=0;
        for(int i=0;i<cost.length;i++){
            total=total+(gas[i]-cost[i]);
            curr=curr+gas[i]-cost[i];
            if(curr<0){
                curr=0;
                si=i+1;
            }
        }
        if(total<0){
            return -1;
        }
        return si;
        
    }
}