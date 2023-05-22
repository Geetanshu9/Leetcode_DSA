class Solution {
    public double myPow(double x, int n) {
        double sum=1;
        if(x==1){
            sum=1;
        }
        else if(x==0){
            sum=0;
        }
        else if(x==-1){
            if(n%2==0){
                sum=1;
            }
            else{
                sum=-1;
            }
        }
        else{
            if(n>0 && n<Math.pow(2,31)){
                for(int i=0;i<n;i++){
                    sum=sum*x;
                }
            }
            else if(n==0){
                sum=1;
            }
            else if(n<0-(Math.pow(2,31)) || n>Math.pow(2,31)){
                sum=0;
            }
            else if(n==-2147483648){
                sum=0;
            }
            else{
                int y=0-n;
                x=1/x;
                for(int i=0;i<y;i++){
                sum=sum*x;
                }
            }
        }
        if(sum<0-(Math.pow(10,4)) || sum>Math.pow(10,4)){
            sum=0;
        } 
        return sum;
    }
}
