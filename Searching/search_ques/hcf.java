package Searching.search_ques;

public class hcf {

    static int hcf(int n, int m){
        while (n!=0){
            int temp=n;
            n= m%n;
            m=temp;
        }
            return m;
    
        }

    public static void main(String[] args) {
    int n=60;
    int m=75;

    int HCF=hcf(n, m);
    System.out.println(HCF);

}


    
    
}
