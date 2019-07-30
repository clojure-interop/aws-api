(ns com.amazonaws.retry.PredefinedBackoffStrategies$ExponentialBackoffStrategy
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.retry PredefinedBackoffStrategies$ExponentialBackoffStrategy]))

(defn ->exponential-backoff-strategy
  "Constructor.

  base-delay - `int`
  max-backoff-time - `int`"
  (^PredefinedBackoffStrategies$ExponentialBackoffStrategy [^Integer base-delay ^Integer max-backoff-time]
    (new PredefinedBackoffStrategies$ExponentialBackoffStrategy base-delay max-backoff-time)))

(defn compute-delay-before-next-retry
  "Description copied from interface: BackoffStrategy

  context - Context about the state of the last request and information about the number of requests made. - `com.amazonaws.retry.v2.RetryPolicyContext`

  returns: Amount of time in milliseconds to wait before the next attempt. Must be non-negative (can be zero). - `long`"
  (^Long [^PredefinedBackoffStrategies$ExponentialBackoffStrategy this ^com.amazonaws.retry.v2.RetryPolicyContext context]
    (-> this (.computeDelayBeforeNextRetry context))))

(defn delay-before-next-retry
  "Description copied from interface: RetryPolicy.BackoffStrategy

  original-request - The original request object being executed. For performance reason, this object is not a defensive copy, and caller should not attempt to modify its data. - `com.amazonaws.AmazonWebServiceRequest`
  exception - The exception from the failed request, represented as an AmazonClientException object. There are two types of exception that will be passed to this method: AmazonServiceException (sub-class of AmazonClientException) indicating a service error AmazonClientException caused by an IOException when executing the HTTP request. Any other exceptions are regarded as unexpected failures and are thrown immediately without any retry. For performance reason, this object is not a defensive copy, and caller should not attempt to modify its data. - `com.amazonaws.AmazonClientException`
  retries-attempted - The number of times the current request has been attempted (not including the next attempt after the delay). - `int`

  returns: The delay (in milliseconds) before next retry attempt. - `long`"
  (^Long [^PredefinedBackoffStrategies$ExponentialBackoffStrategy this ^com.amazonaws.AmazonWebServiceRequest original-request ^com.amazonaws.AmazonClientException exception ^Integer retries-attempted]
    (-> this (.delayBeforeNextRetry original-request exception retries-attempted))))

