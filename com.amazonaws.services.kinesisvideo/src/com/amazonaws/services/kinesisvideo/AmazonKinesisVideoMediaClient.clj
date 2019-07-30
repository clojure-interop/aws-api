(ns com.amazonaws.services.kinesisvideo.AmazonKinesisVideoMediaClient
  "Client for accessing Kinesis Video Media. All service calls made using this client are blocking, and will not return
  until the service call completes."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kinesisvideo AmazonKinesisVideoMediaClient]))

(defn *builder
  "returns: `com.amazonaws.services.kinesisvideo.AmazonKinesisVideoMediaClientBuilder`"
  (^com.amazonaws.services.kinesisvideo.AmazonKinesisVideoMediaClientBuilder []
    (AmazonKinesisVideoMediaClient/builder )))

(defn get-media
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

  request - `com.amazonaws.services.kinesisvideo.model.GetMediaRequest`

  returns: Result of the GetMedia operation returned by the service. - `com.amazonaws.services.kinesisvideo.model.GetMediaResult`

  throws: com.amazonaws.services.kinesisvideo.model.ResourceNotFoundException - Status Code: 404, The stream with the given name does not exist."
  (^com.amazonaws.services.kinesisvideo.model.GetMediaResult [^AmazonKinesisVideoMediaClient this ^com.amazonaws.services.kinesisvideo.model.GetMediaRequest request]
    (-> this (.getMedia request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonKinesisVideoMediaClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

