package com.sas_com.solution.pdt.locationchanger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class locationdetail extends Activity {
	
	private Button m_button2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.locationdetail);
        // ボタンオブジェクト取得
        m_button2 = (Button)findViewById(R.id.button2);

        // ボタンオブジェクトにクリックリスナー設定
        m_button2.setOnClickListener(new ButtonClickListener());
    }
    
    class ButtonClickListener implements OnClickListener {
    	// onClickメソッド(ボタンクリック時イベントハンドラ)
    	
    	@Override
    	public void onClick(View v) {
			// インテントの生成
			Intent i = new Intent(locationdetail.this, locationsettings.class);
			
			// アクティビティ起動
			startActivity(i);
    	}
    }

}
