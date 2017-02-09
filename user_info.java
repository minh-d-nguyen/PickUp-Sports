package minhdnguyen.pickupsports;

import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class user_info extends AppCompatActivity implements View.OnClickListener{
    Button btn;
    EditText email_add;
    EditText psswrd;
    EditText psswrd_cf;
    TextView message;
    SQLiteDatabase login_info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        email_add = (EditText) findViewById(R.id.email);;
        psswrd = (EditText) findViewById(R.id.password);
        psswrd_cf = (EditText) findViewById(R.id.password_cf);
        btn = (Button) findViewById(R.id.submit_info);
        message = (TextView) findViewById(R.id.message);

        btn.setOnClickListener(this);

    }

    public void onClick(View v) {
        if (!psswrd.getText().toString().equals(psswrd_cf.getText().toString())) {
            message.setText("Passwords do not match!");
        } else {
            if (psswrd.getText().toString().length() < 7) {
                message.setText("Password must be at least 7 characters");
            }
        }
    }


    /* This method is called when the user submit their info */
    public void submitInfo() {

    }
}

