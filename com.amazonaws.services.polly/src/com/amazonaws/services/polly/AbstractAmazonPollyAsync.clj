(ns com.amazonaws.services.polly.AbstractAmazonPollyAsync
  "Abstract implementation of AmazonPollyAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.polly AbstractAmazonPollyAsync]))

(defn synthesize-speech-async
  "Description copied from interface: AmazonPollyAsync

  request - `com.amazonaws.services.polly.model.SynthesizeSpeechRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SynthesizeSpeech operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.polly.model.SynthesizeSpeechResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPollyAsync this ^com.amazonaws.services.polly.model.SynthesizeSpeechRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.synthesizeSpeechAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPollyAsync this ^com.amazonaws.services.polly.model.SynthesizeSpeechRequest request]
    (-> this (.synthesizeSpeechAsync request))))

(defn put-lexicon-async
  "Description copied from interface: AmazonPollyAsync

  request - `com.amazonaws.services.polly.model.PutLexiconRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutLexicon operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.polly.model.PutLexiconResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPollyAsync this ^com.amazonaws.services.polly.model.PutLexiconRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putLexiconAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPollyAsync this ^com.amazonaws.services.polly.model.PutLexiconRequest request]
    (-> this (.putLexiconAsync request))))

(defn start-speech-synthesis-task-async
  "Description copied from interface: AmazonPollyAsync

  request - `com.amazonaws.services.polly.model.StartSpeechSynthesisTaskRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartSpeechSynthesisTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.polly.model.StartSpeechSynthesisTaskResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPollyAsync this ^com.amazonaws.services.polly.model.StartSpeechSynthesisTaskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startSpeechSynthesisTaskAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPollyAsync this ^com.amazonaws.services.polly.model.StartSpeechSynthesisTaskRequest request]
    (-> this (.startSpeechSynthesisTaskAsync request))))

(defn get-speech-synthesis-task-async
  "Description copied from interface: AmazonPollyAsync

  request - `com.amazonaws.services.polly.model.GetSpeechSynthesisTaskRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSpeechSynthesisTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.polly.model.GetSpeechSynthesisTaskResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPollyAsync this ^com.amazonaws.services.polly.model.GetSpeechSynthesisTaskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSpeechSynthesisTaskAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPollyAsync this ^com.amazonaws.services.polly.model.GetSpeechSynthesisTaskRequest request]
    (-> this (.getSpeechSynthesisTaskAsync request))))

(defn delete-lexicon-async
  "Description copied from interface: AmazonPollyAsync

  request - `com.amazonaws.services.polly.model.DeleteLexiconRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLexicon operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.polly.model.DeleteLexiconResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPollyAsync this ^com.amazonaws.services.polly.model.DeleteLexiconRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLexiconAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPollyAsync this ^com.amazonaws.services.polly.model.DeleteLexiconRequest request]
    (-> this (.deleteLexiconAsync request))))

(defn list-speech-synthesis-tasks-async
  "Description copied from interface: AmazonPollyAsync

  request - `com.amazonaws.services.polly.model.ListSpeechSynthesisTasksRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSpeechSynthesisTasks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.polly.model.ListSpeechSynthesisTasksResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPollyAsync this ^com.amazonaws.services.polly.model.ListSpeechSynthesisTasksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSpeechSynthesisTasksAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPollyAsync this ^com.amazonaws.services.polly.model.ListSpeechSynthesisTasksRequest request]
    (-> this (.listSpeechSynthesisTasksAsync request))))

(defn list-lexicons-async
  "Description copied from interface: AmazonPollyAsync

  request - `com.amazonaws.services.polly.model.ListLexiconsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListLexicons operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.polly.model.ListLexiconsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPollyAsync this ^com.amazonaws.services.polly.model.ListLexiconsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listLexiconsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPollyAsync this ^com.amazonaws.services.polly.model.ListLexiconsRequest request]
    (-> this (.listLexiconsAsync request))))

(defn get-lexicon-async
  "Description copied from interface: AmazonPollyAsync

  request - `com.amazonaws.services.polly.model.GetLexiconRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLexicon operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.polly.model.GetLexiconResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPollyAsync this ^com.amazonaws.services.polly.model.GetLexiconRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLexiconAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPollyAsync this ^com.amazonaws.services.polly.model.GetLexiconRequest request]
    (-> this (.getLexiconAsync request))))

(defn describe-voices-async
  "Description copied from interface: AmazonPollyAsync

  request - `com.amazonaws.services.polly.model.DescribeVoicesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVoices operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.polly.model.DescribeVoicesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPollyAsync this ^com.amazonaws.services.polly.model.DescribeVoicesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVoicesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPollyAsync this ^com.amazonaws.services.polly.model.DescribeVoicesRequest request]
    (-> this (.describeVoicesAsync request))))

