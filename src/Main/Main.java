package Main;

import Util.LoggerClass;

public class Main {
    public static void main(String[] args) {
        LoggerClass.getInstance().getLogger().severe("hello");
        new Program(args).run();
    }


}
