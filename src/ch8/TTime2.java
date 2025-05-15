package ch8;

 class Time2 {
    private int secondSinceMidNight;
    int Hour,Minute,Second;
    public Time2(){
        this(0,0,0);
    }

    public Time2(int hour) {
        this(hour,0,0);
    }
    public Time2(int hour,int minute){
        this(hour,minute,0);
    }
    public Time2(int hour,int minute,int Second){
        if(hour<0 || hour>=24 || minute <0 || minute >=60 || Second <0 || Second >=60){
            throw new IllegalArgumentException("This is out of Range");
        }
        else {
            this.secondSinceMidNight=(hour*3600)+minute*60+Second;}

    }
    public int gethour(){
        return secondSinceMidNight/3600;
    }
    public int getminute(){
        return (secondSinceMidNight%3600)/60;
    }
    public int  getsec(){
        return (secondSinceMidNight%3600)%60;
    }
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", gethour(), getminute(), getsec());
    }
    public static void main(String[] args) {
        Time2[] t=new Time2[4];

        t[0]=new Time2();

        t[1]=new Time2(10);
        t[2]=new Time2(14,3);
        t[3] =new Time2(20,2,45);
        for(int i=0;i<4;i++){
            System.out.println(t[i].secondSinceMidNight);
            System.out.println(t[i].toUniversalString());
        }
    }
}