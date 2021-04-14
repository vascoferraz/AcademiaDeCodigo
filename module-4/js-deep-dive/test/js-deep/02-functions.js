var expect = require('expect.js');
var functionsAnswers = require('../../src/02-functions');

describe('functions', function() {

    var say = function(greeting, name, punctuation) {
        called = true;
        return greeting + ', ' + name + (punctuation || '!');
    };

    beforeEach(function() {
        called = false;
    });

    it('you should be able to use an array as arguments when calling a function', function() {

        var result = functionsAnswers.argsAsArray(say, ['Hello', 'EY', '!!']);
        expect(result).to.equal('Hello, EY!!');
        expect(called).to.be(true);
    });

    it('you should be able to change the context in which a function is called', function() {

        var speak = function() {
            return say(this.greeting, this.name, '!!!');
        };
        var obj = {
            greeting: 'Hello',
            name: 'Rui'
        };

        var result = functionsAnswers.speak(speak, obj);
        expect(result).to.equal('Hello, Rui!!!');
        expect(called).to.be(true);
    });

    it('you should be able to return a string prefixer', function() {
        expect(functionsAnswers.stringPrefixer('Hello, ')('world')).to.equal('Hello, world');
        expect(functionsAnswers.stringPrefixer('Hey, ')('can I have a function?')).to.equal('Hey, can I have a function?');
    });

    it('you should be able to use closures to create an array of result producing functions', function() {

        var arr = [Math.random(), Math.random(), Math.random(), Math.random()];
        var square = function(x) {
            return x * x;
        };

        var funcs = functionsAnswers.makeResultFunctions(arr, square);
        expect(funcs).to.have.length(arr.length);

        arr.forEach(function(value, index) {
            expect(funcs[index]()).to.equal(square(value));
        });
    });

    it('you should be able to create a partial function', function() {
        var partial = functionsAnswers.createWrapperFunction(say, 'Hello', 'AC');
        expect(partial('!!!')).to.equal('Hello, AC!!!');
        expect(called).to.be(true);
    });

    it('you should be able to sum all arguments', function() {
        var a = Math.random();
        var b = Math.random();
        var c = Math.random();
        var d = Math.random();

        expect(functionsAnswers.sumArguments(a)).to.equal(a);
        expect(functionsAnswers.sumArguments(a, b)).to.equal(a + b);
        expect(functionsAnswers.sumArguments(a, b, c)).to.equal(a + b + c);
        expect(functionsAnswers.sumArguments(a, b, c, d)).to.equal(a + b + c + d);
    });

    it('you should be able to apply functions with arbitrary numbers of arguments', function() {

        var a = Math.random();
        var b = Math.random();
        var c = Math.random();

        var twoArgumentsCalled = false;
        var twoArguments = function(firstArgument, secondArgument) {
            expect(arguments.length).to.equal(2);
            expect(firstArgument).to.equal(a);
            expect(secondArgument).to.equal(b);

            twoArgumentsCalled = true;
        };

        var threeArgumentsCalled = false;
        var threeArguments = function(firstArgument, secondArgument, thirdArgument) {
            expect(arguments.length).to.equal(3);
            expect(firstArgument).to.equal(a);
            expect(secondArgument).to.equal(b);
            expect(thirdArgument).to.equal(c);

            threeArgumentsCalled = true;
        };

        functionsAnswers.callIt(twoArguments, a, b);
        functionsAnswers.callIt(threeArguments, a, b, c);

        expect(twoArgumentsCalled).to.be(true);
        expect(threeArgumentsCalled).to.be(true);
    });

    it('you should be able to create a "partial" function for variable number of applied arguments', function() {
        var partialMe = function(x, y, z) {
            return x / y * z;
        };

        var a = Math.random();
        var b = Math.random();
        var c = Math.random();
        expect(functionsAnswers.createAddArgumentsFunction(partialMe)(a, b, c)).to.equal(partialMe(a, b, c));
        expect(functionsAnswers.createAddArgumentsFunction(partialMe, a)(b, c)).to.equal(partialMe(a, b, c));
        expect(functionsAnswers.createAddArgumentsFunction(partialMe, a, b)(c)).to.equal(partialMe(a, b, c));
        expect(functionsAnswers.createAddArgumentsFunction(partialMe, a, b, c)()).to.equal(partialMe(a, b, c));
    });

});
