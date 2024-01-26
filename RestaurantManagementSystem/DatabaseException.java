/*
Version - 1.0.0 Date - 17-07-2020
Author - Abhinav Bammidi
*/

public class DatabaseException extends Exception {
    public String errMsg;
    public DatabaseException(String msg)
    { 
        errMsg = msg;
    }
    
    public String getErrMessage()
    {
        return errMsg;
    }
}
