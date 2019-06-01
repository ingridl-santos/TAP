package br.edu.icomp.ufam.musicstoreapp.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import br.edu.icomp.ufam.musicstoreapp.MainActivity;
import br.edu.icomp.ufam.musicstoreapp.R;

/**
 * Created by Ingrid.
 */
public class SplashScreenActivity extends Activity {

    /** Constante TIME_SPLASH.*/
    private static final int TIME_SPLASH = 5000;

    /** Handler. */
    private Handler handler;

    /** Runnable. */
    private final Runnable runnable = new Runnable() {
        @Override
        public void run() {
            final Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    };

    @Override
    protected void onCreate(final Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        handler = new Handler();
        handler.postDelayed(runnable, TIME_SPLASH);
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        if (handler != null){
            handler.removeCallbacks(runnable);
        }
    }
}
