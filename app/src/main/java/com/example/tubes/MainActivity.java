package com.example.tubes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;

import com.example.tubes.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ActivityMainBinding binding;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.binding = ActivityMainBinding.inflate(this.getLayoutInflater());
        setContentView(binding.getRoot());
    }
    @Override
    public void onClick(View view) {
        binding.tvTitle.setCursorVisible(true);
        binding.tvTitle.setFocusableInTouchMode(true);
        binding.tvTitle.setInputType(InputType.TYPE_CLASS_TEXT);
        binding.tvTitle.requestFocus();
    }
    public void changePage(int page){
        FragmentTransaction ft =  this.fragmentManager.beginTransaction();
        if(page==1){
        } else if(page==2){
        } else if(page==0) {
            closeApplication();
        }
        ft.commit();
    }
    public void closeApplication(){
        moveTaskToBack(true);
        finish();
    }
}