import java.util.*; 
 
class Strong {
    void isStrong(String str){
        int U=0, L=0, S=0, D=0;
        boolean condition =true;
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                U++;
            }
            else if(Character.isLowerCase(str.charAt(i))){
                L++;
            }
            else if(Character.isDigit(str.charAt(i))){
                D++;
            }
            else if(Character.isWhitespace(str.charAt(i))){
                continue;
            }
            else{
                S++;
            }
        }
        while(condition){
            if(str.length()>7){
                if(U>1 && L>1 && D>1 && S>1){
                    System.out.println("Strong password");
                    condition = false;
                }
                else{
                    System.out.println("Weak Password");
                    condition = false;
                }
            }
            else{
                System.out.println("Password should be minimum of 8 letters");
                break;
            }
        }

    }
}

public class Password {
    public static void main(String[] args) {
        Scanner Password = new Scanner(System.in);
        Strong obj = new Strong();
        while(true){
            System.out.println("enter password with minimum of 2 upper and 2 lower and 2 special char and 2 digits: ");
            String x=Password.next();
            obj.isStrong(x);
        }
        
    }
}
