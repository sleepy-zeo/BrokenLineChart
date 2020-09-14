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
        list.add(new LineChart.Data<>("08/14"));
        for (int i = 1; i < 30; ++i) {
            list.add(new LineChart.Data<>(""));
        }
        list.add(new LineChart.Data<>("09/14"));
        try {
            lineChart.setXAxisBasisData(list);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 决定实际显示的数据量，可动态增加
        final List<LineChart.Data<Float>> data = new LinkedList<>();
        data.add(new LineChart.Data<Float>(0f, "08/14"));
        data.add(new LineChart.Data<Float>(-1.21f, "08/15"));
        data.add(new LineChart.Data<Float>(-1.31f, "08/16"));
        data.add(new LineChart.Data<Float>(0.6f, "08/17"));
        data.add(new LineChart.Data<Float>(1.68f, "08/18"));
        data.add(new LineChart.Data<Float>(1.78f, "08/19"));
        data.add(new LineChart.Data<Float>(-0.7f, "08/20"));
        data.add(new LineChart.Data<Float>(-1.91f, "08/21"));
        data.add(new LineChart.Data<Float>(-1.11f, "08/22"));
        data.add(new LineChart.Data<Float>(2.14f, "08/23"));
        data.add(new LineChart.Data<Float>(2.11f, "08/24"));
        data.add(new LineChart.Data<Float>(0.07f, "08/25"));
        data.add(new LineChart.Data<Float>(1.51f, "08/26"));
        data.add(new LineChart.Data<Float>(3.05f, "08/27"));
        data.add(new LineChart.Data<Float>(2.01f, "08/28"));
        data.add(new LineChart.Data<Float>(4.52f, "08/29"));
        data.add(new LineChart.Data<Float>(4.56f, "08/30"));
        data.add(new LineChart.Data<Float>(3.12f, "08/31"));
        data.add(new LineChart.Data<Float>(2.14f, "09/01"));
        data.add(new LineChart.Data<Float>(-0.94f, "09/02"));
        data.add(new LineChart.Data<Float>(-1.07f, "09/03"));
        data.add(new LineChart.Data<Float>(-4.39f, "09/04"));
        data.add(new LineChart.Data<Float>(-4.79f, "09/05"));
        data.add(new LineChart.Data<Float>(-0.77f, "09/06"));
        try {
            lineChart.setData(data);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}