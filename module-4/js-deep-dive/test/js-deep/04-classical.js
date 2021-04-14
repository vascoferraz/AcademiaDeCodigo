var expect = require('expect.js');
var classicalAnswers = require('../../src/04-classical');

describe('classical inheritance', function() {

    it('you should be able to create a rectangle object constructor', function() {

        var Rectangle = classicalAnswers.createRectangleConstructor();

        expect(Rectangle.prototype.constructor).to.equal(Rectangle);

        var r1 = new Rectangle(7, 3);
        var r2 = new Rectangle(2, 5);

        expect(r1 instanceof Rectangle).to.be(true);
        expect(r2 instanceof Rectangle).to.be(true);

        expect(r1.hasOwnProperty('perimeter')).to.be(false);
        expect(r2.hasOwnProperty('perimeter')).to.be(false);
        expect(r1.hasOwnProperty('area')).to.be(false);
        expect(r2.hasOwnProperty('area')).to.be(false);

        expect(r1.x).to.equal(7);
        expect(r1.y).to.equal(3);
        expect(r2.x).to.equal(2);
        expect(r2.y).to.equal(5);

        expect(r1.area()).to.equal(7 * 3);
        expect(r2.area()).to.equal(2 * 5);

        expect(r1.perimeter()).to.equal(2 * (7 + 3));
        expect(r2.perimeter()).to.equal(2 * (5 + 2));
    });

    it('you should be able to subclass an existing constructor', function() {

        var called = false;
        var context = null;
        var Obj = function() {
            called = true;
            context = this;
        };

        Obj.prototype.test = {};

        var SubClass = classicalAnswers.createSubClass(Obj);

        expect(SubClass.prototype.constructor).to.equal(SubClass);
        expect(SubClass).to.not.equal(Obj);

        var s1 = new SubClass();
        expect(s1 instanceof SubClass);
        expect(s1 instanceof Obj);
        expect(called).to.be(true);
        expect(context).to.equal(s1);
        expect(s1.test).to.equal(Obj.prototype.test);

        called = false;
        context = null;

        var s2 = new SubClass();
        expect(s2 instanceof SubClass);
        expect(s2 instanceof Obj);
        expect(called).to.be(true);
        expect(context).to.equal(s2);
        expect(s2.test).to.equal(Obj.prototype.test);
    });
});
