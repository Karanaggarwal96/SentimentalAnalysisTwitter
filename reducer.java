package com.test;

import java.io.IOException;

import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class reducer extends Reducer<Text, NullWritable, Text, NullWritable> {
    
    protected void reduce(Text arg0, Iterable<NullWritable> arg1, 
    		Reducer<Text, NullWritable, Text, NullWritable>.Context arg2)
    throws IOException, InterruptedException {
        arg2.write(arg0, NullWritable.get());
    }
}