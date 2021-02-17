package com.infotechtime.beatthat

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat

class SignupActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        hideStatusBar()
        setContentView(R.layout.activity_signup)

        var tv_already_acnt = findViewById(R.id.tv_already_accnt) as TextView
        var btn_sign_up = findViewById(R.id.btn_signup) as Button

        tv_already_acnt.setOnClickListener{
            val intent = Intent(this@SignupActivity, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

        btn_sign_up.setOnClickListener {
            val intent = Intent(this@SignupActivity , MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun hideStatusBar(){
        if (Build.VERSION.SDK_INT >= 16) {
            window.setFlags(AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT, AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT);
            window.getDecorView().setSystemUiVisibility(3328);
        }else{
            requestWindowFeature(Window.FEATURE_NO_TITLE);
            window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
    }
}