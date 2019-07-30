(ns com.amazonaws.services.kinesisvideo.AmazonKinesisVideoPutMedia
  "Interface for accessing Amazon Kinesis Video's PutMedia operation. This is a special, asynchronous operation that is not supported
  in the normal client (AWSKinesisVideoMediaClient.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonKinesisVideoPutMedia instead."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kinesisvideo AmazonKinesisVideoPutMedia]))

(defn put-media
  "Use this API to send media data to a Kinesis video stream.



   Before using this API, you must call the GetDataEndpoint API to get an endpoint. You then specify
   the endpoint in your PutMedia request.



   In the request, you use the HTTP headers to provide parameter information, for example, stream name, time stamp,
   and whether the time stamp value is absolute or relative to when the producer started recording. You use the
   request body to send the media data. Kinesis Video Streams supports only the Matroska (MKV) container format for
   sending media data using this API.


   You have the following options for sending data using this API:




   Send media data in real time: For example, a security camera can send frames in real time as it generates them.
   This approach minimizes the latency between the video recording and data sent on the wire. This is referred to as
   a continuous producer. In this case, a consumer application can read the stream in real time or when needed.




   Send media data offline (in batches): For example, a body camera might record video for hours and store it on the
   device. Later, when you connect the camera to the docking port, the camera can start a PutMedia
   session to send data to a Kinesis video stream. In this scenario, latency is not an issue.




   When using this API, note the following considerations:




   You must specify either streamName or streamARN, but not both.




   You might find it easier to use a single long-running PutMedia session and send a large number of
   media data fragments in the payload. Note that for each fragment received, Kinesis Video Streams sends one or
   more acknowledgements. Potential network considerations might cause you to not get all these acknowledgements as
   they are generated.




   You might choose multiple consecutive PutMedia sessions, each with fewer fragments to ensure that
   you get all acknowledgements from the service in real time.





   If you send data to the same stream on multiple simultaneous PutMedia sessions, the media fragments
   get interleaved on the stream. You should make sure that this is OK in your application scenario.



   The following limits apply when using the PutMedia API:




   A client can call PutMedia up to five times per second per stream.




   A client can send up to five fragments per second per stream.




   Kinesis Video Streams reads media data at a rate of up to 12.5 MB/second, or 100 Mbps during a
   PutMedia session.




   Note the following constraints. In these cases, Kinesis Video Streams sends the Error acknowledgement in the
   response.




   Fragments that have time codes spanning longer than 10 seconds and that contain more than 50 megabytes of data
   are not allowed.




   An MKV stream containing more than one MKV segment or containing disallowed MKV elements (like
   track*) also results in the Error acknowledgement.




   Kinesis Video Streams stores each incoming fragment and related metadata in what is called a \"chunk.\" The
   fragment metadata includes the following:




   The MKV headers provided at the start of the PutMedia request




   The following Kinesis Video Streams-specific metadata for the fragment:




   server_timestamp - Time stamp when Kinesis Video Streams started receiving the fragment.




   producer_timestamp - Time stamp, when the producer started recording the fragment. Kinesis Video
   Streams uses three pieces of information received in the request to calculate this value.




   The fragment timecode value received in the request body along with the fragment.




   Two request headers: producerStartTimestamp (when the producer started recording) and
   fragmentTimeCodeType (whether the fragment timecode in the payload is absolute or relative).




   Kinesis Video Streams then computes the producer_timestamp for the fragment as follows:


   If fragmentTimeCodeType is relative, then


   producer_timestamp = producerStartTimeSamp  fragment timecode


   If fragmentTimeCodeType is absolute, then


   producer_timestamp = fragment timecode (converted to milliseconds)




   Unique fragment number assigned by Kinesis Video Streams.







   When you make the GetMedia request, Kinesis Video Streams returns a stream of these chunks. The
   client can process the metadata as needed.



   This operation is only available for the AWS SDK for Java. It is not supported in AWS SDKs for other languages.

  request - Represents the input of a PutMedia operation - `com.amazonaws.services.kinesisvideo.model.PutMediaRequest`
  response-handler - Handler to asynchronously process the AckEvent that are received by the service. - `com.amazonaws.services.kinesisvideo.PutMediaAckResponseHandler`

  throws: com.amazonaws.services.kinesisvideo.model.ResourceNotFoundException - Status Code: 404, The stream with the given name does not exist."
  ([^AmazonKinesisVideoPutMedia this ^com.amazonaws.services.kinesisvideo.model.PutMediaRequest request ^com.amazonaws.services.kinesisvideo.PutMediaAckResponseHandler response-handler]
    (-> this (.putMedia request response-handler))))

(defn close
  "Closes the client and releases all resources like connection pools and threads."
  ([^AmazonKinesisVideoPutMedia this]
    (-> this (.close))))

