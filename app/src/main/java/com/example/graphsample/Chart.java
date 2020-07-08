package com.example.graphsample;

import android.content.res.Resources;

import com.example.graphsample.charts.Area3DChartActivity;
import com.example.graphsample.charts.AreaChartActivity;
import com.example.graphsample.charts.Bar3DChartActivity;
import com.example.graphsample.charts.BarChartActivity;
import com.example.graphsample.charts.BoxChartActivity;
import com.example.graphsample.charts.BubbleChartActivity;
import com.example.graphsample.charts.BubbleMapActivity;
import com.example.graphsample.charts.ChoroplethMapActivity;
import com.example.graphsample.charts.CircularGaugeActivity;
import com.example.graphsample.charts.Column3DChartActivity;
import com.example.graphsample.charts.ColumnChartActivity;
import com.example.graphsample.charts.CombinedChartActivity;
import com.example.graphsample.charts.ConnectorMapActivity;
import com.example.graphsample.charts.FunnelChartActivity;
import com.example.graphsample.charts.HeatMapChartActivity;
import com.example.graphsample.charts.HiloChartActivity;
import com.example.graphsample.charts.LineChartActivity;
import com.example.graphsample.charts.LinearColorScaleActivity;
import com.example.graphsample.charts.MekkoChartActivity;
import com.example.graphsample.charts.MosaicChartActivity;
import com.example.graphsample.charts.OHLCChartActivity;
import com.example.graphsample.charts.ParetoChartActivity;
import com.example.graphsample.charts.PertChartActivity;
import com.example.graphsample.charts.PieChartActivity;
import com.example.graphsample.charts.PointMapActivity;
import com.example.graphsample.charts.PolarChartActivity;
import com.example.graphsample.charts.PyramidActivity;
import com.example.graphsample.charts.QuadrantChartActivity;
import com.example.graphsample.charts.RadarChartActivity;
import com.example.graphsample.charts.RangeChartActivity;
import com.example.graphsample.charts.ResourceChartActivity;
import com.example.graphsample.charts.ScatterChartActivity;
import com.example.graphsample.charts.SunburstChartActivity;
import com.example.graphsample.charts.TagCloudActivity;
import com.example.graphsample.charts.ThermometerActivity;
import com.example.graphsample.charts.TreeMapChartActivity;
import com.example.graphsample.charts.TwoPiesOneColumnActivity;
import com.example.graphsample.charts.VennDiagramActivity;
import com.example.graphsample.charts.VerticalChartActivity;
import com.example.graphsample.charts.WaterfallChartActivity;
import com.example.graphsample.charts.WindDirectionActivity;
import com.example.graphsample.charts.WindSpeedActivity;

import java.util.ArrayList;

public class Chart {

    private String name;
    private Class activityClass;

    private Chart(String name, Class activityClass) {
        this.name = name;
        this.activityClass = activityClass;
    }

    public String getName() {
        return name;
    }

    Class getActivityClass() {
        return activityClass;
    }

    static ArrayList<Chart> createChartList(Resources resources) {
        ArrayList<Chart> chartList = new ArrayList<>();

        chartList.add(new Chart(resources.getString(R.string.pie_chart), PieChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.column_chart), ColumnChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.line_chart), LineChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.area_chart), AreaChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.bar_chart), BarChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.venn_diagram), VennDiagramActivity.class));
        chartList.add(new Chart(resources.getString(R.string.heat_map_chart), HeatMapChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.tag_cloud), TagCloudActivity.class));
        chartList.add(new Chart(resources.getString(R.string.waterfall_chart), WaterfallChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.tree_map_chart), TreeMapChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.circular_gauge), CircularGaugeActivity.class));
        chartList.add(new Chart(resources.getString(R.string.thermometer), ThermometerActivity.class));
        chartList.add(new Chart(resources.getString(R.string.linear_color_scale), LinearColorScaleActivity.class));
        chartList.add(new Chart(resources.getString(R.string.wind_speed), WindSpeedActivity.class));
        chartList.add(new Chart(resources.getString(R.string.wind_direction), WindDirectionActivity.class));
        chartList.add(new Chart(resources.getString(R.string.scatter_chart), ScatterChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.resource_chart), ResourceChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.radar_chart), RadarChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.polar_chart), PolarChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.range_chart), RangeChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.vertical_chart), VerticalChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.funnel_chart), FunnelChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.pert_chart), PertChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.combined_chart), CombinedChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.bubble_chart), BubbleChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.pareto_chart), ParetoChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.pyramid_chart), PyramidActivity.class));
        chartList.add(new Chart(resources.getString(R.string.box_chart), BoxChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.mosaic_chart), MosaicChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.mekko_chart), MekkoChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.bar3d_chart), Bar3DChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.column3d_chart), Column3DChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.area3d_chart), Area3DChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.hilo_chart), HiloChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.ohlc_chart), OHLCChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.quadrant_chart), QuadrantChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.sunburst_chart), SunburstChartActivity.class));
        chartList.add(new Chart(resources.getString(R.string.bubble_map), BubbleMapActivity.class));
        chartList.add(new Chart(resources.getString(R.string.choropleth_map), ChoroplethMapActivity.class));
        chartList.add(new Chart(resources.getString(R.string.point_map), PointMapActivity.class));
        chartList.add(new Chart(resources.getString(R.string.connector_map), ConnectorMapActivity.class));
        chartList.add(new Chart(resources.getString(R.string.two_pies_one_column), TwoPiesOneColumnActivity.class));
//        chartList.add(new Chart(resources.getString(R.string.gantt_chart), GanttChartActivity.class));

        return chartList;
    }

}
