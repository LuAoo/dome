package pp.com.dome;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class SQLiteHelper extends SQLiteOpenHelper {
    private static final int DB_VERSION=1;
    public static String DB_NAME="bxg.db";
    public static final String U_USERINFO="userinfo";
    public Context context;
    public SQLiteHelper(Context context) {
        super(context, DB_NAME,null,DB_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
     //创建个人信息表
        db.execSQL("CREATE TABLE  IF NOT EXISTS " + U_USERINFO + "( "
                + "_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "userName VARCHAR, "// 用户名
                + "nickName VARCHAR, "// 昵称
                + "sex VARCHAR, "// 性别
                + "signature VARCHAR"// 签名
                + ")");
//        Toast.makeText(context, "Hello", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//        db.execSQL("DROP TABLE IF EXISTS " + U_USERINFO);
//        onCreate(db);
    }
}
