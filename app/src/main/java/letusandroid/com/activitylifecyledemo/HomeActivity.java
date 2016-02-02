package letusandroid.com.activitylifecyledemo;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends Activity {

    public static final String TAG=HomeActivity.class.getSimpleName();
    TextView resultTxt;
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_home);
        resultTxt=(TextView)findViewById(R.id.result);

        message="1.> OnCreate Called and Bundle is " + savedInstanceState;
        Log.d(TAG, message);
        resultTxt.setText(resultTxt.getText() + "\n" + message);


    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        message="> OnRestoreInstanceState Called with Bundle -"+savedInstanceState;
        Log.d(TAG,message);
        resultTxt.setText(resultTxt.getText() + "\n" + message);
    }

    @Override
    protected void onStart() {
        super.onStart();
        message="2.> OnStart Called";
        Log.d(TAG, message);
        resultTxt.setText(resultTxt.getText() + "\n" + message);
    }

    @Override
    protected void onResume() {
        super.onResume();
        message="3.> OnResume Called";
        Log.d(TAG, message);
        resultTxt.setText(resultTxt.getText() + "\n" + message);
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        message="> OnSaveInstanceState Called";
        Log.d(TAG,message);
        resultTxt.setText(resultTxt.getText() + "\n" + message);

    }

    @Override
    protected void onPause() {
        super.onPause();
        message="4.> OnPause Called";
        Log.d(TAG, message);
        resultTxt.setText(resultTxt.getText() + "\n" + message);
    }

    @Override
    protected void onStop() {
        super.onStop();
        message="5.> OnStop Called";
        Log.d(TAG, message);
        resultTxt.setText(resultTxt.getText() + "\n" + message);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        message="6.> OnDestroy Called";
        Log.d(TAG, message);
        resultTxt.setText(resultTxt.getText() + "\n" + message);
    }




}
