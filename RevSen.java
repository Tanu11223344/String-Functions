package in.ineuron.main;
//Wap to reverse a sentence
public class RevSen {

	
		   public static void main(String args[]) {
		      String str = "Think Twice";
		      //String strArray[] = str.split(" ");
		      StringBuffer sb= new StringBuffer(str);
		      sb.reverse();
		      for(int i=0 ; i<str.length(); i++){
		      if(str.charAt(i)== ' '){
		         sb.insert(i, " ");
		      }
		   }
		   sb.append("");
		   System.out.println(sb);
		   }
}
 
