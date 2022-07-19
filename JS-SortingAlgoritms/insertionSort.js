function insertionSort(arr) {
    for (let i = 1; i < arr.length; i++) {
        key = arr[i];
        j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }
    return arr;
}

const arr = [28, 15, 49, 5, 18, 1];
console.log(insertionSort(arr));