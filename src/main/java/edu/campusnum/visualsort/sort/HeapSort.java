package edu.campusnum.visualsort.sort;

import edu.campusnum.visualsort.model.ObservableArray;

/**
 * Created by Web 74 all right reserved
 * User: vincent
 * Date: 27/07/2023
 * Time: 16:31
 */
public class HeapSort implements SortAlgorithm{

    @Override
    public void sort(ObservableArray array, int d, int f) {

    }

    @Override
    public void sort(ObservableArray array) {
    planner(array);
    int a = array.getLength();
    for (int i= a-1; i > 0; i--){
        array.swap(0, i);
        backdown(array,i,0);
    }
    }

    @Override
    public void triFusion(ObservableArray array) {

    }

    public void planner(ObservableArray array) {
    for (int i=0; i < array.getLength() -1; i++){
        backup(array,i);
    }
    }

    public void backup(ObservableArray array, int i) {
        if (array.get(i) > array.get(i/2)){
            array.swap(i, i/2);
            backup(array, i/2);
        }

    }

    public void backdown(ObservableArray array, int e, int i) {
        int f = 2*i+1;
        int max=0;
        if (f < e) {

            if (array.get(f) > array.get(2*i)){
               max = f;
            }
            else{
                max = (2*i);
            }
            if (array.get(max) > array.get(i)){
                array.swap(max, i);
                backdown(array,e,max);
            }

        }
    }
}
