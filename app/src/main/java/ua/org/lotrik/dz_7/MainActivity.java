package ua.org.lotrik.dz_7;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity{

    private static final String TAG = "myLogs";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView save = (TextView)findViewById(R.id.save);
        TextView reset = (TextView)findViewById(R.id.reset);
        final EditText editEmail = (EditText)findViewById(R.id.editEmail);
        final EditText editPasswd = (EditText)findViewById(R.id.editPasswd);
        final EditText editPasswd2 = (EditText)findViewById(R.id.editPasswd2);
        final TextView error = (TextView)findViewById(R.id.error);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!editPasswd.getText().toString().equals(editPasswd2.getText().toString())) {
                    error.setText("Пароли не совпадают");
                } else error.setText("");
                Log.d(TAG, "Email: " + editEmail.getText() + " Password: " + editPasswd.getText()
                        + " Password2: " + editPasswd2.getText());
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editEmail.setText("");
                editPasswd.setText("");
                editPasswd2.setText("");
                error.setText("");
            }
        });
    }

}
