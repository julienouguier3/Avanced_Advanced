package edu.campusnum.visualsort.sort;

import edu.campusnum.visualsort.model.ObservableArray;

/**
 * Created by Web 74 all right reserved
 * User: vincent
 * Date: 27/07/2023
 * Time: 16:31
 */
public class SelectionSort implements SortAlgorithm {
    @Override
    public void sort(ObservableArray array, int d, int f) {

    }

    @Override
    public void sort(ObservableArray array) {

        int n = array.getLength();
        int i, j;
        for (i = 0; i < n; i++) {
            int min = i;
            for (j = i + 1; j < n; j++) {
                if (array.get(j) < array.get(min)) {
                    min = j;
                }
            }
            array.swap(i, min);
        }
    }

    @Override
    public void triFusion(ObservableArray array) {

    }
}