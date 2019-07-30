(ns com.amazonaws.services.polly.AmazonPollyClient
  "Client for accessing Amazon Polly. All service calls made using this client are blocking, and will not return until
  the service call completes.


  Amazon Polly is a web service that makes it easy to synthesize speech from text.


  The Amazon Polly service provides API operations for synthesizing high-quality speech from plain text and Speech
  Synthesis Markup Language (SSML), along with managing pronunciations lexicons that enable you to get the best results
  for your application domain."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.polly AmazonPollyClient]))

(defn ->amazon-polly-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to Amazon Polly (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AmazonPollyClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AmazonPollyClient aws-credentials-provider client-configuration request-metric-collector))
  (^AmazonPollyClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonPollyClient aws-credentials client-configuration))
  (^AmazonPollyClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonPollyClient client-configuration))
  (^AmazonPollyClient []
    (new AmazonPollyClient )))

(defn *builder
  "returns: `com.amazonaws.services.polly.AmazonPollyClientBuilder`"
  (^com.amazonaws.services.polly.AmazonPollyClientBuilder []
    (AmazonPollyClient/builder )))

(defn list-speech-synthesis-tasks
  "Returns a list of SpeechSynthesisTask objects ordered by their creation date. This operation can filter the tasks
   by their status, for example, allowing users to list only tasks that are completed.

  request - `com.amazonaws.services.polly.model.ListSpeechSynthesisTasksRequest`

  returns: Result of the ListSpeechSynthesisTasks operation returned by the service. - `com.amazonaws.services.polly.model.ListSpeechSynthesisTasksResult`

  throws: com.amazonaws.services.polly.model.InvalidNextTokenException - The NextToken is invalid. Verify that it's spelled correctly, and then try again."
  (^com.amazonaws.services.polly.model.ListSpeechSynthesisTasksResult [^AmazonPollyClient this ^com.amazonaws.services.polly.model.ListSpeechSynthesisTasksRequest request]
    (-> this (.listSpeechSynthesisTasks request))))

(defn get-lexicon
  "Returns the content of the specified pronunciation lexicon stored in an AWS Region. For more information, see Managing Lexicons.

  request - `com.amazonaws.services.polly.model.GetLexiconRequest`

  returns: Result of the GetLexicon operation returned by the service. - `com.amazonaws.services.polly.model.GetLexiconResult`

  throws: com.amazonaws.services.polly.model.LexiconNotFoundException - Amazon Polly can't find the specified lexicon. This could be caused by a lexicon that is missing, its name is misspelled or specifying a lexicon that is in a different region. Verify that the lexicon exists, is in the region (see ListLexicons) and that you spelled its name is spelled correctly. Then try again."
  (^com.amazonaws.services.polly.model.GetLexiconResult [^AmazonPollyClient this ^com.amazonaws.services.polly.model.GetLexiconRequest request]
    (-> this (.getLexicon request))))

(defn put-lexicon
  "Stores a pronunciation lexicon in an AWS Region. If a lexicon with the same name already exists in the region, it
   is overwritten by the new lexicon. Lexicon operations have eventual consistency, therefore, it might take some
   time before the lexicon is available to the SynthesizeSpeech operation.


   For more information, see Managing
   Lexicons.

  request - `com.amazonaws.services.polly.model.PutLexiconRequest`

  returns: Result of the PutLexicon operation returned by the service. - `com.amazonaws.services.polly.model.PutLexiconResult`

  throws: com.amazonaws.services.polly.model.InvalidLexiconException - Amazon Polly can't find the specified lexicon. Verify that the lexicon's name is spelled correctly, and then try again."
  (^com.amazonaws.services.polly.model.PutLexiconResult [^AmazonPollyClient this ^com.amazonaws.services.polly.model.PutLexiconRequest request]
    (-> this (.putLexicon request))))

(defn synthesize-speech
  "Synthesizes UTF-8 input, plain text or SSML, to a stream of bytes. SSML input must be valid, well-formed SSML.
   Some alphabets might not be available with all the voices (for example, Cyrillic might not be read at all by
   English voices) unless phoneme mapping is used. For more information, see How it Works.

  request - `com.amazonaws.services.polly.model.SynthesizeSpeechRequest`

  returns: Result of the SynthesizeSpeech operation returned by the service. - `com.amazonaws.services.polly.model.SynthesizeSpeechResult`

  throws: com.amazonaws.services.polly.model.TextLengthExceededException - The value of the \"Text\" parameter is longer than the accepted limits. For the SynthesizeSpeech API, the limit for input text is a maximum of 6000 characters total, of which no more than 3000 can be billed characters. For the StartSpeechSynthesisTask API, the maximum is 200,000 characters, of which no more than 100,000 can be billed characters. SSML tags are not counted as billed characters."
  (^com.amazonaws.services.polly.model.SynthesizeSpeechResult [^AmazonPollyClient this ^com.amazonaws.services.polly.model.SynthesizeSpeechRequest request]
    (-> this (.synthesizeSpeech request))))

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

  request - `com.amazonaws.services.polly.model.DescribeVoicesRequest`

  returns: Result of the DescribeVoices operation returned by the service. - `com.amazonaws.services.polly.model.DescribeVoicesResult`

  throws: com.amazonaws.services.polly.model.InvalidNextTokenException - The NextToken is invalid. Verify that it's spelled correctly, and then try again."
  (^com.amazonaws.services.polly.model.DescribeVoicesResult [^AmazonPollyClient this ^com.amazonaws.services.polly.model.DescribeVoicesRequest request]
    (-> this (.describeVoices request))))

(defn get-speech-synthesis-task
  "Retrieves a specific SpeechSynthesisTask object based on its TaskID. This object contains information about the
   given speech synthesis task, including the status of the task, and a link to the S3 bucket containing the output
   of the task.

  request - `com.amazonaws.services.polly.model.GetSpeechSynthesisTaskRequest`

  returns: Result of the GetSpeechSynthesisTask operation returned by the service. - `com.amazonaws.services.polly.model.GetSpeechSynthesisTaskResult`

  throws: com.amazonaws.services.polly.model.InvalidTaskIdException - The provided Task ID is not valid. Please provide a valid Task ID and try again."
  (^com.amazonaws.services.polly.model.GetSpeechSynthesisTaskResult [^AmazonPollyClient this ^com.amazonaws.services.polly.model.GetSpeechSynthesisTaskRequest request]
    (-> this (.getSpeechSynthesisTask request))))

(defn delete-lexicon
  "Deletes the specified pronunciation lexicon stored in an AWS Region. A lexicon which has been deleted is not
   available for speech synthesis, nor is it possible to retrieve it using either the GetLexicon or
   ListLexicon APIs.


   For more information, see Managing
   Lexicons.

  request - `com.amazonaws.services.polly.model.DeleteLexiconRequest`

  returns: Result of the DeleteLexicon operation returned by the service. - `com.amazonaws.services.polly.model.DeleteLexiconResult`

  throws: com.amazonaws.services.polly.model.LexiconNotFoundException - Amazon Polly can't find the specified lexicon. This could be caused by a lexicon that is missing, its name is misspelled or specifying a lexicon that is in a different region. Verify that the lexicon exists, is in the region (see ListLexicons) and that you spelled its name is spelled correctly. Then try again."
  (^com.amazonaws.services.polly.model.DeleteLexiconResult [^AmazonPollyClient this ^com.amazonaws.services.polly.model.DeleteLexiconRequest request]
    (-> this (.deleteLexicon request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonPollyClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn presigners
  "Description copied from interface: AmazonPolly

  returns: Presigners utility object. - `com.amazonaws.services.polly.presign.AmazonPollyPresigners`"
  (^com.amazonaws.services.polly.presign.AmazonPollyPresigners [^AmazonPollyClient this]
    (-> this (.presigners))))

(defn list-lexicons
  "Returns a list of pronunciation lexicons stored in an AWS Region. For more information, see Managing Lexicons.

  request - `com.amazonaws.services.polly.model.ListLexiconsRequest`

  returns: Result of the ListLexicons operation returned by the service. - `com.amazonaws.services.polly.model.ListLexiconsResult`

  throws: com.amazonaws.services.polly.model.InvalidNextTokenException - The NextToken is invalid. Verify that it's spelled correctly, and then try again."
  (^com.amazonaws.services.polly.model.ListLexiconsResult [^AmazonPollyClient this ^com.amazonaws.services.polly.model.ListLexiconsRequest request]
    (-> this (.listLexicons request))))

(defn start-speech-synthesis-task
  "Allows the creation of an asynchronous synthesis task, by starting a new SpeechSynthesisTask. This
   operation requires all the standard information needed for speech synthesis, plus the name of an Amazon S3 bucket
   for the service to store the output of the synthesis task and two optional parameters (OutputS3KeyPrefix and
   SnsTopicArn). Once the synthesis task is created, this operation will return a SpeechSynthesisTask object, which
   will include an identifier of this task as well as the current status.

  request - `com.amazonaws.services.polly.model.StartSpeechSynthesisTaskRequest`

  returns: Result of the StartSpeechSynthesisTask operation returned by the service. - `com.amazonaws.services.polly.model.StartSpeechSynthesisTaskResult`

  throws: com.amazonaws.services.polly.model.InvalidS3KeyException - The provided Amazon S3 key prefix is invalid. Please provide a valid S3 object key name."
  (^com.amazonaws.services.polly.model.StartSpeechSynthesisTaskResult [^AmazonPollyClient this ^com.amazonaws.services.polly.model.StartSpeechSynthesisTaskRequest request]
    (-> this (.startSpeechSynthesisTask request))))

