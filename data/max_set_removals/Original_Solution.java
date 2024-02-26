class Solution {
    public int maximumSetSize(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int dyn=0; //count of elements which contains in both arrays i.e. dynamic
        int n=nums1.length;
        int c=n/2; //cutoff elements
        int a=0; //count of nums1 elements to be added
        int b=0; //count of nums2 elements to be added
        int idx1=0;
        int idx2=0;
        HashSet<Integer> hs=new HashSet<>(); //Hashset to see which elements are visisted
        
        while(idx1<n||idx2<n){
            int val1=Integer.MAX_VALUE;
            int val2=Integer.MAX_VALUE;
            if(idx1<n) val1=nums1[idx1];
            if(idx2<n) val2=nums2[idx2];
            if(val1==val2){ //same element
                idx1++;
                idx2++;
                if(hs.contains(val1)) continue;
                hs.add(val1);
                dyn++;
            }else if(val1<val2){ //nums1 element is small
                idx1++;
                if(hs.contains(val1)||a==c) continue; //a==c means, we have already reached cutoff for a
                hs.add(val1);
                a++;
            }else{ //nums2 element is small
                idx2++;
                if(hs.contains(val2)||b==c) continue; //b==c means, we have already reached cutoff for b
                hs.add(val2);
                b++;
            }
        }
        
        if(a+b<n) // if total elements from a and b are less than n then take elemnts from dynamic
            if(a+b+dyn>n) return n;
            else return a+b+dyn;
        return a+b;
    }
}