package ass1try.com.assignment1try;
//KHYATI SETH 2016050
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Intent intent = getIntent();
        String messagename = intent.getStringExtra("name_message");
        TextView textViewname = findViewById(R.id.display_name);
        textViewname.setText(messagename);
        String messageroll = intent.getStringExtra("roll_message");
        TextView textViewroll = findViewById(R.id.display_roll);
        textViewroll.setText(messageroll);
        String messagebranch = intent.getStringExtra("branch_message");
        TextView textViewbranch = findViewById(R.id.display_branch);
        textViewbranch.setText(messagebranch);
        String messageone = intent.getStringExtra("one_message");
        TextView textViewone = findViewById(R.id.display_one);
        textViewone.setText(messageone);
        String messagetwo = intent.getStringExtra("two_message");
        TextView textViewtwo = findViewById(R.id.display_two);
        textViewtwo.setText(messagetwo);
        String messagethree = intent.getStringExtra("three_message");
        TextView textViewthree = findViewById(R.id.display_three);
        textViewthree.setText(messagethree);
        String messagefour = intent.getStringExtra("four_message");
        TextView textViewfour = findViewById(R.id.display_four);
        textViewfour.setText(messagefour);

    }
}
