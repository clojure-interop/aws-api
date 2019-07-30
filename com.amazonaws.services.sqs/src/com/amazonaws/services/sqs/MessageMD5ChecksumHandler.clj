(ns com.amazonaws.services.sqs.MessageMD5ChecksumHandler
  "SQS operations on sending and receiving messages will return the MD5 digest of the message body.
  This custom request handler will verify that the message is correctly received by SQS, by
  comparing the returned MD5 with the calculation according to the original request."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.sqs MessageMD5ChecksumHandler]))

(defn ->message-md-5-checksum-handler
  "Constructor."
  (^MessageMD5ChecksumHandler []
    (new MessageMD5ChecksumHandler )))

(defn after-response
  "Description copied from interface: RequestHandler

  request - The low level request being processed. - `com.amazonaws.Request`
  response - The response generated from the specified request. - `java.lang.Object`
  timing-info - Timing information on the request's processing. - `com.amazonaws.util.TimingInfo`"
  ([^MessageMD5ChecksumHandler this ^com.amazonaws.Request request ^java.lang.Object response ^com.amazonaws.util.TimingInfo timing-info]
    (-> this (.afterResponse request response timing-info))))

