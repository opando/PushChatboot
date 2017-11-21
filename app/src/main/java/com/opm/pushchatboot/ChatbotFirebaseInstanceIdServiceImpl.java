package com.opm.pushchatboot;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by opando on 20/11/17.
 */

public class ChatbotFirebaseInstanceIdServiceImpl extends FirebaseInstanceIdService {

    public static final String TAG = "PUSH";

    @Override
    public void onTokenRefresh() {

        super.onTokenRefresh();

        String token = FirebaseInstanceId.getInstance().getToken();

        Log.i(TAG,"token : " + token);
    }
}
