package Broker;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TopicReader {

    RandomAccessFile topicFile;

    private Topic topic;
    private String groupName;

    TopicReader(Topic topic, String groupName) {
        this.topic = topic;
        this.groupName=groupName;

        //To Do - Generate topicFile    Done!

        try {
            topicFile = new RandomAccessFile(this.topic.getTopicFile(), "r");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public int get(String consumerName) {
        int value = 0;
        //To Do - Read next value from topicFile and return the value  Done!

        try {

            try{

                value = topicFile.readInt();
                System.out.println(value);

            } catch(EOFException e){

            }

        } catch (IOException e) {
            e.printStackTrace();
        }



        //To Do - Handle the transaction constraints
        return value;
    }
}
