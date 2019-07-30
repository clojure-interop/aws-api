(ns com.amazonaws.services.polly.AmazonPollyAsync
  "Interface for accessing Amazon Polly asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonPollyAsync instead.



  Amazon Polly is a web service that makes it easy to synthesize speech from text.


  The Amazon Polly service provides API operations for synthesizing high-quality speech from plain text and Speech
  Synthesis Markup Language (SSML), along with managing pronunciations lexicons that enable you to get the best results
  for your application domain."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.polly AmazonPollyAsync]))

(defn synthesize-speech-async
  "Synthesizes UTF-8 input, plain text or SSML, to a stream of bytes. SSML input must be valid, well-formed SSML.
   Some alphabets might not be available with all the voices (for example, Cyrillic might not be read at all by
   English voices) unless phoneme mapping is used. For more information, see How it Works.

  synthesize-speech-request - `com.amazonaws.services.polly.model.SynthesizeSpeechRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SynthesizeSpeech operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.polly.model.SynthesizeSpeechResult>`"
  (^java.util.concurrent.Future [^AmazonPollyAsync this ^com.amazonaws.services.polly.model.SynthesizeSpeechRequest synthesize-speech-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.synthesizeSpeechAsync synthesize-speech-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPollyAsync this ^com.amazonaws.services.polly.model.SynthesizeSpeechRequest synthesize-speech-request]
    (-> this (.synthesizeSpeechAsync synthesize-speech-request))))

(defn put-lexicon-async
  "Stores a pronunciation lexicon in an AWS Region. If a lexicon with the same name already exists in the region, it
   is overwritten by the new lexicon. Lexicon operations have eventual consistency, therefore, it might take some
   time before the lexicon is available to the SynthesizeSpeech operation.


   For more information, see Managing
   Lexicons.

  put-lexicon-request - `com.amazonaws.services.polly.model.PutLexiconRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutLexicon operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.polly.model.PutLexiconResult>`"
  (^java.util.concurrent.Future [^AmazonPollyAsync this ^com.amazonaws.services.polly.model.PutLexiconRequest put-lexicon-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putLexiconAsync put-lexicon-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPollyAsync this ^com.amazonaws.services.polly.model.PutLexiconRequest put-lexicon-request]
    (-> this (.putLexiconAsync put-lexicon-request))))

(defn start-speech-synthesis-task-async
  "Allows the creation of an asynchronous synthesis task, by starting a new SpeechSynthesisTask. This
   operation requires all the standard information needed for speech synthesis, plus the name of an Amazon S3 bucket
   for the service to store the output of the synthesis task and two optional parameters (OutputS3KeyPrefix and
   SnsTopicArn). Once the synthesis task is created, this operation will return a SpeechSynthesisTask object, which
   will include an identifier of this task as well as the current status.

  start-speech-synthesis-task-request - `com.amazonaws.services.polly.model.StartSpeechSynthesisTaskRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartSpeechSynthesisTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.polly.model.StartSpeechSynthesisTaskResult>`"
  (^java.util.concurrent.Future [^AmazonPollyAsync this ^com.amazonaws.services.polly.model.StartSpeechSynthesisTaskRequest start-speech-synthesis-task-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startSpeechSynthesisTaskAsync start-speech-synthesis-task-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPollyAsync this ^com.amazonaws.services.polly.model.StartSpeechSynthesisTaskRequest start-speech-synthesis-task-request]
    (-> this (.startSpeechSynthesisTaskAsync start-speech-synthesis-task-request))))

(defn get-speech-synthesis-task-async
  "Retrieves a specific SpeechSynthesisTask object based on its TaskID. This object contains information about the
   given speech synthesis task, including the status of the task, and a link to the S3 bucket containing the output
   of the task.

  get-speech-synthesis-task-request - `com.amazonaws.services.polly.model.GetSpeechSynthesisTaskRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSpeechSynthesisTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.polly.model.GetSpeechSynthesisTaskResult>`"
  (^java.util.concurrent.Future [^AmazonPollyAsync this ^com.amazonaws.services.polly.model.GetSpeechSynthesisTaskRequest get-speech-synthesis-task-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSpeechSynthesisTaskAsync get-speech-synthesis-task-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPollyAsync this ^com.amazonaws.services.polly.model.GetSpeechSynthesisTaskRequest get-speech-synthesis-task-request]
    (-> this (.getSpeechSynthesisTaskAsync get-speech-synthesis-task-request))))

(defn delete-lexicon-async
  "Deletes the specified pronunciation lexicon stored in an AWS Region. A lexicon which has been deleted is not
   available for speech synthesis, nor is it possible to retrieve it using either the GetLexicon or
   ListLexicon APIs.


   For more information, see Managing
   Lexicons.

  delete-lexicon-request - `com.amazonaws.services.polly.model.DeleteLexiconRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLexicon operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.polly.model.DeleteLexiconResult>`"
  (^java.util.concurrent.Future [^AmazonPollyAsync this ^com.amazonaws.services.polly.model.DeleteLexiconRequest delete-lexicon-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLexiconAsync delete-lexicon-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPollyAsync this ^com.amazonaws.services.polly.model.DeleteLexiconRequest delete-lexicon-request]
    (-> this (.deleteLexiconAsync delete-lexicon-request))))

(defn list-speech-synthesis-tasks-async
  "Returns a list of SpeechSynthesisTask objects ordered by their creation date. This operation can filter the tasks
   by their status, for example, allowing users to list only tasks that are completed.

  list-speech-synthesis-tasks-request - `com.amazonaws.services.polly.model.ListSpeechSynthesisTasksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSpeechSynthesisTasks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.polly.model.ListSpeechSynthesisTasksResult>`"
  (^java.util.concurrent.Future [^AmazonPollyAsync this ^com.amazonaws.services.polly.model.ListSpeechSynthesisTasksRequest list-speech-synthesis-tasks-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSpeechSynthesisTasksAsync list-speech-synthesis-tasks-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPollyAsync this ^com.amazonaws.services.polly.model.ListSpeechSynthesisTasksRequest list-speech-synthesis-tasks-request]
    (-> this (.listSpeechSynthesisTasksAsync list-speech-synthesis-tasks-request))))

(defn list-lexicons-async
  "Returns a list of pronunciation lexicons stored in an AWS Region. For more information, see Managing Lexicons.

  list-lexicons-request - `com.amazonaws.services.polly.model.ListLexiconsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListLexicons operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.polly.model.ListLexiconsResult>`"
  (^java.util.concurrent.Future [^AmazonPollyAsync this ^com.amazonaws.services.polly.model.ListLexiconsRequest list-lexicons-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listLexiconsAsync list-lexicons-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPollyAsync this ^com.amazonaws.services.polly.model.ListLexiconsRequest list-lexicons-request]
    (-> this (.listLexiconsAsync list-lexicons-request))))

(defn get-lexicon-async
  "Returns the content of the specified pronunciation lexicon stored in an AWS Region. For more information, see Managing Lexicons.

  get-lexicon-request - `com.amazonaws.services.polly.model.GetLexiconRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLexicon operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.polly.model.GetLexiconResult>`"
  (^java.util.concurrent.Future [^AmazonPollyAsync this ^com.amazonaws.services.polly.model.GetLexiconRequest get-lexicon-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLexiconAsync get-lexicon-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPollyAsync this ^com.amazonaws.services.polly.model.GetLexiconRequest get-lexicon-request]
    (-> this (.getLexiconAsync get-lexicon-request))))

(defn describe-voices-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVoices operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.polly.model.DescribeVoicesResult>`"
  (^java.util.concurrent.Future [^AmazonPollyAsync this ^com.amazonaws.services.polly.model.DescribeVoicesRequest describe-voices-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVoicesAsync describe-voices-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPollyAsync this ^com.amazonaws.services.polly.model.DescribeVoicesRequest describe-voices-request]
    (-> this (.describeVoicesAsync describe-voices-request))))

