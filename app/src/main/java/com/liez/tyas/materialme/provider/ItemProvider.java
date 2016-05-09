package com.liez.tyas.materialme.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.Nullable;

import com.liez.tyas.materialme.entity.ExItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tyasrus on 09/05/16.
 */
public class ItemProvider extends ContentProvider {

    private List<ExItem> exItems;

    //TODO use this contentprovider to showing list in an activity

    @Override
    public boolean onCreate() {
        exItems = new ArrayList<>();
        return false;
    }

    @Nullable
    @Override
    public Cursor query(Uri uri, String[] strings, String s, String[] strings1, String s1) {
        return null;
    }

    @Nullable
    @Override
    public String getType(Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override
    public int delete(Uri uri, String s, String[] strings) {
        return 0;
    }

    @Override
    public int update(Uri uri, ContentValues contentValues, String s, String[] strings) {
        return 0;
    }
}
