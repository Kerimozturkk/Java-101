package SimpleCombinationCalculate;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //how many group creatable by N members
        //C(n,r) = n! / (r! * (n-r)!)

        Scanner input = new Scanner(System.in);

        while(true){
            int nMembersCount,rGroups;
            int nFac = 1,rFac = 1;
            int nMinusR,nMinusRFac = 1;
            int result;
            boolean isError = false;

            System.out.print("Please enter N: ");
            nMembersCount = input.nextInt();

            System.out.print("Please enter r: ");
            rGroups = input.nextInt();

            if(rGroups > nMembersCount) isError = true;

            for(int i = 1; i <= nMembersCount; i++){
                nFac *= i;
            }

            for(int i = 1; i <= rGroups; i++){
                rFac *= i;
            }

            nMinusR = nMembersCount - rGroups;

            for(int i = 1; i <= nMinusR; i++){
                nMinusRFac *= i;
            }


            if(isError){
                System.out.println("Error r must less than N");
            }else{

                result = nFac / (rFac * nMinusRFac);
                System.out.println("Combination Result: "+(result));
            }
        }

    }
}
