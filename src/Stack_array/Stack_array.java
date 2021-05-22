package Stack_array;
public class Stack_array {
   private int stack_size;
   private int stack[];
   private int last;

   public Stack_array(int stack_size) {
       this.stack_size = stack_size;
       this.stack = new int[stack_size];
       this.last = 0;
   }
   
   public void push(int element){
       //stavlja poslednji element
       if(last<stack_size){
            this.stack[last] = element;
            last++;
       }
       else{
           System.out.println("Izvini prike nemre to tako");
       }
   }
   
   public int pop(){
       int n;
       if(last>0){
            n = this.stack[last-1];
            this.stack[last-1] = 0;
            last--;
            return n;
       }
       else{
           return 0;
       }
   }

    @Override
    public String toString() {
        StringBuilder ispisi = new StringBuilder();
        for(int i=stack_size-1;i>=0;i--){
            ispisi.append(stack[i]);
            ispisi.append(", ");
        }
        return ispisi.toString();
    }

}
