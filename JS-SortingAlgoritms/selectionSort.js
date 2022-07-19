
function selectionSort(arr) {
    let min_index;
    let len = arr.length;

    for (let i = 0; i < len - 1; i++) {
        min_index = i;
        for (let j = i + 1; j < len; j++) {
            if (arr[j] < arr[min_index]) {
                min_index = j;
            }
        }
        [arr[i], arr[min_index]] = [arr[min_index], arr[i]];
    }

    return arr;
}

const arr = [28, 15, 49, 5, 18];

console.log(selectionSort(arr));

