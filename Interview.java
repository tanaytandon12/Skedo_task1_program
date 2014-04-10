import java.io.*;
class Interview
{
	public static void main(String[] args)throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		String hierarchy[] = {"Director A","Director B","Director C","Manager A","Manager B","Employee 1","Employee 2","Employee 3"};
		int len = hierarchy.length,flag =0;
		String s = input.readLine();
		for(int i =0;i<len;i++)
		{
			if(!(s.equals(hierarchy[i])))
			{
				flag++;
			}
			else
			{
				break;
			}
		}

		System.out.println("Number of Interviews are " + flag);
		System.out.println("List of interviewers are:");
		for(int i=0;i<flag;i++)
			System.out.println(hierarchy[i]);
		
	}
}
