package com.bridgelabz;

import java.util.Random;

public class EmployeeWageWorkiing implements EmployeeWageMethod {
    @Override
    public int calculate_Total_Wage(int workingHourPerMonth, int workingDayInMonth, int max, int half_time, int wage_per_hour, int hour_in_day, int present, int totalWage, int total_day, int total_hour, int total_working_day) {
        while ((total_day < workingDayInMonth && total_hour < workingHourPerMonth))
        {
            //object
            Random attendance = new Random();
            int check=attendance.nextInt(max);
            switch (check)
            {
                case 1:
                    totalWage=totalWage+wage_per_hour*hour_in_day;
                    total_day=total_day+1;
                    break;
                case 2:
                    totalWage=totalWage+wage_per_hour*half_time;
                    total_hour=total_hour+4;
                    break;
                default:

                    break;
            }

        }
        return totalWage;
    }
}
