package edu.campusnum.visualsort.sort;

import edu.campusnum.visualsort.model.ObservableArray;

/**
 * Created by Web 74 all right reserved
 * User: vincent
 * Date: 27/07/2023
 * Time: 14:54
 */
public interface SortAlgorithm {

    void sort(ObservableArray array, int d, int f);

    public void sort(ObservableArray array);

    void triFusion(ObservableArray array);
}
