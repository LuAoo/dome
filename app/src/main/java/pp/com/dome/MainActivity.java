package pp.com.dome;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity  {

    private SearchView f1;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SQLiteHelper sqLiteHelper=new SQLiteHelper(this);
        SQLiteDatabase sqLiteDatabase=sqLiteHelper.getWritableDatabase();
     }
}
