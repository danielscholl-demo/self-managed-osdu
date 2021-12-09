/* 
 * self-managed-osdu
 *
 * Rest API Documentation for Self Managed OSDU
 *
 * OpenAPI spec version: 0.11.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = IO.Swagger.Client.SwaggerDateConverter;

namespace IO.Swagger.Model
{
    /// <summary>
    /// PartitionDto
    /// </summary>
    [DataContract]
    public partial class PartitionDto :  IEquatable<PartitionDto>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PartitionDto" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PartitionDto() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="PartitionDto" /> class.
        /// </summary>
        /// <param name="properties">Free form key value pair object for any data partition specific values (required).</param>
        public PartitionDto(Dictionary<string, PartitionProperty> properties = default(Dictionary<string, PartitionProperty>))
        {
            // to ensure "properties" is required (not null)
            if (properties == null)
            {
                throw new InvalidDataException("properties is a required property for PartitionDto and cannot be null");
            }
            else
            {
                this.Properties = properties;
            }
        }
        
        /// <summary>
        /// Free form key value pair object for any data partition specific values
        /// </summary>
        /// <value>Free form key value pair object for any data partition specific values</value>
        [DataMember(Name="properties", EmitDefaultValue=false)]
        public Dictionary<string, PartitionProperty> Properties { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PartitionDto {\n");
            sb.Append("  Properties: ").Append(Properties).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as PartitionDto);
        }

        /// <summary>
        /// Returns true if PartitionDto instances are equal
        /// </summary>
        /// <param name="input">Instance of PartitionDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PartitionDto input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Properties == input.Properties ||
                    this.Properties != null &&
                    this.Properties.SequenceEqual(input.Properties)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Properties != null)
                    hashCode = hashCode * 59 + this.Properties.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
