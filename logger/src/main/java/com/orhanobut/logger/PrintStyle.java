package com.orhanobut.logger;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * @author Kale
 * @date 2016/12/8
 */

public abstract class PrintStyle {

    private LogPrinter printer;

    public void setPrinter(LogPrinter printer) {
        this.printer = printer;
    }

    @Nullable
    protected abstract String beforePrint();

    @NonNull
    protected abstract String printLog(String message, int line, int wholeLineCount);

    @Nullable
    protected abstract String afterPrint();

    public Settings getSettings() {
        return printer.getSettings();
    }

    public LogPrinter getPrinter() {
        return printer;
    }
}
