package com.denis.kisina.week1;

public class IsPowerOfFour {
	public boolean isPowerOfFour(int num) {
		if (num == 0) {
			return false;
		}
//         int temp = num;
//         int count = 1;
//         while(temp%4==0 && temp != 4){
//             temp = temp/4;
//             count++;
//         }
//         if(Math.pow(4, count) == num){return true;}

//         return false;
//     }

		int pow = (int) (Math.log(num) / Math.log(4));

		if (Math.pow(4, pow) == num) {
			return true;
		} else {
			return false;
		}
	}
}