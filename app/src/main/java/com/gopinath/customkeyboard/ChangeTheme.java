package com.gopinath.customkeyboard;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by gopinath on 13/01/18.
 */

public class ChangeTheme extends Activity {

    @Override
    protected void onStart() {
        super.onStart();
        setTheme(R.style.AppTheme);
        startActivity(new Intent(getApplicationContext(),GOPINATHKeyboard.class));
    }
}
