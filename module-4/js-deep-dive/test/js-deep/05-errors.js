var expect = require('expect.js');
var errorAnswers = require('../../src/05-errors');

describe('errors', function() {

    it('you should be able to catch an exception and return the error message when calling a function', function() {

        var errorMessage = 'an error message';
        var called = false;
        var result = errorAnswers.callIt(function() {
            called = true;
            throw new Error(errorMessage);
        });

        expect(result).to.equal(errorMessage);
        expect(called).to.be(true);

        called = false;
        result = errorAnswers.callIt(function() {
            called = true;
            return 'ok';
        });

        expect(result).to.equal('ok');
        expect(called).to.be(true);
    });

    it('you should be able to throw an error object with an enclosed message', function() {

        expect(errorAnswers.assertEqual('abc', 'abc')).to.equal(true);
        expect(errorAnswers.assertEqual(1, 1)).to.equal(true);
        expect(errorAnswers.assertEqual(0, 0)).to.equal(true);

        expect(errorAnswers.assertEqual).withArgs('abc', 'cba').to.throwException();
        expect(errorAnswers.assertEqual).withArgs(0, '0').to.throwException();
        expect(errorAnswers.assertEqual).withArgs(0, 1).to.throwException();

        expect(errorAnswers.assertEqual).withArgs(null, undefined).to.throwException(function(error) {
            expect(error).to.be.an(Error);
            expect(error.message).to.be.a('string');
        });
    });

    it('you should be able to create a custom error', function() {

        var errorMessage = 'an error message';
        var CustomError = errorAnswers.createCustomError();

        var ts1 = Date.now();
        var error = new CustomError(errorMessage);
        var ts2 = Date.now();

        expect(error).to.be.an(Error);
        expect(error).to.be.a(CustomError);
        expect(error.message).to.equal(errorMessage);
        expect(error.name).to.be.a('string');
        expect(error.stack).to.be.a('string');

        expect(error.timestamp).to.be.a('number');
        expect(error.timestamp).to.be.within(ts1, ts2);
    });

});
