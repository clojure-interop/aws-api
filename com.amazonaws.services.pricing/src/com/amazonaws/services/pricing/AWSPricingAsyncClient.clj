(ns com.amazonaws.services.pricing.AWSPricingAsyncClient
  "Client for accessing AWS Pricing asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.


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
  (:import [com.amazonaws.services.pricing AWSPricingAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.pricing.AWSPricingAsyncClientBuilder`"
  (^com.amazonaws.services.pricing.AWSPricingAsyncClientBuilder []
    (AWSPricingAsyncClient/asyncBuilder )))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSPricingAsyncClient this]
    (-> this (.getExecutorService))))

(defn describe-services-async
  "Description copied from interface: AWSPricingAsync

  request - `com.amazonaws.services.pricing.model.DescribeServicesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeServices operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pricing.model.DescribeServicesResult>`"
  (^java.util.concurrent.Future [^AWSPricingAsyncClient this ^com.amazonaws.services.pricing.model.DescribeServicesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeServicesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSPricingAsyncClient this ^com.amazonaws.services.pricing.model.DescribeServicesRequest request]
    (-> this (.describeServicesAsync request))))

(defn get-attribute-values-async
  "Description copied from interface: AWSPricingAsync

  request - `com.amazonaws.services.pricing.model.GetAttributeValuesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAttributeValues operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pricing.model.GetAttributeValuesResult>`"
  (^java.util.concurrent.Future [^AWSPricingAsyncClient this ^com.amazonaws.services.pricing.model.GetAttributeValuesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAttributeValuesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSPricingAsyncClient this ^com.amazonaws.services.pricing.model.GetAttributeValuesRequest request]
    (-> this (.getAttributeValuesAsync request))))

(defn get-products-async
  "Description copied from interface: AWSPricingAsync

  request - `com.amazonaws.services.pricing.model.GetProductsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetProducts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pricing.model.GetProductsResult>`"
  (^java.util.concurrent.Future [^AWSPricingAsyncClient this ^com.amazonaws.services.pricing.model.GetProductsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getProductsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSPricingAsyncClient this ^com.amazonaws.services.pricing.model.GetProductsRequest request]
    (-> this (.getProductsAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSPricingAsyncClient this]
    (-> this (.shutdown))))

