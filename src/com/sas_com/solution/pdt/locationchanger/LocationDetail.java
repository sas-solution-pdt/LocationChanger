package com.sas_com.solution.pdt.locationchanger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LocationDetail extends Activity {

	private Button m_button01;
	private Button m_button02;
	private Button m_button03;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.locationdetail);

        m_button01 = (Button)findViewById(R.id.button01);
        m_button01.setOnClickListener(new Button01ClickListener());

        m_button02 = (Button)findViewById(R.id.button02);
        m_button02.setOnClickListener(new Button02ClickListener());

        m_button03 = (Button)findViewById(R.id.button03);
        m_button03.setOnClickListener(new Button03ClickListener());

    }

    class Button01ClickListener implements OnClickListener {
    	@Override
    	public void onClick(View v) {
			Intent i = new Intent(LocationDetail.this, LocationSettings.class);
			startActivity(i);
    	}
    }

    class Button02ClickListener implements OnClickListener {
    	@Override
    	public void onClick(View v) {
			Intent i = new Intent(LocationDetail.this, SensorSettings.class);
			startActivity(i);
    	}
    }

    class Button03ClickListener implements OnClickListener {
    	@Override
    	public void onClick(View v) {
			finish();
    	}
    }

}
