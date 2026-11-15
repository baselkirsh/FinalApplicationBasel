package basel.kersh.finalapplicationbasel.viewPkg;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import basel.kersh.finalapplicationbasel.R;
import basel.kersh.finalapplicationbasel.data.AppDatabase;
import basel.kersh.finalapplicationbasel.data.mySubjectTable.MySubject;
import basel.kersh.finalapplicationbasel.data.mySubjectTable.MySubjectQuery;

public class MainActivity extends AppCompatActivity {
    private Button btnAddTaskScreen;
    private Button btnRegisterScreen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        AppDatabase db = AppDatabase.getDB(getApplicationContext());
        MySubjectQuery subjectQuery = db.getMySubjectQuery();
        if (subjectQuery.checkSubject("Math") == null) {
            MySubject s1 = new MySubject();
            s1.setTitle("Math");
            subjectQuery.insert(s1);
        }
        if (subjectQuery.checkSubject("Computers") == null) {
            MySubject s2 = new MySubject();
            s2.setTitle("Computers");
            subjectQuery.insert(s2);
        }

        View mainView = findViewById(R.id.main);
        if (mainView != null) {
            ViewCompat.setOnApplyWindowInsetsListener(mainView, (v, insets) -> {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                return insets;
            });
        }
        btnAddTaskScreen = findViewById(R.id.btnAddTaskScreen);
        btnAddTaskScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ActivityAddTask.class);
                startActivity(intent);
            }
        });
        btnRegisterScreen = findViewById(R.id.btnRegisterScreen);
        btnRegisterScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, activity_register.class);
                startActivity(intent);
            }
        });
    }
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.main_menu, menu);
            return true;
        }

        public boolean onOptionsItemSelected(MenuItem item) {
            if (item.getItemId() == R.id.itmSettings) {
                Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
            }
            if (item.getItemId() == R.id.itmSignout) {
                {
                    Toast.makeText(this, "Sign out", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.itmHistory) {
                    Toast.makeText(this, "History", Toast.LENGTH_SHORT).show();
                }
                return true;
            }
            return true;
        }
    }