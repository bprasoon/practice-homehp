package practise;

public class Checkvovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String text = "Hello World";
String name = "Prasoon";
char letter;
int count=0;

for(int i=0;i<text.length();i++)
{
	letter=text.charAt(i);
	//if(letter == 'a'||letter == 'e'||letter =='i'||letter =='o'||letter =='u'||letter == 'A'||letter == 'E'||letter =='I'||letter =='O'||letter =='U')
	switch(letter)
	{
	case 'a':
	case 'A':
	case 'e':
	case 'E':
	case 'i':
	case 'I':
	case 'o':
	case 'O':
	case 'u':
	case 'U':
	count++;
	}
}
System.out.println("Count of vowels in the text " + "\""+text+ "\""+ " is :"+ count);
System.out.println("Count of vowels in the text "+text + " is :"+ count);		
System.out.println("My name is "+"\""+name +"\""+ " is :"+ count);		
	}

}
