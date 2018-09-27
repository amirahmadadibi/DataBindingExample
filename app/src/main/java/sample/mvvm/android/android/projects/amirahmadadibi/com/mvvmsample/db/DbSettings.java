package sample.mvvm.android.android.projects.amirahmadadibi.com.mvvmsample.db;

import android.provider.BaseColumns;

public class DbSettings {
        public static final String DB_NAME = "favoraites.db";
        public static final int DB_VERSION = 1;

        public class DBEntry implements BaseColumns{
            public static final String TABLE = "fav";
            public static final String COL_FAV_URL = "url";
            public static final String COL_FAV_DATA = "date";
        }


}
