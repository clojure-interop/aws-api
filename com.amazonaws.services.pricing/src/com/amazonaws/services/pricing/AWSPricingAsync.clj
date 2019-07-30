(ns com.amazonaws.services.pricing.AWSPricingAsync
  "Interface for accessing AWS Pricing asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSPricingAsync instead.



  AWS Price List Service API (AWS Price List Service) is a centralized and convenient way to programmatically query
  Amazon Web Services for services, products, and pricing information. The AWS Price List Service uses standardized
  product attributes such as Location, Storage Class, and Operating System, and
  provides prices at the SKU level. You can use the AWS Price List Service to build cost control and scenario planning
  tools, reconcile billing data, forecast future spend for budgeting purposes, and provide cost benefit analysis that
  compare your internal workloads with AWS.


  Use GetServices without a service code to retrieve the service codes for all AWS services, then
  GetServices with a service code to retreive the attribute names for that service. After you have the
  service code and attribute names, you can use GetAttributeValues to see what values are available for an
  attribute. With the service code and an attribute name and value, you can use GetProducts to find
  specific products that you're interested in, such as an AmazonEC2 instance, with a
  Provisioned IOPS volumeType.


  Service Endpoint


  AWS Price List Service API provides the following two endpoints:




  https://api.pricing.us-east-1.amazonaws.com




  https://api.pricing.ap-south-1.amazonaws.com"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.pricing AWSPricingAsync]))

(defn describe-services-async
  "Returns the metadata for one service or a list of the metadata for all services. Use this without a service code
   to get the service codes for all services. Use it with a service code, such as AmazonEC2, to get
   information specific to that service, such as the attribute names available for that service. For example, some
   of the attribute names available for EC2 are volumeType, maxIopsVolume,
   operation, locationType, and instanceCapacity10xlarge.

  describe-services-request - `com.amazonaws.services.pricing.model.DescribeServicesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeServices operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pricing.model.DescribeServicesResult>`"
  (^java.util.concurrent.Future [^AWSPricingAsync this ^com.amazonaws.services.pricing.model.DescribeServicesRequest describe-services-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeServicesAsync describe-services-request async-handler)))
  (^java.util.concurrent.Future [^AWSPricingAsync this ^com.amazonaws.services.pricing.model.DescribeServicesRequest describe-services-request]
    (-> this (.describeServicesAsync describe-services-request))))

(defn get-attribute-values-async
  "Returns a list of attribute values. Attibutes are similar to the details in a Price List API offer file. For a
   list of available attributes, see Offer File
   Definitions in the AWS Billing and Cost
   Management User Guide.

  get-attribute-values-request - `com.amazonaws.services.pricing.model.GetAttributeValuesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAttributeValues operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pricing.model.GetAttributeValuesResult>`"
  (^java.util.concurrent.Future [^AWSPricingAsync this ^com.amazonaws.services.pricing.model.GetAttributeValuesRequest get-attribute-values-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAttributeValuesAsync get-attribute-values-request async-handler)))
  (^java.util.concurrent.Future [^AWSPricingAsync this ^com.amazonaws.services.pricing.model.GetAttributeValuesRequest get-attribute-values-request]
    (-> this (.getAttributeValuesAsync get-attribute-values-request))))

(defn get-products-async
  "Returns a list of all products that match the filter criteria.

  get-products-request - `com.amazonaws.services.pricing.model.GetProductsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetProducts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pricing.model.GetProductsResult>`"
  (^java.util.concurrent.Future [^AWSPricingAsync this ^com.amazonaws.services.pricing.model.GetProductsRequest get-products-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getProductsAsync get-products-request async-handler)))
  (^java.util.concurrent.Future [^AWSPricingAsync this ^com.amazonaws.services.pricing.model.GetProductsRequest get-products-request]
    (-> this (.getProductsAsync get-products-request))))

