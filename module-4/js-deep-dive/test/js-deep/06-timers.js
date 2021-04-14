var sinon = require('sinon');
var expect = require('expect.js');
var timersAnswers = require('../../src/06-timers');

describe('timers', function() {

    var clock;

    before(function() {
        clock = sinon.useFakeTimers();
    });

    after(function() {
        clock.restore();
    });

    it('should have the proper api', function() {

        var stopWatch = timersAnswers.createStopWatch();

        expect(stopWatch).to.only.have.keys('start', 'stop', 'reset', 'getTime');

        expect(stopWatch.start).to.be.a('function');
        expect(stopWatch.stop).to.be.a('function');
        expect(stopWatch.reset).to.be.a('function');
        expect(stopWatch.getTime).to.be.a('function');
    });

    it('should start in a stopped state', function() {

        var stopWatch = timersAnswers.createStopWatch();
        expect(stopWatch.getTime()).to.equal(0);
        clock.tick(10000);
        expect(stopWatch.getTime()).to.equal(0);
    });

    it('should increment time every second', function() {

        var sw1 = timersAnswers.createStopWatch();
        sw1.start();
        clock.tick(5000);
        var sw2 = timersAnswers.createStopWatch();
        sw2.start();
        clock.tick(5000);

        expect(sw1.getTime()).to.equal(10);
        expect(sw2.getTime()).to.equal(5);

        sw1.stop();
        sw2.stop();
    });

    it('should be able to reset time while counting', function() {

        var sw = timersAnswers.createStopWatch();
        sw.start();
        clock.tick(5000);

        sw.reset();
        expect(sw.getTime()).to.equal(0);

        clock.tick(5000);
        expect(sw.getTime()).to.equal(5);

        sw.stop();
    });

    it('should be able to stop and start time', function() {

        var sw = timersAnswers.createStopWatch();
        sw.start();
        clock.tick(5000);
        sw.stop();
        expect(sw.getTime()).to.equal(5);

        sw.start();
        clock.tick(5000);
        expect(sw.getTime()).to.equal(10);

        sw.stop();
    });
});
