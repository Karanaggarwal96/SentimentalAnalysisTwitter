package com.test;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;

import org.apache.hadoop.mapreduce.Mapper;

public class mapper extends Mapper<LongWritable, Text, Text, NullWritable> {

	@Override
	protected void map(LongWritable key, Text value,Context context)
			throws IOException, InterruptedException {
		String str = value.toString(); /*read whole text and store it in string str*/
		String txt = str.split("\"text\":\"")[1].split("\",\"contributors\":")[0];  /*select the text part from text to contributors*/
		context.write(new Text(txt), NullWritable.get());  /*convert string to text*/
	}
	
	

}
