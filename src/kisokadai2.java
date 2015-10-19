import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class kisokadai2 {

  /*
   * メイン
   */
  public static void main(String[] args){
    int answer=(int)(Math.random()*100)+1;
    int number=0;
    int count;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("1から100までの数字当てゲームです。");
      for(count=0;number!=answer;count++){
    	  System.out.print("数字を入れてね＝");
    	  try
    	  {
        number=Integer.parseInt(br.readLine());
        if(number<=0){
        	System.out.println("1~100までお願い致します。");
        }
        if(number>100){
      System.out.println("1~100までお願い致します。");
      }
        if(number<answer)
          System.out.println("もっと上です。");
        else if(number>answer)
          System.out.println("もっと下です。");
    }
    catch(NumberFormatException e){
      System.out.println("数字以外はerrorです。");
    }
    catch(IOException e){
      System.out.println("error");
    }
  }
      System.out.println("当たり！！  "+count+"回です、お疲れ様でした");
 }
}

