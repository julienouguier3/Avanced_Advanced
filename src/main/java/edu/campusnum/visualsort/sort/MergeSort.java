package edu.campusnum.visualsort.sort;

import edu.campusnum.visualsort.model.ObservableArray;

/**
 * Created by Web 74 all right reserved
 * User: vincent
 * Date: 27/07/2023
 * Time: 16:31
 */
public class MergeSort implements SortAlgorithm {


    public void sort(ObservableArray array, int d, int f) {
        int q = (d + f) / 2;
        if (d < f) {
            sort(array, d, q);
            sort(array, q + 1, f);
            fusion(array, array);
        }

    }


    public void fusion(ObservableArray array1, ObservableArray array2) {
        int tab1 = array1.getLength();
        int tab2 = array2.getLength();
        int i = (tab1 / 2) - 1;
        int n = (tab1 / 2) + 1;
        int j = (tab2 / 2) - 1;
        int m = (tab2 / 2) + 1;
        int k = 1;

        while (i < n && j < m) {
            if (array1.get(i) < array2.get(j)) {
                k = array1.get(i);
                k = k + 1;
                i = i + 1;
            } else {
                k = array2.get(j);
                k = k + 1;
                j = j + 1;
            }
        }

        while (i == n) {
            k = array1.get(i);
            k = k + 1;
            i = i + 1;
        }

        while (j == m) {
            k = array2.get(j);
            k = k + 1;
            j = j + 1;
        }
    }


    @Override
    public void sort(ObservableArray array) {

    }

    @Override
    public void triFusion(ObservableArray array) {

    }

}

