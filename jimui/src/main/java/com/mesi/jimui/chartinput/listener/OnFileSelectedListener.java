package com.mesi.jimui.chartinput.listener;


public interface OnFileSelectedListener {

    /**
     * Fires when selecting photo or video files in select photo mode.
     */
    void onFileSelected();

    /**
     * Fires when file was deselected in select photo mode.
     */
    void onFileDeselected();
}
