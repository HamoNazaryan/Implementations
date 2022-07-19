function quickSort(arr) {
    if (arr.length < 2) {
        return arr
    }
    let pivot = arr.pop();

    const [smaller, larger] = [[], []];

    arr.forEach(item => {
        if (item < pivot) {
            smaller.push(item);
        } else {
            larger.push(item);
        }
    })

    return [...quickSort(smaller), pivot, ...quickSort(larger)]
}
const arr = [28, 15, 49, 5, 18, 1, 8];
console.log(quickSort(arr));
