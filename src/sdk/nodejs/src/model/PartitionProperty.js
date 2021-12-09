/*
 * self-managed-osdu
 * Rest API Documentation for Self Managed OSDU
 *
 * OpenAPI spec version: 0.11.0
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.21
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.SelfManagedOsdu) {
      root.SelfManagedOsdu = {};
    }
    root.SelfManagedOsdu.PartitionProperty = factory(root.SelfManagedOsdu.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The PartitionProperty model module.
   * @module model/PartitionProperty
   * @version 0.11.0
   */

  /**
   * Constructs a new <code>PartitionProperty</code>.
   * @alias module:model/PartitionProperty
   * @class
   */
  var exports = function() {
  };

  /**
   * Constructs a <code>PartitionProperty</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PartitionProperty} obj Optional instance to populate.
   * @return {module:model/PartitionProperty} The populated <code>PartitionProperty</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('sensitive'))
        obj.sensitive = ApiClient.convertToType(data['sensitive'], 'Boolean');
      if (data.hasOwnProperty('value'))
        obj.value = ApiClient.convertToType(data['value'], Object);
    }
    return obj;
  }

  /**
   * @member {Boolean} sensitive
   */
  exports.prototype.sensitive = undefined;

  /**
   * @member {Object} value
   */
  exports.prototype.value = undefined;


  return exports;

}));
