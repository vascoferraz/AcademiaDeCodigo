/**
 * Creates a counter module with an initial value, zero if not provided
 */
exports.createCounter = function(counter) {
};

/**
 * Creates a person module with name and age
 * An initial name value should be provided and
 * an exception thrown if not
 */
exports.createPerson = function(name) {

    return {
        age: 0,
        name: name,
    };
};
