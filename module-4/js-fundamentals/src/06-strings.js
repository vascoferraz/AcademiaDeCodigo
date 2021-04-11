/**
 * Reduce duplicate characters to a desired minimum
 */
exports.reduceString = function(str, amount) {
        var count = 0;
        var result = '';
        for (var i = 0; i < str.length; i++) {
          if (str[i] === str[i+1]) {
            count++;
            if (count < amount) {
              result += str[i];
            }
          } else {
            count = 0;
            result += str[i];
          } 
        };
        return result;
      
};

/**
 * Wrap lines at a given number of columns without breaking words
 */
exports.wordWrap = function(str, cols) {
    
};

/**
 * Reverse a String
 */
exports.reverseString = function(str) {

        var splitString = str.split("");
     
        var reverseArray = splitString.reverse();
     
        var reverseString = reverseArray.join("");

        return reverseString;
    
};

/**
 * Check if String is a palindrome
 */
exports.palindrome = function(str) {

    var splitString = str.split("");
     
    var reverseArray = splitString.reverse();
 
    var reverseString = reverseArray.join("");

    if (str == reverseString) {
        return true;
    }
    else return false;

};
