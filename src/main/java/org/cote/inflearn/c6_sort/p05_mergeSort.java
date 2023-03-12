package org.cote.inflearn.c6_sort;

public class p05_mergeSort {
    public static void mergeSort(int[] arr) {
        sort(arr, 0, arr.length);
    }

    private static void sort(int[] arr, int low, int high) {
        if (high - low < 2) {
            return;
        }

        // 크기가 1보다 큰 경우
        int mid = (low + high) / 2;
        sort(arr, 0, mid); // 일단 반으로 나누고 나중에 합쳐서 정렬
        sort(arr, mid, high);
        merge(arr, low, mid, high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low];
        int t = 0, l = low, h = mid;
        
        // 작은 순서대로 배열에 삽입
        while (l < mid && h < high) {
            if (arr[l] < arr[h]) {
                temp[t++] = arr[l++];
            } else {
                temp[t++] = arr[h++];
            }
        }
        
        // 남은 데이터도 삽입
        while (l < mid) {
            temp[t++] = arr[l++];
        }

        while (h < high) {
            temp[t++] = arr[h++];
        }

        // 정렬된 배열을 삽입
        for (int i = low; i < high; i++) {
            arr[i] = temp[i - low];
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 6, 5, 8, 3, 5, 9, 1};
        mergeSort(arr);
        for (int x : arr)
            System.out.print(x + " ");
    }
}
