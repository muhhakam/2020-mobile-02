package id.putraprima.marketplacelayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class formlogin extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formlogin);
    }

    public void back(View view) {
        Intent i = new Intent(formlogin.this, MainActivity.class);
        startActivity(i);
    }

    public void pro(View view) {
        Intent i = new Intent(formlogin.this, profile.class);
        startActivity(i);
    }

    public void reg(View view) {
        Intent i = new Intent(formlogin.this, register.class);
        startActivity(i);
    }
}
