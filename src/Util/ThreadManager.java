package Util;
import Broker.Topic;
import Consumer.Consumer;
import Producer.Producer;

import java.util.ArrayList;
import java.util.HashMap;

public class ThreadManager {

    public static boolean lockAllConsumers = true;



    public static void notifyConsumersAtFirst(){
            lockAllConsumers = false;

    }




}
