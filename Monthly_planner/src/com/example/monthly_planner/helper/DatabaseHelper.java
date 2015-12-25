package com.example.monthly_planner.helper;
import java.lang.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteDatabase;
import android.content.*;

public class DatabaseHelper extends SQLiteOpenHelper {
	// Logcat tag
    private static final String LOG = "DatabaseHelper";
 
    // Database Version
    private static final int DATABASE_VERSION = 1;
 
    // Database Name
    private static final String DATABASE_NAME = "monthly_planner";
 
    // Table Names
    private static final String TABLE_C_AND_A = "c_and_a";
    private static final String TABLE_E_AND_T = "e_and_t";
    private static final String TABLE_FOOD = "food";
    private static final String TABLE_G_AND_V = "g_and_v";
    private static final String TABLE_HOUSE_RENT = "house_rent";
    private static final String TABLE_MEDICINE = "medicine";
    private static final String TABLE_OTHERS = "others";
    private static final String TABLE_TRANSPORT = "transport";
    
 
    // Common column names
    //private static final String KEY_ID = "id";
    //private static final String KEY_CREATED_AT = "created_at";
 
    // c_and_a Table - column names
    private static final String KEY_DATE1 = "date";
    private static final String KEY_COST1 = "cost";
 
    // e_and_t Table - column names
    private static final String KEY_DATE2 = "date";
    private static final String KEY_COST2 = "cost";
    // food Table - column names
    private static final String KEY_DATE3 = "date";
    private static final String KEY_COST3 = "cost";
    // g_and_v Table - column names
    private static final String KEY_DATE4 = "date";
    private static final String KEY_COST4 = "cost";
    // house_rent Table - column names
    private static final String KEY_DATE5 = "date";
    private static final String KEY_COST5 = "cost";
    // medicine Table - column names
    private static final String KEY_DATE6 = "date";
    private static final String KEY_COST6 = "cost";
    // others Table - column names
    private static final String KEY_DATE7 = "date";
    private static final String KEY_COST7 = "cost";
    // transport Table - column names
    private static final String KEY_DATE8 = "date";
    private static final String KEY_COST8 = "cost";
 
 
    // NOTE_TAGS Table - column names
    //private static final String KEY_TODO_ID = "todo_id";
    //private static final String KEY_TAG_ID = "tag_id";
 
    // Table Create Statements
    // c and a  table create statement
    private static final String CREATE_TABLE_C_AND_A = "CREATE TABLE "
            + TABLE_C_AND_A + "(" + KEY_DATE1 + " DATETIME ," + KEY_COST1
            + " VARCHAR," +  ")";
    // e and t  table create statement
    private static final String CREATE_TABLE_E_AND_T = "CREATE TABLE "
            + TABLE_E_AND_T + "(" + KEY_DATE2 + " DATETIME ," + KEY_COST2
            + " VARCHAR," +  ")";
 
    // FOOD  table create statement
    private static final String CREATE_TABLE_FOOD = "CREATE TABLE "
            + TABLE_FOOD + "(" + KEY_DATE3 + "DATETIME ," + KEY_COST3
            + " VARCHAR," +  ")";
    // G AND V  table create statement
    private static final String CREATE_TABLE_G_AND_V = "CREATE TABLE "
            + TABLE_G_AND_V + "(" + KEY_DATE4 + " DATETIME ," + KEY_COST4
            + " VARCHAR," +  ")";
    // HOUSE_RENT  table create statement
    private static final String CREATE_TABLE_HOUSE_RENT = "CREATE TABLE "
            + TABLE_HOUSE_RENT + "(" + KEY_DATE5 + " DATETIME ," + KEY_COST5
            + " VARCHAR," +  ")";
 // MEDICINE  table create statement
    private static final String CREATE_TABLE_MEDICINE = "CREATE TABLE "
            + TABLE_MEDICINE + "(" + KEY_DATE6 + " DATETIME ," + KEY_COST6
            + " VARCHAR," +  ")";
    // OTHERS  table create statement
    private static final String CREATE_TABLE_OTHERS = "CREATE TABLE "
            + TABLE_OTHERS + "(" + KEY_DATE7 + " DATETIME ," + KEY_COST7
            + " VARCHAR," +  ")";
 // TRANSPORT  table create statement
    private static final String CREATE_TABLE_TRANSPORT = "CREATE TABLE "
            + TABLE_TRANSPORT + "(" + KEY_DATE8 + " DATETIME ," + KEY_COST8
            + " VARCHAR," +  ")";
    
    
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
 
    @Override
    public void onCreate(SQLiteDatabase db) {
 
        // creating required tables
        db.execSQL(CREATE_TABLE_C_AND_A);
        db.execSQL(CREATE_TABLE_E_AND_T);
        db.execSQL(CREATE_TABLE_FOOD);
        db.execSQL(CREATE_TABLE_G_AND_V);
        db.execSQL(CREATE_TABLE_HOUSE_RENT);
        db.execSQL(CREATE_TABLE_MEDICINE);
        db.execSQL(CREATE_TABLE_OTHERS);
        db.execSQL(CREATE_TABLE_TRANSPORT);
    }
 
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // on upgrade drop older tables
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_C_AND_A);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_E_AND_T);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_FOOD);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_G_AND_V);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_HOUSE_RENT);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_MEDICINE);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_OTHERS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_TRANSPORT);
 
        // create new tables
        onCreate(db);
}
    
    
    /*
     * Creating c_and_a
     */
    public void create_c_and_a (c_and_a ca) {
        SQLiteDatabase db = this.getWritableDatabase();
     
        ContentValues values = new ContentValues();
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        Date d = ca.getDate();
        String da = f.format(d);
        values.put(KEY_COST1, ca.getCost());
        values.put(KEY_DATE1, da);
        
        
       
     
        // insert row
        db.insert(TABLE_C_AND_A, null, values);
        db.close();
        
    }
    
    /*
     * Creating e_and_t
     */
    public void create_e_and_t (e_and_t ea) {
        SQLiteDatabase db = this.getWritableDatabase();
     
        ContentValues values = new ContentValues();
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        Date d = ea.getDate();
        String da = f.format(d);
        values.put(KEY_COST2, ea.getCost());
        values.put(KEY_DATE2, da);
       
     
        // insert row
        db.insert(TABLE_E_AND_T, null, values);
        db.close();
        
    }
    /*
     * Creating g_and_v
     */
    public void create_g_and_v (g_and_v ea) {
        SQLiteDatabase db = this.getWritableDatabase();
     
        ContentValues values = new ContentValues();
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        Date d = ea.getDate();
        String da = f.format(d);
        values.put(KEY_COST4, ea.getCost());
        values.put(KEY_DATE4, da);
       
     
        // insert row
        db.insert(TABLE_G_AND_V, null, values);
        db.close();
        
    }
    /*
     * Creating food
     */
    public void create_food (food ea) {
        SQLiteDatabase db = this.getWritableDatabase();
     
        ContentValues values = new ContentValues();
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        Date d = ea.getDate();
        String da = f.format(d);
        values.put(KEY_COST3, ea.getCost());
        values.put(KEY_DATE3, da);
       
     
        // insert row
        db.insert(TABLE_FOOD, null, values);
        db.close();
        
    }
    
    /*
     * Creating house_rent
     */
    public void house_rent (house_rent ea) {
        SQLiteDatabase db = this.getWritableDatabase();
     
        ContentValues values = new ContentValues();
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        Date d = ea.getDate();
        String da = f.format(d);
        values.put(KEY_COST5, ea.getCost());
        values.put(KEY_DATE5, da);
       
     
        // insert row
        db.insert(TABLE_HOUSE_RENT, null, values);
        db.close();
        
    }
    

    /*
     * Creating MEDICINE
     */
    public void medicine (medicine ea) {
        SQLiteDatabase db = this.getWritableDatabase();
     
        ContentValues values = new ContentValues();
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        Date d = ea.getDate();
        String da = f.format(d);
        values.put(KEY_COST6, ea.getCost());
        values.put(KEY_DATE6, da);
       
     
        // insert row
        db.insert(TABLE_MEDICINE, null, values);
        db.close();
        
    }
    
    /*
     * Creating others
     */
    public void others (others ea) {
        SQLiteDatabase db = this.getWritableDatabase();
     
        ContentValues values = new ContentValues();
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        Date d = ea.getDate();
        String da = f.format(d);
        values.put(KEY_COST7, ea.getCost());
        values.put(KEY_DATE7, da);
       
     
        // insert row
        db.insert(TABLE_OTHERS, null, values);
        db.close();
        
    }
    /*
     * Creating transport
     */
    public void transport (transport ea) {
        SQLiteDatabase db = this.getWritableDatabase();
     
        ContentValues values = new ContentValues();
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        Date d = ea.getDate();
        String da = f.format(d);
        values.put(KEY_COST8, ea.getCost());
        values.put(KEY_DATE8, da);
       
     
        // insert row
        db.insert(TABLE_OTHERS, null, values);
        db.close();
        
    }
    
    
    public Double getc_and_a_sum(Date d1, Date d2) throws ParseException {
        
        // Select All Query
        String selectQuery = "SELECT  SUM("+KEY_COST1+") FROM " + TABLE_C_AND_A+"WHERE"+KEY_DATE1+"BETWEEN("+d1+"AND"+d2+")" ;
     
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        Double sum = cursor.getDouble(0);
        return sum;
     
     
        }
public Double gete_and_t_sum(Date d1, Date d2) throws ParseException {
        
        // Select All Query
        String selectQuery = "SELECT  SUM("+KEY_COST2+") FROM " + TABLE_E_AND_T+"WHERE"+KEY_DATE2+"BETWEEN("+d1+"AND"+d2+")" ;
     
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        Double sum = cursor.getDouble(0);
        return sum;
     
     
        }
public Double get_food_sum(Date d1, Date d2) throws ParseException {
    
    // Select All Query
    String selectQuery = "SELECT  SUM("+KEY_COST3+") FROM " + TABLE_FOOD+"WHERE"+KEY_DATE3+"BETWEEN("+d1+"AND"+d2+")" ;
 
    SQLiteDatabase db = this.getWritableDatabase();
    Cursor cursor = db.rawQuery(selectQuery, null);
    Double sum = cursor.getDouble(0);
    return sum;
 
 
    }
public Double getg_and_vsum(Date d1, Date d2) throws ParseException {
    
    // Select All Query
    String selectQuery = "SELECT  SUM("+KEY_COST4+") FROM " + TABLE_G_AND_V+"WHERE"+KEY_DATE4+"BETWEEN("+d1+"AND"+d2+")" ;
 
    SQLiteDatabase db = this.getWritableDatabase();
    Cursor cursor = db.rawQuery(selectQuery, null);
    Double sum = cursor.getDouble(0);
    return sum;
 
 
    }     
public Double gethouse_rent_sum(Date d1, Date d2) throws ParseException {
    
    // Select All Query
    String selectQuery = "SELECT  SUM("+KEY_COST5+") FROM " + TABLE_FOOD+"WHERE"+KEY_DATE5+"BETWEEN("+d1+"AND"+d2+")" ;
 
    SQLiteDatabase db = this.getWritableDatabase();
    Cursor cursor = db.rawQuery(selectQuery, null);
    Double sum = cursor.getDouble(0);
    return sum;
 
 
    }
public Double get_medicine_sum(Date d1, Date d2) throws ParseException {
    
    // Select All Query
    String selectQuery = "SELECT  SUM("+KEY_COST6+") FROM " + TABLE_E_AND_T+"WHERE"+KEY_DATE6+"BETWEEN("+d1+"AND"+d2+")" ;
 
    SQLiteDatabase db = this.getWritableDatabase();
    Cursor cursor = db.rawQuery(selectQuery, null);
    Double sum = cursor.getDouble(0);
    return sum;
 
 
    }
public Double getothers_sum(Date d1, Date d2) throws ParseException {
    
    // Select All Query
    String selectQuery = "SELECT  SUM("+KEY_COST7+") FROM " + TABLE_E_AND_T+"WHERE"+KEY_DATE7+"BETWEEN("+d1+"AND"+d2+")" ;
 
    SQLiteDatabase db = this.getWritableDatabase();
    Cursor cursor = db.rawQuery(selectQuery, null);
    Double sum = cursor.getDouble(0);
    return sum;
 
 
    }
public Double get_transport_sum(Date d1, Date d2) throws ParseException {
    
    // Select All Query
    String selectQuery = "SELECT  SUM("+KEY_COST8+") FROM " + TABLE_E_AND_T+"WHERE"+KEY_DATE8+"BETWEEN("+d1+"AND"+d2+")" ;
 
    SQLiteDatabase db = this.getWritableDatabase();
    Cursor cursor = db.rawQuery(selectQuery, null);
    Double sum = cursor.getDouble(0);
    return sum;
 
 
    }
    }

