package com.appbackgroundbox3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.util.Log;
import android.widget.Toast;
import com.google.android.gms.location.LocationResult;



public class MyLocationService extends BroadcastReceiver {

    public static final String ACTION_PROCESS_UPDATE = "com.example.geolocationapp.UPDATE_LOCATION";
    public static final String TAG = "teste";

    @Override
    public void onReceive(Context context, Intent intent) {

        if(intent != null)
        {
            final String action = intent.getAction();

            if(ACTION_PROCESS_UPDATE.equals(action)){
                LocationResult locationResult = LocationResult.extractResult(intent);

                if(locationResult != null){
                    Location location = locationResult.getLastLocation();
                    String location_string = new StringBuilder("" + location.getLatitude())
                            .append("/")
                            .append(location.getLongitude())
                            .toString();

                    try {
                        // Log.v(TAG, "locationTEXTVIEW= " + location_string);
                        HomeActivity.getInstance().updateTextView(location_string);
                    }catch (Exception ex){
                        Log.v(TAG, "location= " + location_string);
                        Toast.makeText(context, "coordenadas: "+location_string, Toast.LENGTH_LONG).show();
                    }
                }
            }
        }
    }
}
