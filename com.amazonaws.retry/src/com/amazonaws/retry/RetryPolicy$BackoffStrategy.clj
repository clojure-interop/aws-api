(ns com.amazonaws.retry.RetryPolicy$BackoffStrategy
  "The hook for providing custom back-off strategy to control the sleep time
  between retries."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.retry RetryPolicy$BackoffStrategy]))

(defn delay-before-next-retry
  "Returns the delay (in milliseconds) before next retry attempt.

  original-request - The original request object being executed. For performance reason, this object is not a defensive copy, and caller should not attempt to modify its data. - `com.amazonaws.AmazonWebServiceRequest`
  exception - The exception from the failed request, represented as an AmazonClientException object. There are two types of exception that will be passed to this method: AmazonServiceException (sub-class of AmazonClientException) indicating a service error AmazonClientException caused by an IOException when executing the HTTP request. Any other exceptions are regarded as unexpected failures and are thrown immediately without any retry. For performance reason, this object is not a defensive copy, and caller should not attempt to modify its data. - `com.amazonaws.AmazonClientException`
  retries-attempted - The number of times the current request has been attempted (not including the next attempt after the delay). - `int`

  returns: The delay (in milliseconds) before next retry attempt. - `long`"
  (^Long [^RetryPolicy$BackoffStrategy this ^com.amazonaws.AmazonWebServiceRequest original-request ^com.amazonaws.AmazonClientException exception ^Integer retries-attempted]
    (-> this (.delayBeforeNextRetry original-request exception retries-attempted))))

