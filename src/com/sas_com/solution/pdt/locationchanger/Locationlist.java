package com.sas_com.solution.pdt.locationchanger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Locationlist extends Activity {
    /** Called when the activity is first created. */
	private Button m_button;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.locationlist);
        // ボタンオブジェクト取得
        m_button = (Button)findViewById(R.id.button1);

        // ボタンオブジェクトにクリックリスナー設定
        m_button.setOnClickListener(new ButtonClickListener());
    }
    
    class ButtonClickListener implements OnClickListener {
    	// onClickメソッド(ボタンクリック時イベントハンドラ)
    	
    	@Override
    	public void onClick(View v) {
			// インテントの生成
			Intent i = new Intent(Locationlist.this, locationdetail.class);
			
			// アクティビティ起動
			startActivity(i);
    	}
    }
}