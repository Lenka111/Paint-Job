
//  Elena Voinu
/*Bob is a wall painter and he needs help. Write a program that helps Bob calculate how many
buckets of paint he needs to buy before going to work. Bob might have extra buckets of paint
at home. He also knows the area he can cover with one bucket of paint.
*/
public class PaintJob {
    // write your code here
    /*Method that returns a value type of int that represents the number of buckets that Bob
    needs to buy before going to work*/
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        int totalBuckets = 0;
        double area = 0;
        
        //If any of the parameters are less than or equal to 0 return -1 to indicate an invalid value
        if( width <=0 || height <=0 || areaPerBucket <= 0 || extraBuckets < 0)
            return -1;

        else {
            // calculate area of the wall
            area = height * width;
            // total buckets that Bob has to buy before going to workk
            totalBuckets = (int) Math.ceil (area /areaPerBucket);

        }
        // if Bob has any extra buckets of paint at home extract them
        return totalBuckets - extraBuckets;

    }
    //overloaded method
    /*Bob does not like to enter 0 for the extraBuckets, so he needs another method
    that calculates the bucket count*/
    public static int getBucketCount(double width, double height, double areaPerBucket){
        int totalBuckets;
        
        //If any of the parameters are less than or equal to 0 return -1 to indicate an invalid value
        if( width <= 0 || height <=0 || areaPerBucket <= 0)
            return -1;
        
        else {
            double area =  (height * width);
            totalBuckets = (int) Math.ceil (area /areaPerBucket);
        }
        return totalBuckets;
    }
    /*In some cases Bob does not know the width and the height of the wall but he knows the
    area*/
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
  }// end main

}// end class

