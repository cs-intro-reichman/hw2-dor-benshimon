// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int x = Integer.parseInt(args[0]);
		double pies = 0.0;
		for(int i= 0; i<x; i++){
			double term = 1.0/ (1 +(2*i));
			if (i % 2 == 0){
			pies += term;
			 
			}else{
				pies -= term;

				}
			}

				double newpies = pies*4;
			
			System.out.println("pi according to Java:" + Math.PI);
				System.out.println("pi, approximated:" +newpies);
			
		
			 
			
		}
	}

