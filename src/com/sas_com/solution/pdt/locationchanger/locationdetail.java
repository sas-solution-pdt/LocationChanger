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
        // �{�^���I�u�W�F�N�g�擾
        m_button2 = (Button)findViewById(R.id.button2);

        // �{�^���I�u�W�F�N�g�ɃN���b�N���X�i�[�ݒ�
        m_button2.setOnClickListener(new ButtonClickListener());
    }
    
    class ButtonClickListener implements OnClickListener {
    	// onClick���\�b�h(�{�^���N���b�N���C�x���g�n���h��)
    	
    	@Override
    	public void onClick(View v) {
			// �C���e���g�̐���
			Intent i = new Intent(locationdetail.this, locationsettings.class);
			
			// �A�N�e�B�r�e�B�N��
			startActivity(i);
    	}
    }

}
