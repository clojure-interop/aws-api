(ns com.amazonaws.AmazonClientException
  "Base exception class for any errors that occur while attempting to use an AWS
  client from AWS SDK for Java to make service calls to Amazon Web Services.

  Error responses from services will be handled as AmazonServiceExceptions.
  This class is primarily for errors that occur when unable to get a response
  from a service, or when the client is unable to parse the response from a
  service. For example, if a caller tries to use a client to make a service
  call, but no network connection is present, an AmazonClientException will be
  thrown to indicate that the client wasn't able to successfully make the
  service call, and no information from the service is available.

  Note : If the SDK is able to parse the response; but doesn't recognize the
  error code from the service, an AmazonServiceException is thrown

  Callers should typically deal with exceptions through AmazonServiceException,
  which represent error responses returned by services. AmazonServiceException
  has much more information available for callers to appropriately deal with
  different types of errors that can occur."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws AmazonClientException]))

(defn ->amazon-client-exception
  "Constructor.

  Creates a new AmazonClientException with the specified message, and root
   cause.

  message - An error message describing why this exception was thrown. - `java.lang.String`
  t - The underlying cause of this exception. - `java.lang.Throwable`"
  (^AmazonClientException [^java.lang.String message ^java.lang.Throwable t]
    (new AmazonClientException message t))
  (^AmazonClientException [^java.lang.String message]
    (new AmazonClientException message)))

(defn retryable?
  "Returns a hint as to whether it makes sense to retry upon this exception.
   Default is true, but subclass may override.

   This method is internal to the SDK. Users should not depend on this method to decide
   if an exception from a service should be retried.

  returns: `boolean`"
  (^Boolean [^AmazonClientException this]
    (-> this (.isRetryable))))

