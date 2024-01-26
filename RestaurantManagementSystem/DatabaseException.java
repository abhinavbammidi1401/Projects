/**
 * Version 2.5.9 - Date 17-07-2022
 * Abhinav Bammidi
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
