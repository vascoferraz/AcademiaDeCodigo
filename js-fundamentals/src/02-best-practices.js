/**
 * Best Practices
 */

/**
 * Obtain user details
 */
//FIXME: there is an issue with this implementation, please fix it
exports.getUser = function() {

    var user = {name:"Pedro", email:"pedro.antoninho@academiadecodigo.org"};
    return user;
};

/**
 * Convert String to Number
 */
exports.parseNumber = function(num) {
    return parseInt(num,10);
};

/**
 * Tests for equality 
 */
exports.isEqual = function(val1, val2) {
    return val1 === val2;

};
