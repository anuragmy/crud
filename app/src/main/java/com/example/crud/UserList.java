package com.example.crud;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;

import java.util.List;

public class UserList extends ArrayAdapter<User> {

    private Activity context;
    private List<User> users;
    DatabaseReference databaseReference;
    EditText editName;

    public UserList(@androidx.annotation.NonNull Activity context, List<User> users , DatabaseReference databaseReference, EditText editName) {
        super(context, R.layout.user_list,users);
        this.context = context;
        this.users = users;
        this.databaseReference = databaseReference;
        this.editName = editName;
    }

    public View getView(int pos, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.user_list,null , true);

        TextView textName = (TextView) listViewItem.findViewById(R.id.textname);


    }
}
