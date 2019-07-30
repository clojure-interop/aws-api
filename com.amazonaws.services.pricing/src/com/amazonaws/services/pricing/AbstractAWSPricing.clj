(ns com.amazonaws.services.pricing.AbstractAWSPricing
  "Abstract implementation of AWSPricing. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.pricing AbstractAWSPricing]))

(defn describe-services
  "Description copied from interface: AWSPricing

  request - `com.amazonaws.services.pricing.model.DescribeServicesRequest`

  returns: Result of the DescribeServices operation returned by the service. - `com.amazonaws.services.pricing.model.DescribeServicesResult`"
  (^com.amazonaws.services.pricing.model.DescribeServicesResult [^AbstractAWSPricing this ^com.amazonaws.services.pricing.model.DescribeServicesRequest request]
    (-> this (.describeServices request))))

(defn get-attribute-values
  "Description copied from interface: AWSPricing

  request - `com.amazonaws.services.pricing.model.GetAttributeValuesRequest`

  returns: Result of the GetAttributeValues operation returned by the service. - `com.amazonaws.services.pricing.model.GetAttributeValuesResult`"
  (^com.amazonaws.services.pricing.model.GetAttributeValuesResult [^AbstractAWSPricing this ^com.amazonaws.services.pricing.model.GetAttributeValuesRequest request]
    (-> this (.getAttributeValues request))))

(defn get-products
  "Description copied from interface: AWSPricing

  request - `com.amazonaws.services.pricing.model.GetProductsRequest`

  returns: Result of the GetProducts operation returned by the service. - `com.amazonaws.services.pricing.model.GetProductsResult`"
  (^com.amazonaws.services.pricing.model.GetProductsResult [^AbstractAWSPricing this ^com.amazonaws.services.pricing.model.GetProductsRequest request]
    (-> this (.getProducts request))))

(defn shutdown
  "Description copied from interface: AWSPricing"
  ([^AbstractAWSPricing this]
    (-> this (.shutdown))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSPricing

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSPricing this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

