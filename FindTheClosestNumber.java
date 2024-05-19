class Solution {
    public:
    int findClosest( int n, int k,int arr[]) 
    { 
        int s = 0;
        int e = n-1;
        int ans = arr[0];
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]>k){
                e=mid-1;
                if(abs(k-arr[mid])<abs(k-ans) or (abs(k-arr[mid])==abs(k-ans) and arr[mid]>ans))ans=arr[mid];
            }
            else{
                if(abs(k-arr[mid])<abs(k-ans) or (abs(k-arr[mid])==abs(k-ans) and arr[mid]>ans))ans=arr[mid];
                s=mid+1;
            }
        }
        return ans;
    }
};