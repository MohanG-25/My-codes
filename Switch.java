public class Switch{
    public static void main (String args[]){
        System.out.println("enter the choice");
         char choice=(char)System.in.read(args[]);
         do{
            switch(choice){
                case '1':
                  System.out.println("IF statement");
                  break;
                case '2':
                  System.out.println("ELSE IF statement");
                  break;
                case '3':
                  System.out.println("ELSE statement");
                  break;
                default :
                  System.out.println("please enter correct choice");
                  break;
            }
         }while(choice!=3);
    }
}