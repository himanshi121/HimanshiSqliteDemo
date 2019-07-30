package com.example.himanshisqlitedemo.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import com.example.himanshisqlitedemo.model.Course;

public class MySqliteHelper extends SQLiteOpenHelper {

    Context context;
    public MySqliteHelper(Context context) {
        super(context, "mydb", null, 1);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql = "create table course(id INTEGER PRIMARY KEY AUTOINCREMENT,title TEXT,duration INTEGER,fee FLOAT)";
        sqLiteDatabase.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void addCourse(Course course){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("title",course.getTitle());
        contentValues.put("duration",course.getDuration());
        contentValues.put("fee",course.getFee());
        db.insert("course",null,contentValues);
        Toast.makeText(context, "done", Toast.LENGTH_SHORT).show();
    }


}
