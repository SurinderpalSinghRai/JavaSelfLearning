package com.apigateway;

//Here we are defining a enum from outside the class.
enum AllDays{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}
public class MyEnumClass {

    ///Here we are defining enum inside the class.
    public enum AllMonth{
        JANUARY(1),FEBRUARY(2),MARCH(3),APRIL(4),MAY(5),JUNE(6),JULY(7),AUGUST(8),SEPTEMBER(9),OCTOBER(10),NOVEMBER(11),DECEMBER(12);
        private int month;
        private AllMonth(int month){
            this.month=month;
        }
        public int getMonth(){
            return this.month;
        }
    }


    public static void main(String[] args){

        //Here we are just getting a number for any specific month from internel enum.
        AllMonth m=AllMonth.JULY;
        System.out.println("The number for" +" "+m+" " + "month is "+ m.getMonth());

        //Here we are just printing a single value from the outer enum.(A particular day)
        AllDays day = AllDays.FRIDAY;
        switch(day){
            case SUNDAY:
                System.out.println("sunday");
                break;
            case MONDAY:
                System.out.println("monday");
                break;
            case FRIDAY:
                System.out.println("Friday");
                break;
            default:
                System.out.println("other day");
        }

        //Here by using loop we are printing all the values from internal enum.(All months)
        for(AllMonth m2: AllMonth.values()){
            System.out.println(m2);
        }
        //By using this loop we are printing all the values from outer enum.(All days)
        for(AllDays d: AllDays.values()){
            System.out.println(d);
        }
    }
}
