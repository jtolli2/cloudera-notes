package com.revature;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.util.ToolRunner;

/* 
 * MapReduce jobs are typically implemented by using a driver class.
 * The purpose of a driver class is to set up the configuration for the
 * MapReduce job and to run the job.
 * Typical requirements for a driver class include configuring the input
 * and output data formats, configuring the map and reduce classes,
 * and specifying intermediate data formats.
 * 
 * The following is the code for the driver class:
 */
public class WordCount {

	public static void main(String[] args) throws Exception {
		int exitCode = ToolRunner.run(new Configuration(), 
				new WordCountRunner(), 
				args);
		System.exit(exitCode);
	}
}