package org.autotelegram.ui.Charts.view_data;

import android.graphics.Paint;

import org.autotelegram.ui.Charts.BaseChartView;
import org.autotelegram.ui.Charts.data.ChartData;

public class StackLinearViewData extends LineViewData {

    public StackLinearViewData(ChartData.Line line) {
        super(line);
        paint.setStyle(Paint.Style.FILL);
        if (BaseChartView.USE_LINES) {
            paint.setAntiAlias(false);
        }
    }
}
