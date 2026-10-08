import java.util.Scanner;
public class votingSystem {
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        int vote1=0, vote2=0 ,vote3 = 0;
        while (true ){
            int age =sc.nextInt();
            if (age <18){
                return;
            }
            else if (age ==0){
                break;
            }
            else {
                System.out.println("vote for");
                int vote =sc.nextInt();
                if (vote ==1){
                    vote1++;
                }
                else if (vote ==2){
                    vote2++;
                }
                else if (vote ==3){
                    vote3++;
                }
                else {
                    System.out.println("invalid void");
                }
            }
        }
        System.out.printf("Output: Candidate 1: %d, Candidate 2: %d, Candidate 3: %d", vote1 , vote2, vote3);
    }
}
