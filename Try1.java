class Try1{
    static void divison(int a,int b,int c){
        try{
            int x=a/(b-c);
            System.out.println(x);
        }
        catch(ArithmeticException e){
        System.out.println(e);
        }
        int y=a+(b+c);
        System.out.println(y);
    }
    public static void main(String args[]){
        divison(1,2,2);
    }
}