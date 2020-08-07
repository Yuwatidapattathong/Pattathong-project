public class StrString{ 

   public static void main(String args[]){ 

      String str = "Hello World!";
       for(int i = 0; i < str.length(); i++){ 

       	if(str.charAt(i) == ' ' || str.charAt(i) == ' ! '){
       		continue;


        	}
        	System.out.println(str.charAt(i));
        }
      }
  }
