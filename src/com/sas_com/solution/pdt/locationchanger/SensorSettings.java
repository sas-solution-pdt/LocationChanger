package com.sas_com.solution.pdt.locationchanger;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SensorSettings extends Activity {

	private Button m_toggleButton01;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sensorsettings);
        m_toggleButton01 = (Button)findViewById(R.id.toggleButton01);
        m_toggleButton01.setOnClickListener(new ButtonClickListener());
    }

    class ButtonClickListener implements OnClickListener {
    	@Override
    	public void onClick(View v) {
    	}
    }

}
