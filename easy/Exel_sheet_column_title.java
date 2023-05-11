class Solution {
    public String convertToTitle(int columnNumber) {
        String strs="";
        String new_="";
        if(columnNumber>26){
            int x = columnNumber/26;
            int y = columnNumber%26;
            while(x>0){
                if(y==0){
                    y=y+26;
                    x=x-1;
                }
                strs=strs+(char)(y+'A' -1);
                if(x<27){
                strs=strs+(char)(x+'A' -1);
                }
                y=x%26;
                if(x==26){
                x=x/26-1;
                }
                else{
                    x=x/26;
                }
                // System.out.print(strs);
            }
        }
        else{
            strs=strs+(char)(columnNumber+'A' -1);
            // System.out.print(strs);
        }
        // String new="";
        for (int i = 0; i < strs.length(); i++) {
            new_ = strs.charAt(i) + new_;
        }
        return new_;
        // if(y==0){
        //     y==26;
        //     x==x-1;
        // }
        // StringBuffer sb = new StringBuffer();
        // String c;
        // if(x>0){
        //     x=x+64;
        //     sb.append(((char) (x + '0'))); 
        //     sb.append(((char) (x + '0')));
        // }
        // else{
        //     sb.append(((char) (x + '0')));
        // }
        // return sb;
        // char arr[26] ={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z';
        // for(int i=0;i<26;i++){
        //     arr[i]=sc.nextInt();
        //     arr[i] = char(i+65);
        //     System.out.println(arr[i]);
        // }
        // System.out.print();
    // }
}
}
