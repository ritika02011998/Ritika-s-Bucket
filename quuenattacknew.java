import java.io.*;
import java.util.*;
public class quuenattacknew {

    // Complete the queensAttack function below.
   static int queensAttack(int n, int k, int rq, int cq, int[][] ob) {
   	int du=n-rq;
   	int dur=Math.min(n-rq, n-cq);
   	int dr=n-cq;
   	int dbr=Math.min(rq-1, n-cq);
   	int db=rq-1;
   	int dbl=Math.min(rq-1, cq-1);
   	int dl=cq-1;
   	int dul=Math.min(cq-1, n-rq);
   	
   	for(int i=0;i<k;i++) {
   		int r=ob[i][0];
   		int c=ob[i][1];
   		//up
   		if(c==cq&&r>rq)
   		{
   			int d=r-rq-1;
   			if(d<du)
   				du=d;
   		}
   		//upper-right
   		else if( ((r-rq)==(c-cq)) && r>rq && c>cq) {
   			int d=r-rq-1;
   			if(d<dur) {
   				dur=d;
   			}
   		}
   		//right
   		else if(r==rq && c>cq) {
   			int d=c-cq-1;
   			if(d<dr) {
   				dr=d;
   			}
   		}
   		//bottom-right
   		else if(c>cq && r<rq && ((rq-r)==(c-cq)) ) {
   			int d=rq-r-1;
   			if(d<dbr) {
   				dbr=d;
   			}
   		}
   		//bottom
   		else if(c==cq && r<rq) {
   			int d=rq-r-1;
   			if(d<db) {
   				db=d;
   			}
   		}
   		//bottom-left
   		else if(rq> r && cq>c && ((rq-r)==(cq-c)) ) {
   			int d=rq-r-1;
   			if(d<dbl) {
   				dbl=d;
   			}
   		}
   		//left
   		else if(r==rq && c<cq) {
   			int d=cq-c-1;
   			if(d<dl) {
   				dl=d;
   			}
   		}
   		//upper-left
   		else if(r>rq && c<cq && ((cq-c)==(r-rq)) ) {
   			int d=r-rq-1;
   			if(d<dul) {
   				dul=d;
   			}
   		}
   	}
   	int res=du+dur+dr+dbr+db+dbl+dl+dul;
    	return res;
    }
   
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter n and k");
    	int n=sc.nextInt();
    	int k=sc.nextInt();
    	System.out.println("Enter queen's position");
    	int rq=sc.nextInt();
    	int cq=sc.nextInt();
    	int obstacles[][]=new int[k][2];
    	for(int i=0;i<k;i++)
    	{
    		obstacles[i][0]=sc.nextInt();
    		obstacles[i][1]=sc.nextInt();
    	}
    	int result=queensAttack(n,k,rq,cq,obstacles);
    	System.out.println(result);
    	sc.close();
    }
}