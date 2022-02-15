package CopyArray;

public class CopyArray {
    public static void main(String[] args) {
        char ch[]={'a','b','c','d','e','f'};
        char ch1[]=new char[2];
        System.arraycopy(ch,3,ch1,0,2);
        System.out.println(new String(ch1));
    }
}
