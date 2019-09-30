package com.example.nest2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    RecyclerView outerRecycle;
    ParentAdapter parentAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Parent> parentList = new ArrayList<>();
        ArrayList<Child> childList = new ArrayList<>();
        ArrayList<Child> childList2 = new ArrayList<>();
        childList.add(new Child("Android",R.drawable.item1));
        childList.add(new Child("Khataro",R.drawable.item2));
        childList.add(new Child("Plane",R.drawable.item3));
        childList.add(new Child("Fingerprint",R.drawable.item4));
        childList.add(new Child("PhoneSet",R.drawable.item5));
        childList.add(new Child("Heart",R.drawable.item6));
        childList.add(new Child("Flower",R.drawable.item7));
        childList.add(new Child("Thumb Up",R.drawable.item8));
        childList.add(new Child("Aaaaag",R.drawable.item9));
        childList.add(new Child("Lamp",R.drawable.item10));


        childList2.add(new Child("Lamp",R.drawable.item10));
        childList2.add(new Child("Aaaaag",R.drawable.item9));
        childList2.add(new Child("Thumb Up",R.drawable.item8));
        childList2.add(new Child("Flower",R.drawable.item7));
        childList2.add(new Child("Heart",R.drawable.item6));
        childList2.add(new Child("PhoneSet",R.drawable.item5));
        childList2.add(new Child("Fingerprint",R.drawable.item4));
        childList2.add(new Child("Plane",R.drawable.item3));
        childList2.add(new Child("Khataro",R.drawable.item2));
        childList2.add(new Child("Android",R.drawable.item1));


        parentList.add(new Parent("Phase: 1",childList));
        parentList.add(new Parent("Phase: 2",childList2));
        parentList.add(new Parent("Phase: 3",childList));
        parentList.add(new Parent("Phase: 4",childList2));
        parentList.add(new Parent("Phase: 5",childList));
        parentList.add(new Parent("Phase: 6",childList2));
        parentList.add(new Parent("Phase: 7",childList));
        parentList.add(new Parent("Phase: 8",childList2));
        parentList.add(new Parent("Phase: 9",childList));
        parentList.add(new Parent("Phase: 10",childList2));

        outerRecycle = findViewById(R.id.outerrecyclerview);
        outerRecycle.setLayoutManager(new LinearLayoutManager(this));
        outerRecycle.setHasFixedSize(true);
        parentAdapter = new ParentAdapter(new OuterList(parentList),MainActivity.this);
        outerRecycle.setAdapter(parentAdapter);

    }
}
