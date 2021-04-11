var expect = require('expect.js');
var stringsAnswers = require('../src/06-strings');

describe('strings', function() {

    it('you should be able to reduce duplicate characters to a desired minimum', function() {
        expect(stringsAnswers.reduceString('aaaabbbb', 2)).to.equal('aabb');
        expect(stringsAnswers.reduceString('xaaabbbb', 2)).to.equal('xaabb');
        expect(stringsAnswers.reduceString('aaaabbbb', 1)).to.equal('ab');
        expect(stringsAnswers.reduceString('aaxxxaabbbb', 2)).to.equal('aaxxaabb');
    });

    it('you should be able to wrap lines at a given number of columns, without breaking words', function() {

        var wrapCol = 5;
        var inputStrings = [
            'abcdef abcde abc def',
            'abc abc abc',
            'a b c def'
        ];
        var outputStrings = [
            'abcdef\nabcde\nabc def',
            'abc abc\nabc',
            'a b c\ndef'
        ];
        var formattedStr;

        inputStrings.forEach(function(str, index) {
            formattedStr = stringsAnswers.wordWrap(str, wrapCol);
            expect(formattedStr).to.equal(outputStrings[index]);
        });
    });

    it('you should be able to reverse a string', function() {

        var inputStrings = [
            'abc',
            'i am a string of characters',
            'A man, a plan, a canal: Panama'
        ];
        var outputStrings = [
            'cba',
            'sretcarahc fo gnirts a ma i',
            'amanaP :lanac a ,nalp a ,nam A'
        ];

        inputStrings.forEach(function(str, index) {
            var result = stringsAnswers.reverseString(str);
            expect(result).to.equal(outputStrings[index]);
        });
    });

    it('you should be able to check if string is palindrome', function() {
        expect(stringsAnswers.palindrome('a')).to.be(true);
        expect(stringsAnswers.palindrome('ab')).to.be(false);
        expect(stringsAnswers.palindrome('abba')).to.be(true);
        expect(stringsAnswers.palindrome('abcba')).to.be(true);
        expect(stringsAnswers.palindrome('abbax')).to.be(false);
        expect(stringsAnswers.palindrome('abcbax')).to.be(false);

    });
});
