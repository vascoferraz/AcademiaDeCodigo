var unsortedArray = ["red", "white", "red", "white", "white", "white", "white", "white"];

function linearSearch(array, keyword)
{
    for(var i = 0 ; i < array.length; i++)
    {
        if(array[i] === keyword)
        {
            console.log("Keyword to find: " + keyword + " | Position inside the array: " + i);
        }
    }
}

linearSearch(unsortedArray, "white");
