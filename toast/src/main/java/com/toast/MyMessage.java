package com.toast;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class MyMessage
{
    public static void getMessage(String Message, Context context)
    {
        Toast.makeText(context,Message,Toast.LENGTH_SHORT).show();
    }

    public static void logAlert(String message)
    {
        Log.e("Android",message);
    }
}
