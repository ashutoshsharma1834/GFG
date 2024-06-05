   int sum1 = 0,sum2=0;
        for(int i=0;i<n;i++) sum1 += a[i];
        for(int i=0;i<m;i++) sum2 += b[i];
        sort(a,a+n);
        sort(b,b+m);
        for(int i=0;i<n;i++){
             int val = sum1 - a[i];
             int inc = sum2 + a[i];
             int diff = inc-val;
             if(diff%2==0 && binary_search(b,b+m,diff/2)) return 1;
        }
        return -1;