package com.ruizgarcia.carhouse;

import android.provider.BaseColumns;

public final class FeedReaderContract {

    private FeedReaderContract() {}

    /* Inner class that defines the table contents */
    public static class FeedEntry implements BaseColumns {
        public static final String TABLE_NAME = "coches";
        public static final String COLUMN_1 = "ID";
        public static final String COLUMN_2 = "marca";
        public static final String COLUMN_3 = "modelo";
        public static final String COLUMN_4 = "kilometraje";
        public static final String COLUMN_5 = "anio";
        public static final String COLUMN_6 = "cilindrada";
        public static final String COLUMN_7 = "potencia";
        public static final String COLUMN_8 = "precio";
        public static final String COLUMN_9 = "vendido";
    }

    protected static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + FeedEntry.TABLE_NAME + " (" +
                    FeedEntry._ID + " INTEGER PRIMARY KEY," +
                    FeedEntry.COLUMN_1 + " TEXT," +FeedEntry.COLUMN_2 +
                    " TEXT," +FeedEntry.COLUMN_3 + " TEXT," +FeedEntry.COLUMN_4 +
                    FeedEntry.COLUMN_5 + " TEXT," +FeedEntry.COLUMN_6 + " TEXT," +
                    FeedEntry.COLUMN_7 + " TEXT," +FeedEntry.COLUMN_8 + " TEXT," +
                    " TEXT," +FeedEntry.COLUMN_9 + " TEXT)";

    protected static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + FeedEntry.TABLE_NAME;

}