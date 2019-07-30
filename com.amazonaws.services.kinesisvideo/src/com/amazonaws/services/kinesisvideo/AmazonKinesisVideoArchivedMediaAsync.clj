(ns com.amazonaws.services.kinesisvideo.AmazonKinesisVideoArchivedMediaAsync
  "Interface for accessing Kinesis Video Archived Media asynchronously. Each asynchronous method will return a Java
  Future object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to
  receive notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonKinesisVideoArchivedMediaAsync instead."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kinesisvideo AmazonKinesisVideoArchivedMediaAsync]))

(defn get-dash-streaming-session-url-async
  "Retrieves an MPEG Dynamic Adaptive Streaming over HTTP (DASH) URL for the stream. You can then open the URL in a
   media player to view the stream contents.


   Both the StreamName and the StreamARN parameters are optional, but you must specify
   either the StreamName or the StreamARN when invoking this API operation.


   An Amazon Kinesis video stream has the following requirements for providing data through MPEG-DASH:




   The media must contain h.264 or h.265 encoded video and, optionally, AAC or G.711 encoded audio. Specifically,
   the codec id of track 1 should be V_MPEG/ISO/AVC (for h.264) or V_MPEGH/ISO/HEVC (for H.265).
   Optionally, the codec id of track 2 should be A_AAC (for AAC) or A_MS/ACM (for G.711).




   Data retention must be greater than 0.




   The video track of each fragment must contain codec private data in the Advanced Video Coding (AVC) for H.264
   format and HEVC for H.265 format. For more information, see MPEG-4 specification ISO/IEC 14496-15. For information about
   adapting stream data to a given format, see NAL Adaptation
   Flags.




   The audio track (if present) of each fragment must contain codec private data in the AAC format (AAC specification ISO/IEC 13818-7) or the MS Wave format.




   The following procedure shows how to use MPEG-DASH with Kinesis Video Streams:




   Get an endpoint using GetDataEndpoint,
   specifying GET_DASH_STREAMING_SESSION_URL for the APIName parameter.




   Retrieve the MPEG-DASH URL using GetDASHStreamingSessionURL. Kinesis Video Streams creates an
   MPEG-DASH streaming session to be used for accessing content in a stream using the MPEG-DASH protocol.
   GetDASHStreamingSessionURL returns an authenticated URL (that includes an encrypted session token)
   for the session's MPEG-DASH manifest (the root resource needed for streaming with MPEG-DASH).



   Don't share or store this token where an unauthorized entity could access it. The token provides access to the
   content of the stream. Safeguard the token with the same measures that you would use with your AWS credentials.



   The media that is made available through the manifest consists only of the requested stream, time range, and
   format. No other media data (such as frames outside the requested window or alternate bitrates) is made
   available.




   Provide the URL (containing the encrypted session token) for the MPEG-DASH manifest to a media player that
   supports the MPEG-DASH protocol. Kinesis Video Streams makes the initialization fragment, and media fragments
   available through the manifest URL. The initialization fragment contains the codec private data for the stream,
   and other data needed to set up the video or audio decoder and renderer. The media fragments contain encoded
   video frames or encoded audio samples.




   The media player receives the authenticated URL and requests stream metadata and media data normally. When the
   media player requests data, it calls the following actions:




   GetDASHManifest: Retrieves an MPEG DASH manifest, which contains the metadata for the media that you want
   to playback.




   GetMP4InitFragment: Retrieves the MP4 initialization fragment. The media player typically loads the
   initialization fragment before loading any media fragments. This fragment contains the \"fytp\" and \"
   moov\" MP4 atoms, and the child atoms that are needed to initialize the media player decoder.


   The initialization fragment does not correspond to a fragment in a Kinesis video stream. It contains only the
   codec private data for the stream and respective track, which the media player needs to decode the media frames.




   GetMP4MediaFragment: Retrieves MP4 media fragments. These fragments contain the \"moof\" and \"
   mdat\" MP4 atoms and their child atoms, containing the encoded fragment's media frames and their
   timestamps.



   After the first media fragment is made available in a streaming session, any fragments that don't contain the
   same codec private data cause an error to be returned when those different media fragments are loaded. Therefore,
   the codec private data should not change between fragments in a session. This also means that the session fails
   if the fragments in a stream change from having only video to having both audio and video.



   Data retrieved with this action is billable. See Pricing for details.







   The following restrictions apply to MPEG-DASH sessions:




   A streaming session URL should not be shared between players. The service might throttle a session if multiple
   media players are sharing it. For connection limits, see Kinesis Video Streams Limits.




   A Kinesis video stream can have a maximum of ten active MPEG-DASH streaming sessions. If a new session is created
   when the maximum number of sessions is already active, the oldest (earliest created) session is closed. The
   number of active GetMedia connections on a Kinesis video stream does not count against this limit,
   and the number of active MPEG-DASH sessions does not count against the active GetMedia connection
   limit.



   The maximum limits for active HLS and MPEG-DASH streaming sessions are independent of each other.





   You can monitor the amount of data that the media player consumes by monitoring the
   GetMP4MediaFragment.OutgoingBytes Amazon CloudWatch metric. For information about using CloudWatch
   to monitor Kinesis Video Streams, see Monitoring Kinesis Video
   Streams. For pricing information, see Amazon
   Kinesis Video Streams Pricing and AWS Pricing. Charges for both
   HLS sessions and outgoing AWS data apply.


   For more information about HLS, see HTTP Live Streaming on
   the Apple Developer site.



   If an error is thrown after invoking a Kinesis Video Streams archived media API, in addition to the HTTP status
   code and the response body, it includes the following pieces of information:




   x-amz-ErrorType HTTP header – contains a more specific error type in addition to what the HTTP
   status code provides.




   x-amz-RequestId HTTP header – if you want to report an issue to AWS, the support team can better
   diagnose the problem if given the Request Id.




   Both the HTTP status code and the ErrorType header can be utilized to make programmatic decisions about whether
   errors are retry-able and under what conditions, as well as provide information on what actions the client
   programmer might need to take in order to successfully try again.


   For more information, see the Errors section at the bottom of this topic, as well as Common Errors.

  get-dash-streaming-session-url-request - `com.amazonaws.services.kinesisvideo.model.GetDASHStreamingSessionURLRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDASHStreamingSessionURL operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisvideo.model.GetDASHStreamingSessionURLResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisVideoArchivedMediaAsync this ^com.amazonaws.services.kinesisvideo.model.GetDASHStreamingSessionURLRequest get-dash-streaming-session-url-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDASHStreamingSessionURLAsync get-dash-streaming-session-url-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisVideoArchivedMediaAsync this ^com.amazonaws.services.kinesisvideo.model.GetDASHStreamingSessionURLRequest get-dash-streaming-session-url-request]
    (-> this (.getDASHStreamingSessionURLAsync get-dash-streaming-session-url-request))))

(defn get-hls-streaming-session-url-async
  "Retrieves an HTTP Live Streaming (HLS) URL for the stream. You can then open the URL in a browser or media player
   to view the stream contents.


   Both the StreamName and the StreamARN parameters are optional, but you must specify
   either the StreamName or the StreamARN when invoking this API operation.


   An Amazon Kinesis video stream has the following requirements for providing data through HLS:




   The media must contain h.264 or h.265 encoded video and, optionally, AAC encoded audio. Specifically, the codec
   id of track 1 should be V_MPEG/ISO/AVC (for h.264) or V_MPEG/ISO/HEVC (for h.265).
   Optionally, the codec id of track 2 should be A_AAC.




   Data retention must be greater than 0.




   The video track of each fragment must contain codec private data in the Advanced Video Coding (AVC) for H.264
   format or HEVC for H.265 format (MPEG-4 specification ISO/IEC
   14496-15). For information about adapting stream data to a given format, see NAL Adaptation
   Flags.




   The audio track (if present) of each fragment must contain codec private data in the AAC format (AAC specification ISO/IEC 13818-7).




   Kinesis Video Streams HLS sessions contain fragments in the fragmented MPEG-4 form (also called fMP4 or CMAF) or
   the MPEG-2 form (also called TS chunks, which the HLS specification also supports). For more information about
   HLS fragment types, see the HLS
   specification.


   The following procedure shows how to use HLS with Kinesis Video Streams:




   Get an endpoint using GetDataEndpoint,
   specifying GET_HLS_STREAMING_SESSION_URL for the APIName parameter.




   Retrieve the HLS URL using GetHLSStreamingSessionURL. Kinesis Video Streams creates an HLS streaming
   session to be used for accessing content in a stream using the HLS protocol.
   GetHLSStreamingSessionURL returns an authenticated URL (that includes an encrypted session token)
   for the session's HLS master playlist (the root resource needed for streaming with HLS).



   Don't share or store this token where an unauthorized entity could access it. The token provides access to the
   content of the stream. Safeguard the token with the same measures that you would use with your AWS credentials.



   The media that is made available through the playlist consists only of the requested stream, time range, and
   format. No other media data (such as frames outside the requested window or alternate bitrates) is made
   available.




   Provide the URL (containing the encrypted session token) for the HLS master playlist to a media player that
   supports the HLS protocol. Kinesis Video Streams makes the HLS media playlist, initialization fragment, and media
   fragments available through the master playlist URL. The initialization fragment contains the codec private data
   for the stream, and other data needed to set up the video or audio decoder and renderer. The media fragments
   contain H.264-encoded video frames or AAC-encoded audio samples.




   The media player receives the authenticated URL and requests stream metadata and media data normally. When the
   media player requests data, it calls the following actions:




   GetHLSMasterPlaylist: Retrieves an HLS master playlist, which contains a URL for the
   GetHLSMediaPlaylist action for each track, and additional metadata for the media player, including
   estimated bitrate and resolution.




   GetHLSMediaPlaylist: Retrieves an HLS media playlist, which contains a URL to access the MP4
   initialization fragment with the GetMP4InitFragment action, and URLs to access the MP4 media
   fragments with the GetMP4MediaFragment actions. The HLS media playlist also contains metadata about
   the stream that the player needs to play it, such as whether the PlaybackMode is LIVE
   or ON_DEMAND. The HLS media playlist is typically static for sessions with a
   PlaybackType of ON_DEMAND. The HLS media playlist is continually updated with new
   fragments for sessions with a PlaybackType of LIVE. There is a distinct HLS media
   playlist for the video track and the audio track (if applicable) that contains MP4 media URLs for the specific
   track.




   GetMP4InitFragment: Retrieves the MP4 initialization fragment. The media player typically loads the
   initialization fragment before loading any media fragments. This fragment contains the \"fytp\" and \"
   moov\" MP4 atoms, and the child atoms that are needed to initialize the media player decoder.


   The initialization fragment does not correspond to a fragment in a Kinesis video stream. It contains only the
   codec private data for the stream and respective track, which the media player needs to decode the media frames.




   GetMP4MediaFragment: Retrieves MP4 media fragments. These fragments contain the \"moof\" and \"
   mdat\" MP4 atoms and their child atoms, containing the encoded fragment's media frames and their
   timestamps.



   After the first media fragment is made available in a streaming session, any fragments that don't contain the
   same codec private data cause an error to be returned when those different media fragments are loaded. Therefore,
   the codec private data should not change between fragments in a session. This also means that the session fails
   if the fragments in a stream change from having only video to having both audio and video.



   Data retrieved with this action is billable. See Pricing for details.




   GetTSFragment: Retrieves MPEG TS fragments containing both initialization and media data for all tracks in
   the stream.



   If the ContainerFormat is MPEG_TS, this API is used instead of
   GetMP4InitFragment and GetMP4MediaFragment to retrieve stream media.



   Data retrieved with this action is billable. For more information, see Kinesis Video Streams pricing.







   The following restrictions apply to HLS sessions:




   A streaming session URL should not be shared between players. The service might throttle a session if multiple
   media players are sharing it. For connection limits, see Kinesis Video Streams Limits.




   A Kinesis video stream can have a maximum of ten active HLS streaming sessions. If a new session is created when
   the maximum number of sessions is already active, the oldest (earliest created) session is closed. The number of
   active GetMedia connections on a Kinesis video stream does not count against this limit, and the
   number of active HLS sessions does not count against the active GetMedia connection limit.



   The maximum limits for active HLS and MPEG-DASH streaming sessions are independent of each other.





   You can monitor the amount of data that the media player consumes by monitoring the
   GetMP4MediaFragment.OutgoingBytes Amazon CloudWatch metric. For information about using CloudWatch
   to monitor Kinesis Video Streams, see Monitoring Kinesis Video
   Streams. For pricing information, see Amazon
   Kinesis Video Streams Pricing and AWS Pricing. Charges for both
   HLS sessions and outgoing AWS data apply.


   For more information about HLS, see HTTP Live Streaming on
   the Apple Developer site.



   If an error is thrown after invoking a Kinesis Video Streams archived media API, in addition to the HTTP status
   code and the response body, it includes the following pieces of information:




   x-amz-ErrorType HTTP header – contains a more specific error type in addition to what the HTTP
   status code provides.




   x-amz-RequestId HTTP header – if you want to report an issue to AWS, the support team can better
   diagnose the problem if given the Request Id.




   Both the HTTP status code and the ErrorType header can be utilized to make programmatic decisions about whether
   errors are retry-able and under what conditions, as well as provide information on what actions the client
   programmer might need to take in order to successfully try again.


   For more information, see the Errors section at the bottom of this topic, as well as Common Errors.

  get-hls-streaming-session-url-request - `com.amazonaws.services.kinesisvideo.model.GetHLSStreamingSessionURLRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetHLSStreamingSessionURL operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisvideo.model.GetHLSStreamingSessionURLResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisVideoArchivedMediaAsync this ^com.amazonaws.services.kinesisvideo.model.GetHLSStreamingSessionURLRequest get-hls-streaming-session-url-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getHLSStreamingSessionURLAsync get-hls-streaming-session-url-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisVideoArchivedMediaAsync this ^com.amazonaws.services.kinesisvideo.model.GetHLSStreamingSessionURLRequest get-hls-streaming-session-url-request]
    (-> this (.getHLSStreamingSessionURLAsync get-hls-streaming-session-url-request))))

(defn get-media-for-fragment-list-async
  "Gets media for a list of fragments (specified by fragment number) from the archived data in an Amazon Kinesis
   video stream.



   You must first call the GetDataEndpoint API to get an endpoint. Then send the
   GetMediaForFragmentList requests to this endpoint using the --endpoint-url parameter.



   The following limits apply when using the GetMediaForFragmentList API:




   A client can call GetMediaForFragmentList up to five times per second per stream.




   Kinesis Video Streams sends media data at a rate of up to 25 megabytes per second (or 200 megabits per second)
   during a GetMediaForFragmentList session.





   If an error is thrown after invoking a Kinesis Video Streams archived media API, in addition to the HTTP status
   code and the response body, it includes the following pieces of information:




   x-amz-ErrorType HTTP header – contains a more specific error type in addition to what the HTTP
   status code provides.




   x-amz-RequestId HTTP header – if you want to report an issue to AWS, the support team can better
   diagnose the problem if given the Request Id.




   Both the HTTP status code and the ErrorType header can be utilized to make programmatic decisions about whether
   errors are retry-able and under what conditions, as well as provide information on what actions the client
   programmer might need to take in order to successfully try again.


   For more information, see the Errors section at the bottom of this topic, as well as Common Errors.

  get-media-for-fragment-list-request - `com.amazonaws.services.kinesisvideo.model.GetMediaForFragmentListRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMediaForFragmentList operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisvideo.model.GetMediaForFragmentListResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisVideoArchivedMediaAsync this ^com.amazonaws.services.kinesisvideo.model.GetMediaForFragmentListRequest get-media-for-fragment-list-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMediaForFragmentListAsync get-media-for-fragment-list-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisVideoArchivedMediaAsync this ^com.amazonaws.services.kinesisvideo.model.GetMediaForFragmentListRequest get-media-for-fragment-list-request]
    (-> this (.getMediaForFragmentListAsync get-media-for-fragment-list-request))))

(defn list-fragments-async
  "Returns a list of Fragment objects from the specified stream and timestamp range within the archived data.


   Listing fragments is eventually consistent. This means that even if the producer receives an acknowledgment that
   a fragment is persisted, the result might not be returned immediately from a request to
   ListFragments. However, results are typically available in less than one second.



   You must first call the GetDataEndpoint API to get an endpoint. Then send the
   ListFragments requests to this endpoint using the --endpoint-url parameter.



   If an error is thrown after invoking a Kinesis Video Streams archived media API, in addition to the HTTP status
   code and the response body, it includes the following pieces of information:




   x-amz-ErrorType HTTP header – contains a more specific error type in addition to what the HTTP
   status code provides.




   x-amz-RequestId HTTP header – if you want to report an issue to AWS, the support team can better
   diagnose the problem if given the Request Id.




   Both the HTTP status code and the ErrorType header can be utilized to make programmatic decisions about whether
   errors are retry-able and under what conditions, as well as provide information on what actions the client
   programmer might need to take in order to successfully try again.


   For more information, see the Errors section at the bottom of this topic, as well as Common Errors.

  list-fragments-request - `com.amazonaws.services.kinesisvideo.model.ListFragmentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListFragments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.kinesisvideo.model.ListFragmentsResult>`"
  (^java.util.concurrent.Future [^AmazonKinesisVideoArchivedMediaAsync this ^com.amazonaws.services.kinesisvideo.model.ListFragmentsRequest list-fragments-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listFragmentsAsync list-fragments-request async-handler)))
  (^java.util.concurrent.Future [^AmazonKinesisVideoArchivedMediaAsync this ^com.amazonaws.services.kinesisvideo.model.ListFragmentsRequest list-fragments-request]
    (-> this (.listFragmentsAsync list-fragments-request))))

