//www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/maximum-product-subarray3604

public class MaximumProductSubarray {
    
    int maxProduct(int[] arr){
        int n = arr.length;

        int minProd = arr[0];
        int maxProd = arr[0];
        int res = arr[0];

        for(int i = 1; i < n; i++){
            minProd = Math.min(arr[i], minProd * arr[i]);
            maxProd = Math.min(arr[i], minProd * arr[i]);

            if(arr[i] < 0){
                int temp = minProd;
                minProd = maxProd;
                maxProd = temp;
            }
            res = Math.max(res, maxProd);

        }

        return res;

    }
}
