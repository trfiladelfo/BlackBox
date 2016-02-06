package icechen1.com.blackbox.messages;

/**
 * Created by yuchen.hou on 15-07-10.
 */
public class RecordStatusMessage {
    public static final int JUST_STARTED = -1;
    public static final int STARTED = 0;
    public static final int STOPPED = 1;
    public static final int JUST_STOPPED = 2;

    public int status;

    public RecordStatusMessage(int status){
        this.status = status;
    }
}
