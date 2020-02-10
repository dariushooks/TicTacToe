package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    private Button firstCell;
    private Button secondCell;
    private Button thirdCell;
    private Button fourthCell;
    private Button fifthCell;
    private Button sixthCell;
    private Button seventhCell;
    private Button eighthCell;
    private Button ninthCell;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        initializeGrid();
    }

    private void initializeGrid()
    {
        firstCell = findViewById(R.id.firstCell);
        secondCell = findViewById(R.id.secondCell);
        thirdCell = findViewById(R.id.thirdCell);
        fourthCell = findViewById(R.id.fourthCell);
        fifthCell = findViewById(R.id.fifthCell);
        sixthCell = findViewById(R.id.sixthCell);
        seventhCell = findViewById(R.id.seventhCell);
        eighthCell = findViewById(R.id.eighthCell);
        ninthCell = findViewById(R.id.ninthCell);

        firstCell.setOnClickListener(this);
        secondCell.setOnClickListener(this);
        thirdCell.setOnClickListener(this);
        fourthCell.setOnClickListener(this);
        fifthCell.setOnClickListener(this);
        sixthCell.setOnClickListener(this);
        seventhCell.setOnClickListener(this);
        eighthCell.setOnClickListener(this);
        ninthCell.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        String text;
        switch (v.getId())
        {
            case R.id.firstCell:
                text = firstCell.getText().toString();
                if(text.equals("X"))
                    firstCell.setText("O");
                else if(text.equals("O"))
                    firstCell.setText("");
                else
                    firstCell.setText("X");
                break;

            case R.id.secondCell:
                text = secondCell.getText().toString();
                if(text.equals("X"))
                    secondCell.setText("O");
                else if(text.equals("O"))
                    secondCell.setText("");
                else
                    secondCell.setText("X");
                break;

            case R.id.thirdCell:
                text = thirdCell.getText().toString();
                if(text.equals("X"))
                    thirdCell.setText("O");
                else if(text.equals("O"))
                    thirdCell.setText("");
                else
                    thirdCell.setText("X");
                break;

            case R.id.fourthCell:
                text = fourthCell.getText().toString();
                if(text.equals("X"))
                    fourthCell.setText("O");
                else if(text.equals("O"))
                    fourthCell.setText("");
                else
                    fourthCell.setText("X");
                break;

            case R.id.fifthCell:
                text = fifthCell.getText().toString();
                if(text.equals("X"))
                    fifthCell.setText("O");
                else if(text.equals("O"))
                    fifthCell.setText("");
                else
                    fifthCell.setText("X");
                break;

            case R.id.sixthCell:
                text = sixthCell.getText().toString();
                if(text.equals("X"))
                    sixthCell.setText("O");
                else if(text.equals("O"))
                    sixthCell.setText("");
                else
                    sixthCell.setText("X");
                break;

            case R.id.seventhCell:
                text = seventhCell.getText().toString();
                if(text.equals("X"))
                    seventhCell.setText("O");
                else if(text.equals("O"))
                    seventhCell.setText("");
                else
                    seventhCell.setText("X");
                break;

            case R.id.eighthCell:
                text = eighthCell.getText().toString();
                if(text.equals("X"))
                    eighthCell.setText("O");
                else if(text.equals("O"))
                    eighthCell.setText("");
                else
                    eighthCell.setText("X");
                break;

            case R.id.ninthCell:
                text = ninthCell.getText().toString();
                if(text.equals("X"))
                    ninthCell.setText("O");
                else if(text.equals("O"))
                    ninthCell.setText("");
                else
                    ninthCell.setText("X");
                break;
        }
    }
}
