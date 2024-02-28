import java.util.Scanner;

class PyramidPattern {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s="*";
        int h=scan.nextInt(); //height
        for(int i=1;i<=h;i++){
            for(int k=h-i;k>0;k--){
                System.out.print(" ");
            }
            for(int j=0;j<((i*2)-1);j++){
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
