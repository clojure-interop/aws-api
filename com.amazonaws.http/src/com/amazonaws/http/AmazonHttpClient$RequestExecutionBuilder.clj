(ns com.amazonaws.http.AmazonHttpClient$RequestExecutionBuilder
  "Interface to configure a request execution and execute the request."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.http AmazonHttpClient$RequestExecutionBuilder]))

(defn request
  "Fluent setter for Request

  request - Request object - `com.amazonaws.Request`

  returns: This builder for method chaining. - `com.amazonaws.http.AmazonHttpClient$RequestExecutionBuilder`"
  (^com.amazonaws.http.AmazonHttpClient$RequestExecutionBuilder [^AmazonHttpClient$RequestExecutionBuilder this ^com.amazonaws.Request request]
    (-> this (.request request))))

(defn error-response-handler
  "Fluent setter for the error response handler

  error-response-handler - Error response handler - `com.amazonaws.http.HttpResponseHandler`

  returns: This builder for method chaining. - `com.amazonaws.http.AmazonHttpClient$RequestExecutionBuilder`"
  (^com.amazonaws.http.AmazonHttpClient$RequestExecutionBuilder [^AmazonHttpClient$RequestExecutionBuilder this ^com.amazonaws.http.HttpResponseHandler error-response-handler]
    (-> this (.errorResponseHandler error-response-handler))))

(defn execution-context
  "Fluent setter for the execution context

  execution-context - Execution context - `com.amazonaws.http.ExecutionContext`

  returns: This builder for method chaining. - `com.amazonaws.http.AmazonHttpClient$RequestExecutionBuilder`"
  (^com.amazonaws.http.AmazonHttpClient$RequestExecutionBuilder [^AmazonHttpClient$RequestExecutionBuilder this ^com.amazonaws.http.ExecutionContext execution-context]
    (-> this (.executionContext execution-context))))

(defn request-config
  "Fluent setter for RequestConfig

  request-config - Request config object - `com.amazonaws.RequestConfig`

  returns: This builder for method chaining. - `com.amazonaws.http.AmazonHttpClient$RequestExecutionBuilder`"
  (^com.amazonaws.http.AmazonHttpClient$RequestExecutionBuilder [^AmazonHttpClient$RequestExecutionBuilder this ^com.amazonaws.RequestConfig request-config]
    (-> this (.requestConfig request-config))))

(defn execute
  "Executes the request with the given configuration.

  response-handler - Response handler that outputs the actual result type which is preferred going forward. - `com.amazonaws.http.HttpResponseHandler`

  returns: Unmarshalled result type. - `<Output> com.amazonaws.Response<Output>`"
  ([^AmazonHttpClient$RequestExecutionBuilder this ^com.amazonaws.http.HttpResponseHandler response-handler]
    (-> this (.execute response-handler)))
  (^com.amazonaws.Response [^AmazonHttpClient$RequestExecutionBuilder this]
    (-> this (.execute))))

