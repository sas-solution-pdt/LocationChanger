package com.sas_com.solution.pdt.locationchanger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LocationList extends Activity {

	private Button m_button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.locationlist);
        m_button = (Button)findViewById(R.id.button1);
        m_button.setOnClickListener(new ButtonClickListener());
    }

    class ButtonClickListener implements OnClickListener {
    	@Override
    	public void onClick(View v) {
			Intent i = new Intent(LocationList.this, LocationDetail.class);
			startActivity(i);
    	}
    }
}