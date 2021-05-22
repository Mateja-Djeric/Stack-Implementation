package Stack_array;
public class Stack {

    public static void main(String[] args) {
        Stack_array stek = new Stack_array(5);
        stek.push(5);
        stek.push(8);
        stek.push(9);
        stek.push(15);
        stek.push(32);
        stek.push(212);
        System.out.println(stek.toString());
        stek.pop();
        stek.pop();
        stek.pop();
        stek.pop();
        System.out.println(stek.toString());
    }
    
}
