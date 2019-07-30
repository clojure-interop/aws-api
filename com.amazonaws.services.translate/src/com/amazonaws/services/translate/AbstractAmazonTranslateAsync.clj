(ns com.amazonaws.services.translate.AbstractAmazonTranslateAsync
  "Abstract implementation of AmazonTranslateAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.translate AbstractAmazonTranslateAsync]))

(defn delete-terminology-async
  "Description copied from interface: AmazonTranslateAsync

  request - `com.amazonaws.services.translate.model.DeleteTerminologyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTerminology operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.translate.model.DeleteTerminologyResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonTranslateAsync this ^com.amazonaws.services.translate.model.DeleteTerminologyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTerminologyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonTranslateAsync this ^com.amazonaws.services.translate.model.DeleteTerminologyRequest request]
    (-> this (.deleteTerminologyAsync request))))

(defn get-terminology-async
  "Description copied from interface: AmazonTranslateAsync

  request - `com.amazonaws.services.translate.model.GetTerminologyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTerminology operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.translate.model.GetTerminologyResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonTranslateAsync this ^com.amazonaws.services.translate.model.GetTerminologyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTerminologyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonTranslateAsync this ^com.amazonaws.services.translate.model.GetTerminologyRequest request]
    (-> this (.getTerminologyAsync request))))

(defn import-terminology-async
  "Description copied from interface: AmazonTranslateAsync

  request - `com.amazonaws.services.translate.model.ImportTerminologyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportTerminology operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.translate.model.ImportTerminologyResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonTranslateAsync this ^com.amazonaws.services.translate.model.ImportTerminologyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importTerminologyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonTranslateAsync this ^com.amazonaws.services.translate.model.ImportTerminologyRequest request]
    (-> this (.importTerminologyAsync request))))

(defn list-terminologies-async
  "Description copied from interface: AmazonTranslateAsync

  request - `com.amazonaws.services.translate.model.ListTerminologiesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTerminologies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.translate.model.ListTerminologiesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonTranslateAsync this ^com.amazonaws.services.translate.model.ListTerminologiesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTerminologiesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonTranslateAsync this ^com.amazonaws.services.translate.model.ListTerminologiesRequest request]
    (-> this (.listTerminologiesAsync request))))

(defn translate-text-async
  "Description copied from interface: AmazonTranslateAsync

  request - `com.amazonaws.services.translate.model.TranslateTextRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TranslateText operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.translate.model.TranslateTextResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonTranslateAsync this ^com.amazonaws.services.translate.model.TranslateTextRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.translateTextAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonTranslateAsync this ^com.amazonaws.services.translate.model.TranslateTextRequest request]
    (-> this (.translateTextAsync request))))

