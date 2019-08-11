import java.util.Scanner;
public class ConsonantsandVowelscheck
{
 public static void main(String asrgs[])
 {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch[] = s.toCharArray();
        int v=0;
        int c=0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
            ++v;
			else if(ch[i]==' ')
			continue;
            else
            ++c;
        }
		System.out.println("v=="+v+"    "+"c=="+c);
        if(v>c)
        System.out.print("Yes");
        else if(c>v)
        System.out.print("No");
        else
       System.out.print("Same");
        System.out.println();
  }
}