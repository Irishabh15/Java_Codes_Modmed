public class PaintJob {
    // write your code here
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets)
    {
        int bucketsReq;
        if(width<=0 || height<=0 || areaPerBucket<=0 || extraBuckets<0)
        {
            return -1;
        }
        else
        {
            double area = height*width;
            double noOfBuckets = Math.ceil(area/areaPerBucket);
            int value = (int)Math.round(noOfBuckets);
            bucketsReq = value - extraBuckets;
        }
        return bucketsReq;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket)
    {
        int ans;
        if(width<=0 || height<=0 || areaPerBucket<=0)
        {
            return -1;
        }
        else
        {
            double area = height*width;
            double noOfBuckets = Math.ceil(area/areaPerBucket);
            ans = (int)Math.round(noOfBuckets);
            return ans;
        }

    }

    public static int getBucketCount(double area, double areaPerBucket)
    {
        int ans;
        if(area<=0 || areaPerBucket<=0)
        {
            return -1;
        }
        else{

            double noOfBuckets = Math.ceil(area/areaPerBucket);
            ans = (int)Math.round(noOfBuckets);
            return ans;
        }

    }

}