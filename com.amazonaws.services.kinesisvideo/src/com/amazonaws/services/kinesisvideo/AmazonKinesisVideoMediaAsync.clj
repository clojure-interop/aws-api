(ns com.amazonaws.services.kinesisvideo.AmazonKinesisVideoMediaAsync
  "Interface for accessing Kinesis Video Media asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonKinesisVideoMediaAsync instead."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kinesisvideo AmazonKinesisVideoMediaAsync]))

(defn get-media-async
  "Use this API to retrieve media content from a Kinesis video stream. In the request, you identify the stream name
   or stream Amazon Resource Name (ARN), and the starting chunk. Kinesis Video Streams then returns a stream of
   chunks in order by fragment number.



   You must first call the GetDataEndpoint API to get an endpoint. Then send the GetMedia
   requests to this endpoint using the --endpoint-url
   parameter.



   When you put media data (fragments) on a stream, Kinesis Video Streams stores each incoming fragment and related
   metadata in what is called a \"chunk.\" For more information, see PutMedia. The
   GetMedia API returns a stream of these chunks starting from the chunk that you specify in the
   request.


   The following limits apply when using the GetMedia API:




   A client can call GetMedia up to five times per second per stream.




   Kinesis Video Streams sends media data at a rate of up to 25 megabytes per second (or 200 megabits per second)
   during a GetMedia session.





   If an error is thrown after invoking a Kinesis Video Streams media API, in addition to the HTTP status code and
   the response body, it includes the following pieces of information:




   x-amz-ErrorType HTTP header – contains a more specific error type in addition to what the HTTP
   status code provides.




   x-amz-RequestId HTTP header – if you want to report an issue to AWS, the support team can better
   diagnose the problem if given the Request Id.




   Both the HTTP status code and the ErrorType header can be utilized to make programmatic decisions about whether
   errors are retry-able and under what conditions, as well as provide information on what actions the client
   programmer might need to take in order to successfully try again.


   For more information, see the Errors section at the bottom of this topic, as well as Common Errors.

  get-media-request - `com.amazonaws.services.kinesisvideo.model.GetMediaRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMedia operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisvideo.model.GetMediaResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisVideoMediaAsync this ^com.amazonaws.services.kinesisvideo.model.GetMediaRequest get-media-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMediaAsync get-media-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisVideoMediaAsync this ^com.amazonaws.services.kinesisvideo.model.GetMediaRequest get-media-request]
    (-> this (.getMediaAsync get-media-request))))

