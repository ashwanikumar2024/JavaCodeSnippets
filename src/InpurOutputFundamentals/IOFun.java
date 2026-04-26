package InpurOutputFundamentals;

import java.io.*;
//import java.io.FileWriter;
import java.util.Scanner;

public class IOFun {
    public static void main(String[] args) throws Exception {
         // FOR STRING
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//
//        System.out.println(str);
//
//        FileWriter fw = new FileWriter("FileReaderWriter.txt");
//        fw.write("Hello World!!!");
//        fw.close();
//
//        FileReader fr = new FileReader("FileReaderWriter.txt");
//        char ch[] = new char[20];
//        fr.read(ch);
//        System.out.println(new String(ch));
//
//        sc.close();

        // FOR NUMBER
//        Scanner sc = new Scanner(new FileReader("FileReaderWriter.txt"));
//        int i = sc.nextInt();
//        System.out.println(i);

        //BUFFER to INPUT-STREAM-READER for character stream

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = br.read();
        String str = br.readLine();
        System.out.println(c);
        System.out.println((char)c);
        System.out.println(str);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("Happy to be JAVA!!!!");
        bw.write(1282);
        bw.flush();
    }
}
