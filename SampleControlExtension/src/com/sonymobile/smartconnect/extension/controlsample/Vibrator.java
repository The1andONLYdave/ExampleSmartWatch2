package com.sonymobile.smartconnect.extension.controlsample;

import android.content.Context;

import com.sonyericsson.extras.liveware.aef.control.Control;
import com.sonyericsson.extras.liveware.extension.util.control.ControlExtension;
import com.sonyericsson.extras.liveware.extension.util.control.ControlTouchEvent;

public class Vibrator extends ControlExtension{


Vibrator(String hostAppPackageName, Context context){
    super(context, hostAppPackageName); 

}   

 @Override
    public void onStart() {
        vibrate();
    }

 @Override
    public void onTouch(final ControlTouchEvent event) {
        int action = event.getAction();
        if (action == Control.Intents.TOUCH_ACTION_PRESS) {

        }      
 }

public void vibrate(){

     if(hasVibrator()){
            startVibrator(1000, 500, 3);
     }
}
}