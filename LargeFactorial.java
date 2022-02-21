import java.util.*;

class LargeFactorial {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans[] = largeFactorial(n);
        for (int j : ans)
            System.out.print(j);

    }

    // TODO: Implement this method
    static int[] largeFactorial(int n) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(1);
        int carry =0;
        int valtolist =0;
        int val =1;
        int j =0;
        for(int i=2;i<=n;i++){
            for(j =0;j<arrList.size();j++){
                val = i * arrList.get(j)+carry;
                carry = 0;
                if(val<10){
                    valtolist = val;
                    carry = 0;
                    arrList.set(j,valtolist);
                }else{
                    valtolist = val%10;
                    carry = val/10;
                    arrList.set(j,valtolist);
                }
            }
            if(j==arrList.size() && carry!=0){
                System.out.println("j "+i);
                System.out.println("carry "+carry);
                /*int number = carry;
                int reverse =0;
                while(number != 0)   {  
                    int remainder = number % 10;  
                    reverse = reverse * 10 + remainder;  
                    number = number/10;  
                }
                //System.out.println("reverse carry "+reverse);
                while(reverse != 0)   {  
                    int finalcarry = reverse % 10;  
                    reverse = reverse/10; 
                    number = number/10;
                    arrList.add(finalcarry);  
                }*/
                arrList.add(carry);  
                carry =0;
            }
            //System.out.println(arrList);
        }
        
        int arrfinal[] = new int[arrList.size()];
        int k=0;
        for(int i=arrList.size()-1;i>=0;i--){
            arrfinal[k++] = arrList.get(i);
        }
        return arrfinal;
    }


}