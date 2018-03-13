package spring2018.lab2;

import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.IntWritable;
import java.io.IOException;

public class AAReducer  extends Reducer <Text,Text,Text,Text> {
    @Override
    public void reduce(Text key, Iterable<Text> values, Context context) 
		   throws IOException, InterruptedException {
        
        // TODO: initialize integer sums for each reading frame
        
        // TODO: loop through Iterable values and increment sums for each reading frame
       
        // TODO: write the (key, value) pair to the context
        // TODO: consider how to use tabs to format output correctly
               
	  
   }
}