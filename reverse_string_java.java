package java_practice_v1;
import java.util.*;
public class reverse_string_java {

public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter here : ");
String user_word = input.nextLine();
StringBuffer word_user = new StringBuffer(user_word);
System.out.println(word_user.reverse());


}   

}

