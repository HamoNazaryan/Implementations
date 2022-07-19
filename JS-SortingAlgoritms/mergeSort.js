
function merge(left, right) {
    const sortedArr = [];

    while (left.length > 0 && right.length > 0) {
        if (left[0] < right[0]) {
            sortedArr.push(left.shift());
        } else {
            sortedArr.push(right.shift());
        }
    }
    return [...sortedArr, ...left, ...right];
}

function mergeSort(arr) {
    const half = arr.length / 2;

    if (arr.length <= 1) {
        return arr;
    }
    const left = arr.splice(0, half);
    const right = arr;
    return merge(mergeSort(left), mergeSort(right));
}



const arr = [28, 15, 49, 5, 18, 1, 8];
console.log(mergeSort(arr));
