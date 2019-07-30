(ns com.amazonaws.services.polly.AmazonPolly
  "Interface for accessing Amazon Polly.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonPolly instead.



  Amazon Polly is a web service that makes it easy to synthesize speech from text.


  The Amazon Polly service provides API operations for synthesizing high-quality speech from plain text and Speech
  Synthesis Markup Language (SSML), along with managing pronunciations lexicons that enable you to get the best results
  for your application domain."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.polly AmazonPolly]))

(defn list-speech-synthesis-tasks
  "Returns a list of SpeechSynthesisTask objects ordered by their creation date. This operation can filter the tasks
   by their status, for example, allowing users to list only tasks that are completed.

  list-speech-synthesis-tasks-request - `com.amazonaws.services.polly.model.ListSpeechSynthesisTasksRequest`

  returns: Result of the ListSpeechSynthesisTasks operation returned by the service. - `com.amazonaws.services.polly.model.ListSpeechSynthesisTasksResult`

  throws: com.amazonaws.services.polly.model.InvalidNextTokenException - The NextToken is invalid. Verify that it's spelled correctly, and then try again."
  (^com.amazonaws.services.polly.model.ListSpeechSynthesisTasksResult [^AmazonPolly this ^com.amazonaws.services.polly.model.ListSpeechSynthesisTasksRequest list-speech-synthesis-tasks-request]
    (-> this (.listSpeechSynthesisTasks list-speech-synthesis-tasks-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AmazonPolly this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonPolly this]
    (-> this (.shutdown))))

(defn get-lexicon
  "Returns the content of the specified pronunciation lexicon stored in an AWS Region. For more information, see Managing Lexicons.

  get-lexicon-request - `com.amazonaws.services.polly.model.GetLexiconRequest`

  returns: Result of the GetLexicon operation returned by the service. - `com.amazonaws.services.polly.model.GetLexiconResult`

  throws: com.amazonaws.services.polly.model.LexiconNotFoundException - Amazon Polly can't find the specified lexicon. This could be caused by a lexicon that is missing, its name is misspelled or specifying a lexicon that is in a different region. Verify that the lexicon exists, is in the region (see ListLexicons) and that you spelled its name is spelled correctly. Then try again."
  (^com.amazonaws.services.polly.model.GetLexiconResult [^AmazonPolly this ^com.amazonaws.services.polly.model.GetLexiconRequest get-lexicon-request]
    (-> this (.getLexicon get-lexicon-request))))

(defn put-lexicon
  "Stores a pronunciation lexicon in an AWS Region. If a lexicon with the same name already exists in the region, it
   is overwritten by the new lexicon. Lexicon operations have eventual consistency, therefore, it might take some
   time before the lexicon is available to the SynthesizeSpeech operation.


   For more information, see Managing
   Lexicons.

  put-lexicon-request - `com.amazonaws.services.polly.model.PutLexiconRequest`

  returns: Result of the PutLexicon operation returned by the service. - `com.amazonaws.services.polly.model.PutLexiconResult`

  throws: com.amazonaws.services.polly.model.InvalidLexiconException - Amazon Polly can't find the specified lexicon. Verify that the lexicon's name is spelled correctly, and then try again."
  (^com.amazonaws.services.polly.model.PutLexiconResult [^AmazonPolly this ^com.amazonaws.services.polly.model.PutLexiconRequest put-lexicon-request]
    (-> this (.putLexicon put-lexicon-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"polly.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"polly.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AmazonPolly this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn synthesize-speech
  "Synthesizes UTF-8 input, plain text or SSML, to a stream of bytes. SSML input must be valid, well-formed SSML.
   Some alphabets might not be available with all the voices (for example, Cyrillic might not be read at all by
   English voices) unless phoneme mapping is used. For more information, see How it Works.

  synthesize-speech-request - `com.amazonaws.services.polly.model.SynthesizeSpeechRequest`

  returns: Result of the SynthesizeSpeech operation returned by the service. - `com.amazonaws.services.polly.model.SynthesizeSpeechResult`

  throws: com.amazonaws.services.polly.model.TextLengthExceededException - The value of the \"Text\" parameter is longer than the accepted limits. For the SynthesizeSpeech API, the limit for input text is a maximum of 6000 characters total, of which no more than 3000 can be billed characters. For the StartSpeechSynthesisTask API, the maximum is 200,000 characters, of which no more than 100,000 can be billed characters. SSML tags are not counted as billed characters."
  (^com.amazonaws.services.polly.model.SynthesizeSpeechResult [^AmazonPolly this ^com.amazonaws.services.polly.model.SynthesizeSpeechRequest synthesize-speech-request]
    (-> this (.synthesizeSpeech synthesize-speech-request))))

(defn describe-voices
  "Returns the list of voices that are available for use when requesting speech synthesis. Each voice speaks a
   specified language, is either male or female, and is identified by an ID, which is the ASCII version of the voice
   name.


   When synthesizing speech ( SynthesizeSpeech ), you provide the voice ID for the voice you want from
   the list of voices returned by DescribeVoices.


   For example, you want your news reader application to read news in a specific language, but giving a user the
   option to choose the voice. Using the DescribeVoices operation you can provide the user with a list
   of available voices to select from.


   You can optionally specify a language code to filter the available voices. For example, if you specify
   en-US, the operation returns a list of all available US English voices.


   This operation requires permissions to perform the polly:DescribeVoices action.

  describe-voices-request - `com.amazonaws.services.polly.model.DescribeVoicesRequest`

  returns: Result of the DescribeVoices operation returned by the service. - `com.amazonaws.services.polly.model.DescribeVoicesResult`

  throws: com.amazonaws.services.polly.model.InvalidNextTokenException - The NextToken is invalid. Verify that it's spelled correctly, and then try again."
  (^com.amazonaws.services.polly.model.DescribeVoicesResult [^AmazonPolly this ^com.amazonaws.services.polly.model.DescribeVoicesRequest describe-voices-request]
    (-> this (.describeVoices describe-voices-request))))

(defn get-speech-synthesis-task
  "Retrieves a specific SpeechSynthesisTask object based on its TaskID. This object contains information about the
   given speech synthesis task, including the status of the task, and a link to the S3 bucket containing the output
   of the task.

  get-speech-synthesis-task-request - `com.amazonaws.services.polly.model.GetSpeechSynthesisTaskRequest`

  returns: Result of the GetSpeechSynthesisTask operation returned by the service. - `com.amazonaws.services.polly.model.GetSpeechSynthesisTaskResult`

  throws: com.amazonaws.services.polly.model.InvalidTaskIdException - The provided Task ID is not valid. Please provide a valid Task ID and try again."
  (^com.amazonaws.services.polly.model.GetSpeechSynthesisTaskResult [^AmazonPolly this ^com.amazonaws.services.polly.model.GetSpeechSynthesisTaskRequest get-speech-synthesis-task-request]
    (-> this (.getSpeechSynthesisTask get-speech-synthesis-task-request))))

(defn delete-lexicon
  "Deletes the specified pronunciation lexicon stored in an AWS Region. A lexicon which has been deleted is not
   available for speech synthesis, nor is it possible to retrieve it using either the GetLexicon or
   ListLexicon APIs.


   For more information, see Managing
   Lexicons.

  delete-lexicon-request - `com.amazonaws.services.polly.model.DeleteLexiconRequest`

  returns: Result of the DeleteLexicon operation returned by the service. - `com.amazonaws.services.polly.model.DeleteLexiconResult`

  throws: com.amazonaws.services.polly.model.LexiconNotFoundException - Amazon Polly can't find the specified lexicon. This could be caused by a lexicon that is missing, its name is misspelled or specifying a lexicon that is in a different region. Verify that the lexicon exists, is in the region (see ListLexicons) and that you spelled its name is spelled correctly. Then try again."
  (^com.amazonaws.services.polly.model.DeleteLexiconResult [^AmazonPolly this ^com.amazonaws.services.polly.model.DeleteLexiconRequest delete-lexicon-request]
    (-> this (.deleteLexicon delete-lexicon-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonPolly this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn presigners
  "AmazonPollyPresigners contains extension methods for presigning
   certain requests. The presigner will use the endpoint and credentials currently configured in the client.

  returns: Presigners utility object. - `com.amazonaws.services.polly.presign.AmazonPollyPresigners`"
  (^com.amazonaws.services.polly.presign.AmazonPollyPresigners [^AmazonPolly this]
    (-> this (.presigners))))

(defn list-lexicons
  "Returns a list of pronunciation lexicons stored in an AWS Region. For more information, see Managing Lexicons.

  list-lexicons-request - `com.amazonaws.services.polly.model.ListLexiconsRequest`

  returns: Result of the ListLexicons operation returned by the service. - `com.amazonaws.services.polly.model.ListLexiconsResult`

  throws: com.amazonaws.services.polly.model.InvalidNextTokenException - The NextToken is invalid. Verify that it's spelled correctly, and then try again."
  (^com.amazonaws.services.polly.model.ListLexiconsResult [^AmazonPolly this ^com.amazonaws.services.polly.model.ListLexiconsRequest list-lexicons-request]
    (-> this (.listLexicons list-lexicons-request))))

(defn start-speech-synthesis-task
  "Allows the creation of an asynchronous synthesis task, by starting a new SpeechSynthesisTask. This
   operation requires all the standard information needed for speech synthesis, plus the name of an Amazon S3 bucket
   for the service to store the output of the synthesis task and two optional parameters (OutputS3KeyPrefix and
   SnsTopicArn). Once the synthesis task is created, this operation will return a SpeechSynthesisTask object, which
   will include an identifier of this task as well as the current status.

  start-speech-synthesis-task-request - `com.amazonaws.services.polly.model.StartSpeechSynthesisTaskRequest`

  returns: Result of the StartSpeechSynthesisTask operation returned by the service. - `com.amazonaws.services.polly.model.StartSpeechSynthesisTaskResult`

  throws: com.amazonaws.services.polly.model.InvalidS3KeyException - The provided Amazon S3 key prefix is invalid. Please provide a valid S3 object key name."
  (^com.amazonaws.services.polly.model.StartSpeechSynthesisTaskResult [^AmazonPolly this ^com.amazonaws.services.polly.model.StartSpeechSynthesisTaskRequest start-speech-synthesis-task-request]
    (-> this (.startSpeechSynthesisTask start-speech-synthesis-task-request))))

