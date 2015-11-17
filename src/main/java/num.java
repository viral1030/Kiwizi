import java.util.Random;



public class num 

{
	public int rrnum(int l){
	Random rand = new Random();
	int rnum = rand.nextInt(l);

	return rnum;
	}

	
public static void main(String args[])
{
	num n = new num(); 
	n.rrnum(8);
	System.out.println(n.rrnum(8));
}

}