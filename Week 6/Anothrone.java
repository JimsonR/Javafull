
public class Anothrone {

    public static void main(String[] args) {
        int n = 3;
        int time = 2;
        int per = 0;
        for(int i = 1;i <= time%(n-1);i++){
            System.out.println(i);
            per++;
        }
        if(time/(n-1)%2==0) {
            System.out.println(1+per);
        }else{
            System.out.println(n-per);
        }
    }
}