package b_Recursion_Backtracking;
// First recursion code to understand the code structure..
public class a
{
    int count=0;
    void print(){
        if(count==3){
            return;
        }
        System.out.println(count);
        count++;
        print();
    }
    public static void main(String[] args) {
        a r= new a();
        r.print();
    }
}
