import java.util.Scanner;

class CheckBit{
    public int isSet(int num,int i){
        if((num&(1<<i))==0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        CheckBit checkBit=new CheckBit();
        int num= scanner.nextInt();
        int i=scanner.nextInt();
        System.out.println(checkBit.isSet(num,i));
    }
}
