var expect = require('expect.js');
var objectsAnswers = require('../../src/03-prototypes');

describe('objects', function() {

    var person = {
        name: 'Pedro',
        greeting: 'Hello, ',
        say: function() {
            return this.greeting + this.name + '!';
        }
    };

    it('you should be able to create a developer object that delegates to person', function() {

        var result = objectsAnswers.createDelegate(person);
        expect(Object.getPrototypeOf(result)).to.equal(person);
        expect(result.say).to.equal(person.say);
        expect(person).to.not.have.property('code');
        expect(result).to.have.property('code');
        expect(result.code).to.be.a('function');

    });

    it('you should be able to borrow the say method', function() {

        var company = {
            name: 'E&Y',
            greeting: 'Hello, '
        };

        expect(objectsAnswers.borrowSayMethod(person, company)).to.equal('Hello, E&Y!');
        expect(company).to.not.have.property('say');
    });

    it('you should be able to iterate over an object own properties', function() {

        var Person = function() {
            this.name = 'Rui';
            this.age = 43;
        };

        Person.prototype.sex = 'male';

        var obj = new Person();

        expect(objectsAnswers.iterate(obj)).to.eql(['name: Rui', 'age: 43']);
    });

    it('you should be able to extend the string object with a repeatify method', function() {

        objectsAnswers.extendString();
        expect('123'.repeatify(3)).to.equal('123123123');
        expect('a'.repeatify(5)).to.equal('aaaaa');

        String.prototype.repeatify = function() {
            return 'test';
        };

        objectsAnswers.extendString();
        expect('123'.repeatify(3)).to.equal('test');

        delete String.prototype.repeatify;
    });
});
