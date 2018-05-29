package com.example.perfectlib;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ToastGenerator {

    public static void errorToast(Context context, String text){


//  LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        View view=inflater.inflate(R.layout.toast_error_layout,null);
//        TextView textView=view.findViewById(R.id.toasterror_textview);
//        textView.setText(text);
//        Toast toast=new Toast(context);
//        toast.setDuration(Toast.LENGTH_LONG);
//        toast.setView(view);
//        toast.show();
        genrateToast(context,R.layout.toast_error_layout,R.id.toasterror_textview,text);



    }


    public static void successToast(Context context, String text){
        genrateToast(context,R.layout.toast_success_layout,R.id.toastsuccess_textview,text);
    }
    public static void infoToast(Context context, String text){
        genrateToast(context,R.layout.toast_info_layout,R.id.toastinfo_textview,text);
    }


    static void  genrateToast(Context context,int layout_id,int textview_id,String text){
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(layout_id,null);
        TextView textView=view.findViewById(textview_id);
        textView.setText(text);
        Toast toast=new Toast(context);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(view);
        toast.show();
    }
}
