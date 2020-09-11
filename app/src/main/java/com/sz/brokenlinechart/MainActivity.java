package com.sz.brokenlinechart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private LineChart lineChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 决定横轴的最大的数据量
        lineChart = findViewById(R.id.line_chart);
        final List<LineChart.Data<String>> list = new LinkedList<>();
        list.add(new LineChart.Data<>("00:00"));
        for (int i = 1; i < 24; ++i) {
            list.add(new LineChart.Data<>(""));
        }
        list.add(new LineChart.Data<>("23:59"));
        try {
            lineChart.setXAxisBasisData(list);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 决定实际显示的数据量，可动态增加
        final List<LineChart.Data<Float>> data = new LinkedList<>();
        data.add(new LineChart.Data<Float>(3.37f, "00:00"));
        data.add(new LineChart.Data<Float>(2.52f, "00:01"));

        data.add(new LineChart.Data<Float>(2.54f, "00:02"));
        data.add(new LineChart.Data<Float>(2.55f, "00:03"));
        data.add(new LineChart.Data<Float>(2.57f, "00:04"));
        data.add(new LineChart.Data<Float>(0.34f, "00:05"));
        try {
            lineChart.setData(data);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}