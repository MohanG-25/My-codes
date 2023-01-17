class Palin{
    public static void main(String args[]){
        int n=111;
        String o=String.valueOf(n);
        int m=o.length()-1;
        boolean b=true;
        for(int i=0;i<o.length();i++){
            if(o.charAt(i)!=o.charAt(m)){
                 b=false;
            }
            m=m-1;
        }
        System.out.println(b);
    }
}