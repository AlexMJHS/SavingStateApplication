package ctec.savingstateapplication.model;

import android.app.Application;

/**
 * Created by amag6880 on 10/14/15.
 */
public class AndroidSaveState extends Application
{
    private String userName;
    private boolean isTired;
    private int age;

    public AndroidSaveState()
    {
        this.userName = "default";
        this.isTired = false;
        this.age = -0;
    }

    public String getUserName()
    {
        return userName;
    }

    public int getAge()
    {
        return age;
    }

    public boolean getIsTired()
    {
        return isTired;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public void setIsTired(boolean isTired)
    {
        this.isTired = isTired;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}
