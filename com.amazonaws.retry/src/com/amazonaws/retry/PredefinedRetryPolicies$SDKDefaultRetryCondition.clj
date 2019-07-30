(ns com.amazonaws.retry.PredefinedRetryPolicies$SDKDefaultRetryCondition
  "The default implementation of RetryCondition used by the SDK. User could
  extend this class to provide additional custom conditions.
  The default implementation checks for various conditions in
  the following order:

    Retry on client exceptions caused by IOException;
    Retry on service exceptions that are either 500 internal server
        errors, 503 service unavailable errors, service throttling errors or
        clock skew errors."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.retry PredefinedRetryPolicies$SDKDefaultRetryCondition]))

(defn ->sdk-default-retry-condition
  "Constructor."
  (^PredefinedRetryPolicies$SDKDefaultRetryCondition []
    (new PredefinedRetryPolicies$SDKDefaultRetryCondition )))

(defn should-retry?
  "Description copied from interface: RetryPolicy.RetryCondition

  original-request - The original request object being executed. For performance reason, this object is not a defensive copy, and caller should not attempt to modify its data. - `com.amazonaws.AmazonWebServiceRequest`
  exception - The exception from the failed request, represented as an AmazonClientException object. There are two types of exception that will be passed to this method: AmazonServiceException (sub-class of AmazonClientException) indicating a service error AmazonClientException caused by an IOException when executing the HTTP request. Any other exceptions are regarded as unexpected failures and are thrown immediately without any retry. For performance reason, this object is not a defensive copy, and caller should not attempt to modify its data. - `com.amazonaws.AmazonClientException`
  retries-attempted - The number of times the current request has been attempted. - `int`

  returns: True if the failed request should be retried. - `boolean`"
  (^Boolean [^PredefinedRetryPolicies$SDKDefaultRetryCondition this ^com.amazonaws.AmazonWebServiceRequest original-request ^com.amazonaws.AmazonClientException exception ^Integer retries-attempted]
    (-> this (.shouldRetry original-request exception retries-attempted))))

