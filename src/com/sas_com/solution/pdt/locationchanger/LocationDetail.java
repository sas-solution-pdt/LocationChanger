package com.sas_com.solution.pdt.locationchanger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LocationDetail extends Activity {

	private Button m_button2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.locationdetail);
        m_button2 = (Button)findViewById(R.id.button2);
        m_button2.setOnClickListener(new ButtonClickListener());
    }

    class ButtonClickListener implements OnClickListener {
    	public void onClick(View v) {
			Intent i = new Intent(LocationDetail.this, LocationSettings.class);
			startActivity(i);
    	}
    }

}
