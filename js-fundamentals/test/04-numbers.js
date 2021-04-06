var expect = require('expect.js');
var numbersAnswers = require('../src/04-numbers');

describe('numbers', function() {

    it('you should be able to return the decimal representation of a binary string', function() {
        expect(numbersAnswers.binaryToDecimal('11000000')).to.equal(192);
    });

    it('you should be able to add with a precision of 2', function() {
        expect(numbersAnswers.add(0.1, 0.2)).to.equal(0.3);
        expect(numbersAnswers.add(0.01, 0.02)).to.equal(0.03);
    });

    it('you should be able to multiply with a precision of 4', function() {
        expect(numbersAnswers.multiply(3, 0.1)).to.equal(0.3);
        expect(numbersAnswers.multiply(3, 0.2)).to.equal(0.6);
        expect(numbersAnswers.multiply(3, 0.0001)).to.equal(0.0003);
        expect(numbersAnswers.multiply(0.0002, 0.0001)).to.equal(0.00000002);
    });
});
