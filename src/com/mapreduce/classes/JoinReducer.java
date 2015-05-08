package com.mapreduce.classes;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

	public  class JoinReducer extends
			Reducer<Text, Text, Text, Text> {
		public void reduce(Text key, Iterable<Text> values, Context context)
				throws IOException, InterruptedException {
			String yop = "";
			double totRating = 0.0;
			int count = 0;
			for (Text t : values) {
				String parts[] = t.toString().split("\t");
				if (parts[0].equals("rating")) {
					count++;
					totRating += Float.parseFloat(parts[1]);
				} else if (parts[0].equals("yop")) {
					yop = parts[1];
				}
			}
			double agvRating = totRating/count;
			context.write(new Text(key+ "\t" + yop), new Text(agvRating + "\t" + count));
		}
	}