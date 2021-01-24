var unsortedArray = [2, 0, 9, 3, 4, 7, 1, 5];

function insertionSort(array) {

	var i=0;	
	
	for (i=0 ; i<array.length ; i++)
	{  
	  if (array[i+1] < array[i])
	  {
	    var temp = array[i];
	    array[i] = array[i+1];
	    array[i+1] = temp;
	    i=0;
	  }  	 
	 
	  console.log(array); 
	}

}
  
insertionSort(unsortedArray);

