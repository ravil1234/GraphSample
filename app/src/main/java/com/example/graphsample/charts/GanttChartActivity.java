package com.example.graphsample.charts;

import android.os.Bundle;
import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.charts.Gantt;
import com.example.graphsample.R;
import androidx.appcompat.app.AppCompatActivity;

public class GanttChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        anyChartView.setProgressBar(findViewById(R.id.progress_bar));

        Gantt gantt = AnyChart.ganttProject();
        gantt.splitterPosition(320d);

        anyChartView.setChart(gantt);
    }

}
