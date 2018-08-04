public class InterestManager {
    public static void main(String args[]){
        InterestManager Manager=new InterestManager();
        for(int day=1;day<=365;day+=10){
            System.out.println(1000000*Manager.getInterestRate(day));
        }
    }
    public double getInterestRate(int day){
        if(day>=1&&day<=90)
            return 0.005;
        else if(day>=91&&day<=180)
            return 0.01;
        else if(day>=181&&day<=364)
            return 0.02;
        else
            return 0.056;
    }
    public double calculateAmount(int day, long amount){
        getInterestRate(day);
        return amount+amount*getInterestRate(day);
    }
}
