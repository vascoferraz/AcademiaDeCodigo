var unsortedArray = [9, 1, 3, 2, 4, 5, 7, 6, 77, 23, 11, 15];

function selectionSort(array)
{
  var i=0;
  var j=0;
  var temp=0;
  console.log(array.join(' - '));
  
  for (i=0 ; i<array.length ; i++) 
  {  
   
    for (j=0 ; j<array.length ; j++)
    {
  
     if (array[i] < array[j])
     //swap
     {
      temp = array[j];
      array[j] = array[i];
      array[i] = temp;    
     }   
      
    }
    console.log(array);
  }
    
}

insertionSort(unsortedArray);

