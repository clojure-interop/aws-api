(ns com.amazonaws.services.pricing.AWSPricingClient
  "Client for accessing AWS Pricing. All service calls made using this client are blocking, and will not return until
  the service call completes.


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
  (:import [com.amazonaws.services.pricing AWSPricingClient]))

(defn *builder
  "returns: `com.amazonaws.services.pricing.AWSPricingClientBuilder`"
  (^com.amazonaws.services.pricing.AWSPricingClientBuilder []
    (AWSPricingClient/builder )))

(defn describe-services
  "Returns the metadata for one service or a list of the metadata for all services. Use this without a service code
   to get the service codes for all services. Use it with a service code, such as AmazonEC2, to get
   information specific to that service, such as the attribute names available for that service. For example, some
   of the attribute names available for EC2 are volumeType, maxIopsVolume,
   operation, locationType, and instanceCapacity10xlarge.

  request - `com.amazonaws.services.pricing.model.DescribeServicesRequest`

  returns: Result of the DescribeServices operation returned by the service. - `com.amazonaws.services.pricing.model.DescribeServicesResult`

  throws: com.amazonaws.services.pricing.model.InternalErrorException - An error on the server occurred during the processing of your request. Try again later."
  (^com.amazonaws.services.pricing.model.DescribeServicesResult [^AWSPricingClient this ^com.amazonaws.services.pricing.model.DescribeServicesRequest request]
    (-> this (.describeServices request))))

(defn get-attribute-values
  "Returns a list of attribute values. Attibutes are similar to the details in a Price List API offer file. For a
   list of available attributes, see Offer File
   Definitions in the AWS Billing and Cost
   Management User Guide.

  request - `com.amazonaws.services.pricing.model.GetAttributeValuesRequest`

  returns: Result of the GetAttributeValues operation returned by the service. - `com.amazonaws.services.pricing.model.GetAttributeValuesResult`

  throws: com.amazonaws.services.pricing.model.InternalErrorException - An error on the server occurred during the processing of your request. Try again later."
  (^com.amazonaws.services.pricing.model.GetAttributeValuesResult [^AWSPricingClient this ^com.amazonaws.services.pricing.model.GetAttributeValuesRequest request]
    (-> this (.getAttributeValues request))))

(defn get-products
  "Returns a list of all products that match the filter criteria.

  request - `com.amazonaws.services.pricing.model.GetProductsRequest`

  returns: Result of the GetProducts operation returned by the service. - `com.amazonaws.services.pricing.model.GetProductsResult`

  throws: com.amazonaws.services.pricing.model.InternalErrorException - An error on the server occurred during the processing of your request. Try again later."
  (^com.amazonaws.services.pricing.model.GetProductsResult [^AWSPricingClient this ^com.amazonaws.services.pricing.model.GetProductsRequest request]
    (-> this (.getProducts request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSPricingClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

