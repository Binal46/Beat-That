package com.infotechtime.beatthat

import android.graphics.Color
import android.graphics.Typeface
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.Gravity
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.FrameLayout
import android.widget.TextView
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.infotechtime.beatthat.fragment.HomeFragment
import com.infotechtime.beatthat.fragment.MatchesFragment
import com.infotechtime.beatthat.fragment.NewsFragment
import com.infotechtime.beatthat.fragment.SettingsFragment


class MainActivity : AppCompatActivity() {
    lateinit var tv_title: TextView
    private var content: FrameLayout? = null

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                val fragment = HomeFragment()
                addFragment(fragment)
                tv_title.text = "Beat that"

                // Create a TypeFace using the font file
                val typeface = Typeface.createFromAsset(assets, "VIVALDII.TTF")

                // Set the typeface
                tv_title.typeface = typeface
                tv_title.setTextSize(
                    TypedValue.COMPLEX_UNIT_PX,
                    resources.getDimension(R.dimen.beat_that_font))
                tv_title.gravity = Gravity.LEFT
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_matches -> {
                val fragment = MatchesFragment()
                addFragment(fragment)
                tv_title.text = "Matches"
                // Set the typeface
                tv_title.typeface = Typeface.SERIF
                tv_title.setTextSize(
                    TypedValue.COMPLEX_UNIT_PX,
                    resources.getDimension(R.dimen.select_font))
                tv_title.gravity = Gravity.CENTER
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_news -> {
                val fragment = NewsFragment()
                addFragment(fragment)
                tv_title.text = "News"
                // Set the typeface
                tv_title.typeface = Typeface.SERIF
                tv_title.setTextSize(
                    TypedValue.COMPLEX_UNIT_PX,
                    resources.getDimension(R.dimen.select_font))
                tv_title.gravity = Gravity.CENTER
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_settings -> {
                val fragment = SettingsFragment()
                addFragment(fragment)
                tv_title.text = "Settings"
                // Set the typeface
                tv_title.typeface = Typeface.SERIF
                tv_title.setTextSize(
                    TypedValue.COMPLEX_UNIT_PX,
                    resources.getDimension(R.dimen.select_font))
                tv_title.gravity = Gravity.CENTER
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    private fun addFragment(fragment: Fragment) {
        supportFragmentManager
                .beginTransaction()
                .setCustomAnimations(R.anim.design_bottom_sheet_slide_in, R.anim.design_bottom_sheet_slide_out)
                .replace(R.id.content, fragment, fragment.javaClass.getSimpleName())
                .commit()


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        hideStatusBar()
        setContentView(R.layout.activity_main)

        tv_title = findViewById(R.id.tv_title) as TextView
        tv_title.text = "Beat that"
        // Create a TypeFace using the font file
        val typeface = Typeface.createFromAsset(assets, "VIVALDII.TTF")

        // Set the typeface
        tv_title.typeface = typeface
        tv_title.setTextSize(
            TypedValue.COMPLEX_UNIT_PX,
            resources.getDimension(R.dimen.beat_that_font))
        tv_title.gravity = Gravity.LEFT

        var navigation = findViewById(R.id.navigation) as BottomNavigationView
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        val fragment = HomeFragment()
        addFragment(fragment)


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