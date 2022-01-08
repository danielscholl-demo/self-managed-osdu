/*
 * self-managed-osdu
 * Rest API Documentation for Self Managed OSDU
 *
 * OpenAPI spec version: 0.11.0
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.22
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.SelfManagedOsdu);
  }
}(this, function(expect, SelfManagedOsdu) {
  'use strict';

  var instance;

  describe('(package)', function() {
    describe('SearchByBoundingBox', function() {
      beforeEach(function() {
        instance = new SelfManagedOsdu.SearchByBoundingBox();
      });

      it('should create an instance of SearchByBoundingBox', function() {
        // TODO: update the code to test SearchByBoundingBox
        expect(instance).to.be.a(SelfManagedOsdu.SearchByBoundingBox);
      });

      it('should have the property topLeft (base name: "topLeft")', function() {
        // TODO: update the code to test the property topLeft
        expect(instance).to.have.property('topLeft');
        // expect(instance.topLeft).to.be(expectedValueLiteral);
      });

      it('should have the property bottomRight (base name: "bottomRight")', function() {
        // TODO: update the code to test the property bottomRight
        expect(instance).to.have.property('bottomRight');
        // expect(instance.bottomRight).to.be(expectedValueLiteral);
      });

    });
  });

}));