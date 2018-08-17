package ass1try.com.assignment1try;
//KHYATI SETH 2016050
import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Demo", "method called is OnCreate");
        Toast.makeText(this, "Activity is created", Toast.LENGTH_SHORT).show();


    }
    EditText editText;
    EditText editText1;
    EditText editText2;
    EditText editText3;
    EditText editText4;
    EditText editText5;
    EditText editText6;

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Demo", "State of Activity changed from resume to pause");
        Toast.makeText(this, "State of Activity changed from resume to pause", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Demo", "State of Activity changed from start to resume");
        Toast.makeText(this, "State of Activity changed from start to resume", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Demo", "State of Activity changed from pause to stop");
        Toast.makeText(this, "State of Activity changed from pause to stop", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Demo", "State of Activity is started");
        Toast.makeText(this, "Activity has started", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Demo", "State of Activity changed from stop to destroy");
        Toast.makeText(this, "State of Activity changed from stop to destroy", Toast.LENGTH_SHORT).show();
    }



    public void displaymessage(View view) {
        Log.d("Demo", "Submit Button Clicked");
        editText = findViewById(R.id.user_name);
        String messagename = editText.getText().toString();
        editText1 = findViewById(R.id.user_roll);
        String messageroll = editText1.getText().toString();
        editText2 = findViewById(R.id.user_branch);
        String messagebranch = editText2.getText().toString();
        editText3 = findViewById(R.id.user_one);
        String messageone = editText3.getText().toString();
        editText4 = findViewById(R.id.user_two);
        String messagetwo = editText4.getText().toString();
        editText5 = findViewById(R.id.user_three);
        String messagethree = editText5.getText().toString();
        editText6 = findViewById(R.id.user_four);
        String messagefour = editText6.getText().toString();
        Intent intent = new Intent(this,DisplayActivity.class);
        intent.putExtra("name_message",messagename);
        intent.putExtra("roll_message",messageroll);
        intent.putExtra("branch_message",messagebranch);
        intent.putExtra("one_message",messageone);
        intent.putExtra("two_message",messagetwo);
        intent.putExtra("three_message",messagethree);
        intent.putExtra("four_message",messagefour);
        startActivity(intent);
    }
    public void clear(View view)
    {
        editText = findViewById(R.id.user_name);
        editText1 = findViewById(R.id.user_roll);
        editText2 = findViewById(R.id.user_branch);
        editText3 = findViewById(R.id.user_one);
        editText4 = findViewById(R.id.user_two);
        editText5 = findViewById(R.id.user_three);
        editText6 = findViewById(R.id.user_four);

        editText.setText("name");
        editText1.setText("Roll number");
        editText2.setText("Branch");
        editText3.setText("Course 1");
        editText4.setText("Course 2");
        editText5.setText("Course 3");
        editText6.setText("Course 4");
    }

}