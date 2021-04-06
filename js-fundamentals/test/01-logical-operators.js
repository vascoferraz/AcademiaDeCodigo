var expect = require('expect.js');
var logicalOperatorsAnswers = require('../src/01-logical-operators');

describe('logical operators', function() {

    it('you should be able to work with logical or', function() {
        expect(logicalOperatorsAnswers.or(false, true)).to.be(true);
        expect(logicalOperatorsAnswers.or(true, false)).to.be(true);
        expect(logicalOperatorsAnswers.or(true, true)).to.be(true);
        expect(logicalOperatorsAnswers.or(false, false)).to.be(false);
        expect(logicalOperatorsAnswers.or(3, 4)).to.equal(3);
    });

    it('you should be able to work with logical and', function() {
        expect(logicalOperatorsAnswers.and(false, true)).to.be(false);
        expect(logicalOperatorsAnswers.and(false, false)).to.be(false);
        expect(logicalOperatorsAnswers.and(true, false)).to.be(false);
        expect(logicalOperatorsAnswers.and(true, true)).to.be(true);
        expect(logicalOperatorsAnswers.and(3, 4)).to.equal(4);
    });
});
