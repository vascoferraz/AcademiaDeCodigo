var expect = require('expect.js');
var modulesAnswers = require('../../src/01-modules');

describe('modules', function() {

    it('you should be able to create a function that returns a counter module', function() {

        var counter = modulesAnswers.createCounter(99);
        expect(counter.counter).to.be(undefined);
        expect(counter).to.only.have.keys('get', 'increment', 'reset');
        expect(counter.get).to.be.a('function');
        expect(counter.increment).to.be.a('function');
        expect(counter.reset).to.be.a('function');
        expect(counter.get()).to.equal(99);

        counter.increment();
        expect(counter.get()).to.equal(100);

        counter.reset();
        expect(counter.get()).to.equal(0);

        counter = modulesAnswers.createCounter();
        expect(counter.get()).to.equal(0);
    });

    it('you should be able to create a function that returns a person module', function() {

        expect(modulesAnswers.createPerson).to.throwException();
        expect(modulesAnswers.createPerson).withArgs('').to.throwException();
        expect(modulesAnswers.createPerson).withArgs().to.throwException();

        var person = modulesAnswers.createPerson('rui');

        expect(person.name).to.be(undefined);
        expect(person.age).to.be(undefined);

        expect(person.getName()).to.equal('rui');
        expect(person.getAge()).to.equal(0);

        person.setAge(43);
        person.age = 100;
        person.name = 'pedro';
        expect(person.getAge()).to.equal(43);
        expect(person.getName()).to.equal('rui');
    });
});
