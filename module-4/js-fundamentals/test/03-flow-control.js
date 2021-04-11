var expect = require('expect.js');
var flowControlAnswers = require('../src/03-flow-control');

describe('flow control', function() {

    it('you should be able to conditionally branch your code', function() {
        expect(flowControlAnswers.fizzBuzz()).to.be(false);
        expect(flowControlAnswers.fizzBuzz('foo')).to.be(false);
        expect(flowControlAnswers.fizzBuzz(2)).to.equal(2);
        expect(flowControlAnswers.fizzBuzz(101)).to.equal(101);

        expect(flowControlAnswers.fizzBuzz(3)).to.equal('fizz');
        expect(flowControlAnswers.fizzBuzz(6)).to.equal('fizz');
        expect(flowControlAnswers.fizzBuzz(4 * 3)).to.equal('fizz');
        expect(flowControlAnswers.fizzBuzz(8 * 3)).to.equal('fizz');

        expect(flowControlAnswers.fizzBuzz(5)).to.equal('buzz');
        expect(flowControlAnswers.fizzBuzz(10)).to.equal('buzz');
        expect(flowControlAnswers.fizzBuzz(4 * 5)).to.equal('buzz');
        expect(flowControlAnswers.fizzBuzz(8 * 5)).to.equal('buzz');

        expect(flowControlAnswers.fizzBuzz(15)).to.equal('fizzbuzz');
        expect(flowControlAnswers.fizzBuzz(4 * 3 * 5)).to.equal('fizzbuzz');
        expect(flowControlAnswers.fizzBuzz(8 * 3 * 5)).to.equal('fizzbuzz');
    });
});
