
//  Elena Voinu
public class PaintJob {
    // write your code here
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        int bucketsToBuy = 0;
        double area = 0;

        if( width <=0 || height <=0 || areaPerBucket <= 0 || extraBuckets < 0)
            return -1;

        else {

            area = height * width;

            bucketsToBuy = (int) Math.ceil (area /areaPerBucket);

        }
        return bucketsToBuy - extraBuckets;

    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        int totalBuckets;
        if( width <= 0 || height <=0 || areaPerBucket <= 0)
            return -1;
        else {
            double area =  (height * width);
            totalBuckets = (int) Math.ceil (area /areaPerBucket);
        }
        return totalBuckets;
    }
    public static int getBucketCount(double area, double areaPerBucket){
        int totalBuckets = 0;
        if(area <=0 || areaPerBucket<=0)
            return -1;
        else{

            totalBuckets = (int) Math.ceil (area /areaPerBucket);
        }
        return totalBuckets;
    }

   public static void main(String[] args) {
       System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
       System.out.println(getBucketCount(3.4, 2.1, 1.5));
       System.out.println(getBucketCount(3.26, 0.75));
  }

}

