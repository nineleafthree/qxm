package com.njjhkj.qxm.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TimeUtil {
	// 默认日期格式
		public final static String DEFAULT_DATE_FORMAT = "yyyy-MM-dd";
		public final static String YYYY_MM_DD = "yyyy/MM/dd";
		public final static String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
		public final static String YYYYMMDD = "yyyyMMdd";
		public final static String YYYYMM = "yyyyMM";
		public final static String MM_DD_YYYY = "MM/dd/yyyy";
		public final static String DD_MM_YYYY = "dd/MM/yyyy";
		public final static String HH24_MM_SS = "HH:mm:ss";
		public final static String HH24_MM = "HH:mm";
		public final static String HH12_MM_SS = "hh:mm:ss";
		public final static String HH12_MM_A = "hh:mm a";
		public final static String HH12_MM_SS_A = "hh:mm:ss a";
		public final static String MM_DD_HH_MM = "MM-dd hh:mm";
		public final static String WEEK_FMT = "yyyy年MM月DD日 E HH:mm";
		public final static String WEEK_DATE_FMT = "yyyy年MM月dd日";
	
	/* 
     * 将时间转换为时间戳
     */    
    public static String dateToStamp(String s) throws ParseException{
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse(s);
        long ts = date.getTime();
        res = String.valueOf(ts);
        return res;
    }
    
    
    /* 
     * 将时间戳转换为时间
     */
    public static String stampToDate(String s){
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd 00:00");
        long lt = new Long(s);
        Date date = new Date(lt*1000);
        res = simpleDateFormat.format(date);
        return res;
    }
    /* 
     * 将时间戳转换为时间并加一天
     */
    public static String stampToDateAddOneDay(String s){
        long lt = new Long(s);
        Date date = new Date(lt*1000);
        
        return TimeUtil.addOneDay(date);
    }


    /* 
     * 格式化日期
     */
	public final static String format(Date date, String format) {
		DateFormat df = new SimpleDateFormat(format);
		return df.format(date);
	}
	/* 
     * 将日期转化成星期
     */
	public static String dateToWeek(String datetime) {
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        String[] weekDays = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
        Calendar cal = Calendar.getInstance(); // 获得一个日历
        Date datet = null;
        try {
            datet = f.parse(datetime);
            cal.setTime(datet);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1; // 指示一个星期中的某天。
        if (w < 0)
            w = 0;
        return weekDays[w];
    }
	
	
	public static void main(String[] args) {
		System.out.println(TimeUtil.dateToWeek("2019-03-26 00:00:00"));
	}
	
	/* 
     * 将日期加一天
     */
	public static String addOneDay(Date date) {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date); 
		    //calendar.add(calendar.YEAR, 1);//把日期往后增加一年.整数往后推,负数往前移动
		    //calendar.add(calendar.DAY_OF_MONTH, 1);//把日期往后增加一个月.整数往后推,负数往前移动
		    calendar.add(calendar.DATE,1);//把日期往后增加一天.整数往后推,负数往前移动 
		    //calendar.add(calendar.WEEK_OF_MONTH, 1);//把日期往后增加一个月.整数往后推,负数往前移动
		    date=calendar.getTime();   //这个时间就是日期往后推一天的结果 
		    return TimeUtil.format(date, "yyyy-MM-dd 00:00");
    }
	
	
}
