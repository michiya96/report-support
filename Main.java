
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		//キーボード入力
		
		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		//name1に変更する文字を代入
    	System.out.println("変更する文字を入力");
	    String name1 = scanner1.next();
	  //name2に変更したい文字を代入
	    System.out.println("変更結果の文字を入力");
	    String name2 = scanner2.next();
	 
	   //ファイル作成
	    File newFile = new File("C://Users//User//Desktop//2022//java//test1.txt");
	    try{
	      if(newFile.createNewFile()) {
	   
	        System.out.println("新しいファイルの作成に成功");
	        System.out.println("");
	      } else {
	        System.out.println("新しいファイルの作成に失敗しました");
	        System.out.println("");
	      }
	    } catch(IOException e) {
	      e.printStackTrace();
	    }
	    
	    
	    //ファイル読み込み・書き込み
        try {
            File file = new File("C://Users//User//Desktop//2022//java//test.txt");
            
           FileWriter file1 = new FileWriter("C://Users//User//Desktop//2022//java//test1.txt");
           PrintWriter pw = new PrintWriter(new BufferedWriter(file1));
            if (!file.exists()) {
                System.out.println("ファイルが存在しません");
               
              return;
            }
 
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data;
           
        
            
            System.out.println("変更後");
            
            
            while ((data = bufferedReader.readLine()) != null) {
               
            	//キーボード入力した文字に変換
                String result = data.replace(name1,name2);
            	//String result = data.replace(" ","");
                pw.println(result);

                  System.out.println(result); 

            }
            //読み込み・書き込みを行ったファイルを閉じる
            pw.close();
            bufferedReader.close();
           
         
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
}






















