package com.hp.hp.fixzr;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class Category_selection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_selection);
    }

    public void labour(View view) {
        LayoutInflater inflat=LayoutInflater.from(Category_selection.this);
        View cuslay=inflat.inflate(R.layout.labourloginalert,null);

        CardView cview=cuslay.findViewById(R.id.cdview);
        Button labourlginjava=cuslay.findViewById(R.id.buttonlabourlogin);
        Button labourregjava=cuslay.findViewById(R.id.labourregbtn);
        AlertDialog.Builder AB=new AlertDialog.Builder(Category_selection.this);
        AB.setView(cuslay);
        final AlertDialog A=AB.create();
        A.show();


    }

    public void user(View view) {
        LayoutInflater inflat=LayoutInflater.from(Category_selection.this);
        View cuslay=inflat.inflate(R.layout.userloginalert,null);

        CardView cview=cuslay.findViewById(R.id.cdview);
        Button userlginjava=cuslay.findViewById(R.id.buttonuserlogin);
        Button userregjava=cuslay.findViewById(R.id.userregbtn);
        AlertDialog.Builder AB=new AlertDialog.Builder(Category_selection.this);
        AB.setView(cuslay);
        final AlertDialog A=AB.create();
        A.show();
    }
}
