(ns com.amazonaws.services.sqs.QueueUrlHandler
  "Custom request handler for SQS that processes the request before it gets routed to the client
  runtime layer.

  SQS MessageQueue operations take a QueueUrl parameter that needs special handling to update the
  endpoint and resource path on the request before it's executed."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.sqs QueueUrlHandler]))

(defn ->queue-url-handler
  "Constructor."
  (^QueueUrlHandler []
    (new QueueUrlHandler )))

(defn before-request
  "Description copied from interface: RequestHandler

  request - The low level request being processed. - `com.amazonaws.Request`"
  ([^QueueUrlHandler this ^com.amazonaws.Request request]
    (-> this (.beforeRequest request))))

