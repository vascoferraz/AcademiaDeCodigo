var unsortedArray = [9, 1, 3, 2, 4, 5, 7, 6, 77, 99, 11, 15];

function selectionSort(array) {

    let n = array.length;
    console.log(array);
        
    for(let i = 0; i < n; i++) {
        // Finding the smallest number in the subarray
        let min = i;
        
        for(let j = i+1; j < n; j++){
            
            if(array[j] < array[min]) {
                min=j;
            }
         }
         
         if (min != i) {
             // Swapping the elements
             let tmp = array[i]; 
             array[i] = array[min];
             array[min] = tmp;      
        }
        
        console.log(array);
    }
    
}

selectionSort(unsortedArray);
