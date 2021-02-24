//package com.example.easyexcel.utils;
//
//import org.quartz.Job;
//import org.quartz.JobExecutionContext;
//import org.quartz.JobExecutionException;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.Random;
//
///**
// * @author ZhenHX
// * @description 测试quartz定时任务框架
// * @date 2020-04-08 13:55
// */
//public class PrintWordsJob implements Job{
//
//    @Override
//    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
//
//        System.out.println(jobExecutionContext.getJobDetail().getJobDataMap().get("jobDetail1"));
//        System.out.println(jobExecutionContext.getTrigger().getJobDataMap().get("trigger1"));
//
//        String printTime = new SimpleDateFormat("yy-MM-dd HH-mm-ss").format(new Date());
//        System.out.println("PrintWordsJob start at:" + printTime + ", prints: Hello Job-" + new Random().nextInt(100));
//
//    }
//}
//
