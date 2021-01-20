var unsortedArray = [2, 0, 9, 3, 4, 7, 1, 5];

function insertionSort(array)
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

