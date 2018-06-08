package java;

public class TortoiseRacing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] test = race(720, 850, 70);
		System.out.println(test[0]);
		System.out.println(test[1]);
		System.out.println(test[2]);
		
	}
	
	public static int[] race(int v1, int v2, int g) {
       /* int[] result = {-1,-1,-1};
        
        if(v1>v2) return result;
        
        int n = 8;
        double n2 = Math.pow(10.0, n);
        double aSpeedPerSec = (double)v1/3600;
        aSpeedPerSec = Math.ceil(aSpeedPerSec*n2)/n2;
        System.out.println(aSpeedPerSec);
        double bSpeedPerSec = (double)v2/3600;
        bSpeedPerSec = Math.ceil(bSpeedPerSec*n2)/n2;
        System.out.println(bSpeedPerSec);
        double aDistance = g;
        double bDistance = 0;
        int sec = 1;
        while(aDistance > bDistance){
        	aDistance = g+ aSpeedPerSec * sec;
        	bDistance = bSpeedPerSec * sec;
        	sec++;
        }
        sec--;
        System.out.println(sec);
        result[0] = sec/3600;
        result[1] = (sec%3600)/60;
        result[2] = sec%60;
        
        return result;*/
        
        //������
        int totalSecondsTaken = 0;
        if (v2 > v1 ) {
          totalSecondsTaken = (g*3600) / (v2-v1) ;
        } else {
          return null;
        }
        return new int[] {totalSecondsTaken/3600, (totalSecondsTaken % 3600)/60, totalSecondsTaken % 60};
    }

}
//Two tortoises named A and B must run a race. A starts with an average speed of 720 feet per hour. Young B knows she runs faster than A, and furthermore has not finished her cabbage.
//
//When she starts, at last, she can see that A has a 70 feet lead but B's speed is 850 feet per hour. How long will it take B to catch A?
//
//More generally: given two speeds v1 (A's speed, integer > 0) and v2 (B's speed, integer > 0) and a lead g (integer > 0) how long will it take B to catch A?
//
//The result will be an array [hour, min, sec] which is the time needed in hours, minutes and seconds (round down to the nearest second) or a string in some languages.
//
//If v1 >= v2 then return nil, nothing, null, None or {-1, -1, -1} for C++, C, Go, Nim, [] for Kotlin or "-1 -1 -1".
//
//Examples:
//(form of the result depends on the language)
//
//race(720, 850, 70) => [0, 32, 18] or "0 32 18"
//race(80, 91, 37)   => [3, 21, 49] or "3 21 49"
//**Note:
//
//See other examples in "Your test cases".
//
//In Fortran - as in any other language - the returned string is not permitted to contain any redundant trailing whitespace: you can use dynamically allocated character strings.