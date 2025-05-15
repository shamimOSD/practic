package ch8;

   /* josephus is use for finding the winer position in a group of people
    this is work kill one person in one kill next and who is die his next person kill next
    its Recureence formula is
    J(n) if n is even then J(2n)=2*j(n)-1;
    for odd number J(2n+1)=2*J(n)+1;
    And cfg is 2l+1;
    n=2^m+l;
    and m&l<n;
     */

public class Find_The_winer_Using_Josephus_Method {


    int numberOfPersn;
    public static int josephus(int numberOfPersn){

        if (numberOfPersn==1){
            return 1;
        }
        else{


            if (numberOfPersn%2==0){


                numberOfPersn=2*josephus(numberOfPersn/2)-1;


                return numberOfPersn;
            }
            else {

                numberOfPersn=2*josephus((numberOfPersn-1)/2)+1;


                return numberOfPersn;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Winer Position in "+josephus(35));
    }
}