package kochi.vaisakh.com.leafbug;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.util.Log;

/**
 * Created by light on 2/27/2018.
 */

public class SmsReceive extends BroadcastReceiver {
    public SmsReceive(){}
    OTPActivity main = null;
    void setActivitymainHandler(OTPActivity main){
        this.main= main;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e("SmsReceive","message received");
        Bundle bundle = intent.getExtras();
        try {
            if (bundle != null) {
                final Object[] pdusobj = (Object[]) bundle.get("pdus");
                for (int i = 0; i < pdusobj.length; i++) {
                    SmsMessage currentMessage = SmsMessage.createFromPdu((byte[]) pdusobj[i]);
                    String phonenumber = currentMessage.getDisplayOriginatingAddress();
                    String senderNum = phonenumber;
                    String message = currentMessage.getDisplayMessageBody();
                    Log.e("success","message"+message);
                    String numonly= message.replaceAll("[^\\d]"," ");
                    Log.e("success","num"+numonly);
                    this.main.func(numonly);


                }
            }
        } catch (Exception e) {
            Log.e("SmsReceiver", "Exception smsReceiver" + e);

        }
    }
}

