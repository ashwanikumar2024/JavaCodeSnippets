package StringBuilder;

public class Builder1 {
    public static void main(String[] args){
        String str = "Hello World";

        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder(4);
        StringBuilder sb2 = new StringBuilder("Hello LPU");
        StringBuilder sb3 = new StringBuilder(str);
        sb2.append(" HAHAHAHA");
        System.out.println(sb2);
        System.out.println(sb2.charAt(2));
        System.out.println(str);
        System.out.println(sb2.lastIndexOf("AHAH"));
        System.out.println(sb2.capacity());
    }
}
