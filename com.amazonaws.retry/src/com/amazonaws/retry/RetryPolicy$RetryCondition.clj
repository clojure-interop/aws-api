(ns com.amazonaws.retry.RetryPolicy$RetryCondition
  "The hook for providing custom condition on whether a failed request
  should be retried."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.retry RetryPolicy$RetryCondition]))

(defn should-retry?
  "Returns whether a failed request should be retried according to the
   given request context. In the following circumstances, the request
   will fail directly without consulting this method:

      if it has already reached the max retry limit,
      if the request contains non-repeatable content,
      if any RuntimeException or Error is thrown when executing the request.

  original-request - The original request object being executed. For performance reason, this object is not a defensive copy, and caller should not attempt to modify its data. - `com.amazonaws.AmazonWebServiceRequest`
  exception - The exception from the failed request, represented as an AmazonClientException object. There are two types of exception that will be passed to this method: AmazonServiceException (sub-class of AmazonClientException) indicating a service error AmazonClientException caused by an IOException when executing the HTTP request. Any other exceptions are regarded as unexpected failures and are thrown immediately without any retry. For performance reason, this object is not a defensive copy, and caller should not attempt to modify its data. - `com.amazonaws.AmazonClientException`
  retries-attempted - The number of times the current request has been attempted. - `int`

  returns: True if the failed request should be retried. - `boolean`"
  (^Boolean [^RetryPolicy$RetryCondition this ^com.amazonaws.AmazonWebServiceRequest original-request ^com.amazonaws.AmazonClientException exception ^Integer retries-attempted]
    (-> this (.shouldRetry original-request exception retries-attempted))))

