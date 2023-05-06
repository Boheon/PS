package Stack.no10828;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack s = new Stack();

        int num = Integer.parseInt(br.readLine());

        for(int i = 0; i < num; i++){
            String[] input = br.readLine().split(" ");

            switch(input[0]){
                case "push":
                    s.push(Integer.parseInt(input[1]));
                    break;

                case "pop":
                    System.out.println(s.pop());
                    break;

                case "size":
                    System.out.println(s.size());
                    break;

                case "empty":
                    System.out.println(s.empty());
                    break;

                case "top":
                    System.out.println(s.top());
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
