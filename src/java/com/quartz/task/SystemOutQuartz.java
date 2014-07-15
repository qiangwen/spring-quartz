package com.quartz.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.StatefulJob;

public class SystemOutQuartz implements StatefulJob{

	@Override
	public void execute(JobExecutionContext jobexecutioncontext)
			throws JobExecutionException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("开始作业了，时间是: "+sdf.format(new Date()));
		
	}

}
