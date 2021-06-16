import java.io.*;

public class example10_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter out = null;

        try {
            br = new BufferedReader(new FileReader("E:\\Myfile1.txt"), 1024);
            out = new BufferedWriter(new FileWriter("E:\\Myfile2.txt"));

            int lineCount = 0;
            String s;

            while ((s = br.readLine()) != null){
                lineCount++;
                System.out.println(lineCount + ": " + s);
                out.write(s);
                out.newLine();
            }
        } catch (IOException e){
            System.out.println("Exception!!!");
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
