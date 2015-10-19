import java.io.BufferedReader;
import java.io.InputStreamReader;
public class kisokadai1
{
        public static void main(String args[])
        {
            int x=0;
            int y=0;
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                try{
                	System.out.println("xに0以上、100以下の数字を入力してください、それ以外は0になります");
                    System.out.print("x= ");
                        String buf = br.readLine();
                          x = Integer.parseInt(buf);
                        System.out.print("y= ");
                        String buf1 = br.readLine();
                        y = Integer.parseInt(buf1);
                }catch(Exception e){
                        x = 0;
                }
                if(0>x | 0>y | 100<x |100<y){
               	 x=0; y=0;}
                System.out.println("xとyの掛け算は" + (x*y) + "です。");
             for(int j=y;j>=1;j--){
             for(int k=1;k<=x;k++){
            	 String a = Integer.toString(j*k);
            	 if (a.length() < 2) {
            		 System.out.print(a +"    ");
            	 }else if(a.length() < 3) {
            		 System.out.print(a +"   ");
            	 }else if(a.length() < 4) {
            		 System.out.print(a +"  ");
            	 }else  {
            		 System.out.print(a +" ");
            	 }
             }
             System.out.println();
             }
        	}
        }