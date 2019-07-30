(ns com.amazonaws.services.pricing.AbstractAWSPricingAsync
  "Abstract implementation of AWSPricingAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.pricing AbstractAWSPricingAsync]))

(defn describe-services-async
  "Description copied from interface: AWSPricingAsync

  request - `com.amazonaws.services.pricing.model.DescribeServicesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeServices operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pricing.model.DescribeServicesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSPricingAsync this ^com.amazonaws.services.pricing.model.DescribeServicesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeServicesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSPricingAsync this ^com.amazonaws.services.pricing.model.DescribeServicesRequest request]
    (-> this (.describeServicesAsync request))))

(defn get-attribute-values-async
  "Description copied from interface: AWSPricingAsync

  request - `com.amazonaws.services.pricing.model.GetAttributeValuesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAttributeValues operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pricing.model.GetAttributeValuesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSPricingAsync this ^com.amazonaws.services.pricing.model.GetAttributeValuesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAttributeValuesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSPricingAsync this ^com.amazonaws.services.pricing.model.GetAttributeValuesRequest request]
    (-> this (.getAttributeValuesAsync request))))

(defn get-products-async
  "Description copied from interface: AWSPricingAsync

  request - `com.amazonaws.services.pricing.model.GetProductsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetProducts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pricing.model.GetProductsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSPricingAsync this ^com.amazonaws.services.pricing.model.GetProductsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getProductsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSPricingAsync this ^com.amazonaws.services.pricing.model.GetProductsRequest request]
    (-> this (.getProductsAsync request))))

