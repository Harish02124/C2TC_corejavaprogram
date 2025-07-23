package Activity;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        String name;
        System.out.println("Enter the name:");
        name=br.readLine();
        int age;
        System.out.println("Enter the age:");
        age=Integer.parseInt(br.readLine());
        float avg;
        System.out.println("Enter the Average:");
        avg=Float.parseFloat(br.readLine());
        
        System.out.println("name:"+name+" "+"age:"+age+" "+"avg:"+avg);
	}

}
