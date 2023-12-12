import java.util.*;

public class stack {
public static void main(String args[]){
    Stack<Integer> s = new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);

    System.out.println("initial size is -> " +s.size() );
    System.out.println(s.isEmpty()); //-> returns boolean value
    System.out.println("index val of obj is - " + s.search(3)); // -> index value
    while(!s.isEmpty()){
        System.out.println(s.peek());
        System.out.println("size before pop : " + s.size());
        s.pop();
        System.out.println("size after pop is : " + s.size());
    }
}


}
