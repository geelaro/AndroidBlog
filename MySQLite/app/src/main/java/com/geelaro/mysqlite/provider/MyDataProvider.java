package com.geelaro.mysqlite.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;

/**
 * Created by Lee on 2017/4/13.
 * My Data ContentProvider
 */

public class MyDataProvider extends ContentProvider {

    private static final int NEWS = 1;
    private static final int NEWS_ID = 11;
    private static final int NEWS_TITLE = 12;
    private static final int NEWS_CONTEXT = 13;
    private static final int NEWS_PUBLISH = 14;
    private static final int NEWS_COMMENTSCOUNT = 15;

    //
    private static final int COMMENTS = 2;
    private static final int COMMENTS_ID = 21;
    private static final int COMMENTS_CONTEXT = 22;
    private static final int COMMENTS_PUBLISHDATE = 23;

    private MySQLiteHelper dbHelper;


    private static final UriMatcher sUriMatch = new UriMatcher(UriMatcher.NO_MATCH);

    static {
<<<<<<< HEAD
=======
<<<<<<< HEAD
        sUriMatch.addURI("media", "news", NEWS);
        sUriMatch.addURI("media", "news/#", NEWS_ID);
        sUriMatch.addURI("media", "news/#/title", NEWS_TITLE);
        sUriMatch.addURI("media", "news/#/context", NEWS_CONTEXT);
        sUriMatch.addURI("media", "news/#/publishdate", NEWS_PUBLISH);
        sUriMatch.addURI("media", "new/#/commentcount", NEWS_COMMENTSCOUNT);

        sUriMatch.addURI("media", "comments", COMMENTS);
        sUriMatch.addURI("media", "comments/#", COMMENTS_ID);
        sUriMatch.addURI("media", "comments/#/context", COMMENTS_CONTEXT);
        sUriMatch.addURI("media", "comments/#/publishdate", COMMENTS_PUBLISHDATE);
=======
>>>>>>> 0fc02281fb84eb8fa6f8baa93b76467c84c1a2e4
        sUriMatch.addURI(MediaContract.CONTENT_AUTHORITY, "news", NEWS);
        sUriMatch.addURI(MediaContract.CONTENT_AUTHORITY, "news/#", NEWS_ID);
        sUriMatch.addURI(MediaContract.CONTENT_AUTHORITY, "news/#/title", NEWS_TITLE);
//        sUriMatch.addURI(MediaContract.CONTENT_AUTHORITY, "news/#/context", NEWS_CONTEXT);
//        sUriMatch.addURI(MediaContract.CONTENT_AUTHORITY, "news/#/publishdate", NEWS_PUBLISH);
//        sUriMatch.addURI(MediaContract.CONTENT_AUTHORITY, "new/#/commentcount", NEWS_COMMENTSCOUNT);

        sUriMatch.addURI(MediaContract.CONTENT_AUTHORITY, "comments", COMMENTS);
        sUriMatch.addURI(MediaContract.CONTENT_AUTHORITY, "comments/#", COMMENTS_ID);
//        sUriMatch.addURI(MediaContract.CONTENT_AUTHORITY, "comments/#/context", COMMENTS_CONTEXT);
//        sUriMatch.addURI(MediaContract.CONTENT_AUTHORITY, "comments/#/publishdate", COMMENTS_PUBLISHDATE);
<<<<<<< HEAD
=======
>>>>>>> 3ec1e9c85e62039460d9b285c6b6ac8f3184ddbf
>>>>>>> 0fc02281fb84eb8fa6f8baa93b76467c84c1a2e4


    }

    @Override
    public boolean onCreate() {
        dbHelper = new MySQLiteHelper(getContext());
        return true;
    }


    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        Cursor cursor = null;
        switch (sUriMatch.match(uri)) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
            case NEWS_TITLE:
                cursor = db.query(MediaContract.NewsEntry.TABLE_NAME, projection, selection, selectionArgs, sortOrder, null, null);
                break;
=======
>>>>>>> 0fc02281fb84eb8fa6f8baa93b76467c84c1a2e4
            case NEWS:
                cursor = db.query(MediaContract.NewsEntry.TABLE_NAME, projection, selection, selectionArgs, sortOrder, null, null);
                break;
            case NEWS_ID:
                cursor=db.query(MediaContract.NewsEntry.TABLE_NAME,projection,"id=?",new String[]{"1"},null,null,sortOrder);
                break;
            default:
                throw new IllegalArgumentException("Error Uri: " + uri);
<<<<<<< HEAD
=======
>>>>>>> 3ec1e9c85e62039460d9b285c6b6ac8f3184ddbf
>>>>>>> 0fc02281fb84eb8fa6f8baa93b76467c84c1a2e4
        }
        return cursor;
    }


    @Override
    public String getType(Uri uri) {
        return null;
    }


    @Override
    public Uri insert(Uri uri, ContentValues values) {
        return null;
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        return 0;
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        return 0;
    }
}
