package com.example.rv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements SelectListner{


    RecyclerView recyclerView;
    List<MyModel> myModelList;

    CustomAdapter   customAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    displayItems();

    }

    private void displayItems() {

        recyclerView = findViewById(R.id.recycler_main);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));
        myModelList = new ArrayList<>();
        myModelList.add(new MyModel("Umair",25));

        myModelList.add(new MyModel("Asad",24));
        myModelList.add(new MyModel("Khan",23));
        myModelList.add(new MyModel("Saad",22));
        myModelList.add(new MyModel("Nauman",25));
        myModelList.add(new MyModel("Hamza",23));
        myModelList.add(new MyModel("Kamil",25));
        myModelList.add(new MyModel("Hshir",24));
        myModelList.add(new MyModel("Usama",23));
        myModelList.add(new MyModel("Noor",25));
        myModelList.add(new MyModel("Honey",24));
        myModelList.add(new MyModel("Sheroz",23));
        myModelList.add(new MyModel("Raffay",25));
        myModelList.add(new MyModel("Mustafa",24));

        customAdapter = new CustomAdapter(this,myModelList);
        recyclerView.setAdapter(customAdapter);

    }

    @Override
    public void onItemClicked(MyModel myModel) {
        Toast.makeText(this,myModel.getName(),Toast.LENGTH_SHORT).show();
    }
}