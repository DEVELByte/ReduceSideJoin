package com.mapreduce.classes;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class YOPMapper extends Mapper<Object, Text, Text, Text> {
	public void map(Object key, Text value, Context context)
			throws IOException, InterruptedException {

		String[] rows = value.toString().split("\";\"");

		context.write(new Text(rows[0].substring(1)), new Text("yop\t"
				+ rows[3].substring(0, rows[3].length())));
	}
}
