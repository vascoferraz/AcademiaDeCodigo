var expect = require('expect.js');
var arraysAnswers = require('../src/05-arrays');

describe('arrays', function() {
    var a;

    beforeEach(function() {
        a = [1, 2, 3, 4];
    });

    it('you should be able to determine the location of an item in an array', function() {
        expect(arraysAnswers.indexOf(a, 3)).to.equal(2);
        expect(arraysAnswers.indexOf(a, 5)).to.equal(-1);
    });

    it('you should be able to sum the items of an array', function() {
        expect(arraysAnswers.sum(a)).to.equal(10);
    });

    it('you should be able to remove all instances of an item from an array without mutation', function() {
        a.push(2); // Make sure the value appears more than one time
        a.push(2); // Make sure the value appears more than one time in a row

        var result = arraysAnswers.remove(a, 2);

        expect(result).to.have.length(3);
        expect(result.join(' ')).to.equal('1 3 4');
        expect(result).to.not.equal(a);
    });

    it('you should be able to remove all instances of an item from an array, returning the original array', function() {
        a.splice(1, 0, 2);
        a.push(2);
        a.push(2);

        var result = arraysAnswers.removeWithoutCopy(a, 2);

        expect(result).to.have.length(3);
        expect(result.join(' ')).to.equal('1 3 4');

        // make sure that you return the same array instance
        expect(result).equal(a);
    });

    it('you should be able to add an item to the end of an array', function() {
        var result = arraysAnswers.append(a, 10);

        expect(result).to.have.length(5);
        expect(result[result.length - 1]).to.equal(10);
    });

    it('you should be able to remove the last item of an array', function() {
        var result = arraysAnswers.truncate(a);

        expect(result).to.have.length(3);
        expect(result.join(' ')).to.equal('1 2 3');
    });

    it('you should be able to add an item to the beginning of an array', function() {
        var result = arraysAnswers.prepend(a, 10);

        expect(result).to.have.length(5);
        expect(result[0]).to.equal(10);
    });

    it('you should be able to remove the first item of an array', function() {
        var result = arraysAnswers.curtail(a);

        expect(result).to.have.length(3);
        expect(result.join(' ')).to.equal('2 3 4');
    });

    it('you should be able to join together two arrays', function() {
        var c = ['a', 'b', 'c', 1];
        var result = arraysAnswers.concat(a, c);

        expect(result).to.have.length(8);
        expect(result.join(' ')).to.equal('1 2 3 4 a b c 1');
    });

    it('you should be able to add an item anywhere in an array', function() {
        var result = arraysAnswers.insert(a, 'z', 2);

        expect(result).to.have.length(5);
        expect(result.join(' ')).to.equal('1 2 z 3 4');
    });

    it('you should be able to count the occurences of an item in an array', function() {
        var result = arraysAnswers.count([9, 2, 4, 4, 3, 4, 3], 4);

        expect(result).to.equal(3);
    });

    it('you should be able to find duplicates in an array', function() {
        var result = arraysAnswers.duplicates([1, 2, 4, 4, 3, 3, 1, 5, 3]);

        expect(result.sort().join(' ')).to.equal('1 3 4');
    });

    it('you should be able to square each number in an array', function() {
        var result = arraysAnswers.square(a);

        expect(result).to.have.length(4);
        expect(result.join(' ')).to.equal('1 4 9 16');
    });

    it('you should be able to find all occurrences of an item in an array', function() {
        var result = arraysAnswers.findAllOccurrences([1, 2, 3, 4, 5, 6, 1, 7], 1);

        expect(result.sort().join(' ')).to.equal('0 6');
    });
});
