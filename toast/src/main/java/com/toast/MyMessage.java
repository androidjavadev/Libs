package com.toast;

import android.content.Context;
import android.widget.Toast;

public class MyMessage
{
    public static void getMessage(String Message, Context context)
    {
        Toast.makeText(context,Message,Toast.LENGTH_SHORT).show();
    }
}
