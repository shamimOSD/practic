package ch8;
public class Time1 {
    private int hour;
    private int minute;
    private int second;
    public void setTime(int h,int m,int s){

        if((h>=0 && h<=23 ) && (m>=0 && m<=59)&& (s>=0 && s<=59)){
            this.hour=h;
            this.minute=m;
            this.second=s;
        }
        else System.out.println("Invalid Time");

    }
    public String toUniversalTime(){
        //String fromating set only 2 digit and if its 1 digit set another digit with 0
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }
    public String tostring(){
        return String.format("%02d:%02d:%02d %s",((hour ==0||hour==12)? 12: hour % 12),
                minute,second,(hour<12 ? "AM":"PM"));
    }

    public static void main(String[] args) {
        Time1 t1=new Time1();
        t1.setTime(22,12,59);
        System.out.println(t1.toUniversalTime());
        System.out.println(t1.tostring());
    }
}