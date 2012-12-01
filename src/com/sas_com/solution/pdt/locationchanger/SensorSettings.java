package com.sas_com.solution.pdt.locationchanger;

import android.app.Activity;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ToggleButton;

public class SensorSettings extends Activity {

	private ToggleButton m_toggleButton_WiFi;
	WifiManager wifi;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sensorsettings);
        m_toggleButton_WiFi = (ToggleButton)findViewById(R.id.toggleButton_WiFi);
        m_toggleButton_WiFi.setOnClickListener(new ToggleButton_WiFi_ClickListener());

        //WiFi
        wifi = (WifiManager)getSystemService(WIFI_SERVICE);
        if(wifi.isWifiEnabled()) {
            m_toggleButton_WiFi.setEnabled(true);
        }else{
            m_toggleButton_WiFi.setEnabled(false);
        }
    }

    class ToggleButton_WiFi_ClickListener implements OnClickListener {
    	@Override
    	public void onClick(View v) {

    		if(wifi.isWifiEnabled()) {
    			// WifiをOnからOffに
    			wifi.setWifiEnabled(false);
    		} else {
    			// WifiをOffからOnに
    			wifi.setWifiEnabled(true);
    		}
    		m_toggleButton_WiFi.toggle();
    	}
    }
}
