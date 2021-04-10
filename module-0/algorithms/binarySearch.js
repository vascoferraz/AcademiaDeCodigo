var incrementalArray = [0, 1, 2, 4, 6, 7, 9];

function binarySearch(array, number)
{
    var start = 0;
    var end = array.length - 1;

    while (start <= end)
    {
    
     var center = Math.floor((start + end) / 2);
     
     if (array[center] === number)
     {
      console.log("Number " + number + " is on position " + center);
      return number;
     }
     
     else if (array[center] < number)
     {
      start = center + 1;   
     }
     
     else if (array[center] > number)
     {
      end = center - 1;
     }
    
    }

    console.log("Number " + number + " does not exist on the array");
    return 0;
}

binarySearch(incrementalArray, 7);

