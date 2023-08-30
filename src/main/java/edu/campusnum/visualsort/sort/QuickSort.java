package edu.campusnum.visualsort.sort;

import edu.campusnum.visualsort.model.ObservableArray;

/**
 * Created by Web 74 all right reserved
 * User: vincent
 * Date: 27/07/2023
 * Time: 16:31
 */
public class QuickSort implements SortAlgorithm {
    @Override
    public void sort(ObservableArray array, int d, int f) {
//        throw new UnsupportedOperationException("Not implemented");
        if (d < f) {
            int q = partition(array, d, f);
            sort(array, d, q - 1);
            sort(array, q + 1, f);

        }
    }

    public int partition(ObservableArray array, int d, int f) {
        int pivot = array.get(f);
        int i = d - 1;
        for (int j = d; j < f - 1; j++) {
            if (array.get(i) <= pivot) {
                i = i + 1;
                array.swap(array.get(i), array.get(j));
                j = j + 1;
            }
        }
        array.swap(array.get(i + 1), array.get(f));
        return i + 1;
    }


    @Override
    public void sort(ObservableArray array) {

    }

    @Override
    public void triFusion(ObservableArray array) {

    }
}
