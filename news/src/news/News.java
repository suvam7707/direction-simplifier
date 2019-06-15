package news;

import java.io.*;

public class News {

	public static void main(String[] args)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		char[] ch=str.toCharArray();
		int hor=0;
		int ver=0;
		for(char x:ch) {
			if(x=='N')
				ver++;
			else if(x=='S')
				ver--;
			else if(x=='E')
				hor++;
			else if(x=='W')
				hor--;
		}
		String res="";
		if(ver>0)
			for(int i=0;i<ver;i++)
				res+="N";
		else if(ver<0)
			for(int i=0;i>ver;i--)
				res+="S";
		if(hor>0)
			for(int i=0;i<hor;i++)
				res+="E";
		else if(hor<0)
			for(int i=0;i>hor;i--)
				res+="W";
		if(res=="")
			res="Sad Lily";
		System.out.println(res);
	}
	
}
