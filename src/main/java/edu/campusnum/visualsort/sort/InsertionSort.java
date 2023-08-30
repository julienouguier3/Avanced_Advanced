package edu.campusnum.visualsort.sort;

import edu.campusnum.visualsort.model.ObservableArray;

/**
 * Created by Web 74 all right reserved
 * User: vincent
 * Date: 27/07/2023
 * Time: 14:55
 */
public class InsertionSort implements SortAlgorithm {
    @Override
    public void sort(ObservableArray array, int d, int f) {

    }

    @Override
    public void sort(ObservableArray array) {
//        throw new UnsupportedOperationException("Not implemented");
        int n = array.getLength();
        int i, j;
        for (i = 1; i < n; i++) {
            int temp = array.get(i);
            j = i;
            while (j > 0 && array.get(j - 1) > temp) {
                array.swap(j, j - 1);
                j = j-1;
            }


        }
    }

    @Override
    public void triFusion(ObservableArray array) {

    }

}
