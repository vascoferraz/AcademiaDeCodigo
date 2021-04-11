var expect = require('expect.js');
var bestPracticesAnswers = require('../src/02-best-practices');

describe('best practices', function() {

    it('you should avoid global variables', function() {
        expect(bestPracticesAnswers.getUser()).to.be.an('object');
        expect(bestPracticesAnswers.getUser().name).to.equal('Pedro');
        expect(bestPracticesAnswers.getUser().email).to.equal('pedro.antoninho@academiadecodigo.org');
        expect(global.myObject).to.be(undefined);
    });

    it('you should use parseInt correctly', function() {
        expect(bestPracticesAnswers.parseNumber('12')).to.equal(12);
        expect(bestPracticesAnswers.parseNumber('12px')).to.equal(12);
        expect(bestPracticesAnswers.parseNumber('0x12')).to.equal(0);
    });

    it('you should understand strict comparison', function() {
        expect(bestPracticesAnswers.isEqual(1, '1')).to.be(false);
        expect(bestPracticesAnswers.isEqual(1, 1)).to.be(true);
        expect(bestPracticesAnswers.isEqual(0, false)).to.be(false);
    });
});

